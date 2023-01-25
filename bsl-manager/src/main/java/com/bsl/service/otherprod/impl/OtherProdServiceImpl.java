package com.bsl.service.otherprod.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.bsl.common.pojo.BSLException;
import com.bsl.common.utils.BSLResult;
import com.bsl.dao.JedisClient;
import com.bsl.mapper.BslBsPlanInfoMapper;
import com.bsl.mapper.BslProductInfoMapper;
import com.bsl.mapper.BslStockChangeDetailMapper;
import com.bsl.pojo.BslBsPlanInfo;
import com.bsl.pojo.BslProductInfo;
import com.bsl.pojo.BslProductInfoExample;
import com.bsl.pojo.BslProductInfoExample.Criteria;
import com.bsl.pojo.BslStockChangeDetail;
import com.bsl.select.DictItemOperation;
import com.bsl.select.ErrorCodeInfo;
import com.bsl.select.QueryCriteria;
import com.bsl.service.otherprod.OtherProdService;
import com.bsl.service.rawmaterialsmanager.ReceiptService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.base.CaseFormat;

/**
 * 外厂来料产品库存台账实现类
 * duk-20230123
 */
@Service
public class OtherProdServiceImpl implements OtherProdService {

	@Autowired	 
	BslProductInfoMapper bslProductInfoMapper;
	@Autowired	 
	BslBsPlanInfoMapper bslBsPlanInfoMapper;
	@Autowired	 
	BslStockChangeDetailMapper bslStockChangeDetailMapper;
	@Autowired	 
	ReceiptService otherProdReceiptService;
	@Autowired
	private JedisClient jedisClient;
	
	@Value("${REDIS_NEXT_PROD_ID}")
	private String REDIS_NEXT_PROD_ID;
	
	@Value("${REDIS_NEXT_STOCKCHANGE_ID}")
	private String REDIS_NEXT_STOCKCHANGE_ID;
	

	/**
	 *根据条件查询外厂来料产品信息 
	 */
	@Override
	public BSLResult getOtherProdInfo(QueryCriteria queryCriteria) {
		//创建查询的实例，并赋值
		BslProductInfoExample bslProductInfoExample = new BslProductInfoExample();
		Criteria criteria = bslProductInfoExample.createCriteria();
		criteria.andProdTypeEqualTo(DictItemOperation.产品类型_成品);
		criteria.andProdRucEqualTo(DictItemOperation.入库仓库_委外仓);
		criteria.andProdDclFlagEqualTo(DictItemOperation.产品外协厂标志_外厂来料);
		if(!StringUtils.isBlank(queryCriteria.getProdId())){
			criteria.andProdIdLike("%"+ queryCriteria.getProdId()+"%");
		}
		if(!StringUtils.isBlank(queryCriteria.getProdPlanNo())){
			criteria.andProdPlanNoLike("%"+ queryCriteria.getProdPlanNo()+"%");
		}
		if(!StringUtils.isBlank(queryCriteria.getProdStatus())){
			criteria.andProdStatusEqualTo(queryCriteria.getProdStatus());
		}
		if(!StringUtils.isBlank(queryCriteria.getProdLuno())){
			criteria.andProdLunoLike("%"+queryCriteria.getProdLuno()+"%");
		}
		if(!StringUtils.isBlank(queryCriteria.getProdNorm())){
			criteria.andProdNormLike("%"+queryCriteria.getProdNorm()+"%");
		}
		if(!StringUtils.isBlank(queryCriteria.getProdMaterial())){
			criteria.andProdMaterialEqualTo(queryCriteria.getProdMaterial());
		}
		if(!StringUtils.isBlank(queryCriteria.getProdOutPlan())){
			criteria.andProdOutPlanLike("%"+queryCriteria.getProdOutPlan()+"%");
		}
		//开始日期结束日期
		Date dateStart = new Date();
		Date dateEnd = new Date();
		if(!StringUtils.isBlank(queryCriteria.getStartDate())){
			try {
				dateStart = DictItemOperation.日期转换实例.parse(queryCriteria.getStartDate());
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}else{
			try {
				dateStart = DictItemOperation.日期转换实例.parse("2018-01-01");
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		if(!StringUtils.isBlank(queryCriteria.getEndDate())){
			try {
				dateEnd = DictItemOperation.日期转换实例.parse(queryCriteria.getEndDate());
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}else{
			dateEnd = new Date();
		}
		criteria.andCrtDateBetween(dateStart,dateEnd);
		
		//分页处理
		PageHelper.startPage(Integer.parseInt(queryCriteria.getPage()), Integer.parseInt(queryCriteria.getRows()));
		//调用sql查询
		if(StringUtils.isBlank(queryCriteria.getSort()) || StringUtils.isBlank(queryCriteria.getOrder())){
			bslProductInfoExample.setOrderByClause("`prod_id` desc,`prod_plan_no` desc");
		}else{
			String sortSql = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, queryCriteria.getSort());
			if(!StringUtils.isBlank(sortSql)){	
				bslProductInfoExample.setOrderByClause("`"+sortSql+"` "+ queryCriteria.getOrder());
			}
		}
		List<BslProductInfo> bslProductInfos = bslProductInfoMapper.selectByExample(bslProductInfoExample);
		PageInfo<BslProductInfo> pageInfo = new PageInfo<BslProductInfo>(bslProductInfos);
		return BSLResult.ok(bslProductInfos,"otherProdServiceImpl","getOtherProdInfo",pageInfo.getTotal(),bslProductInfos);
	}

	/**
	 * 外厂来料产品入库
	 */
	@Override
	public BSLResult addOtherProdInfo(BslProductInfo bslProductInfo,int sumNum) throws Exception {
		//判断关联的原料入库单号不能为空
		if(StringUtils.isBlank(bslProductInfo.getProdPlanNo())){
			throw new BSLException(ErrorCodeInfo.错误类型_参数为空, "关联来料单号不能为空");
		}
		BslBsPlanInfo bslBsPlanInfo = bslBsPlanInfoMapper.selectByPrimaryKey(bslProductInfo.getProdPlanNo());
		if(bslBsPlanInfo == null){
			throw new BSLException(ErrorCodeInfo.错误类型_查询无记录, "根据关联来料单号查询记录为空");
		}
		
		//判断入库产品数,平分重量
		Float relWeight = bslProductInfo.getProdRelWeight()/sumNum;
		//每个产品入库的重量
		relWeight = DictItemOperation.round3(relWeight);
		bslProductInfo.setProdRelWeight(relWeight);
		
		//记录入库流水
		BslStockChangeDetail bslStockChangeDetail = new BslStockChangeDetail();
		
		//开始入库
		String prodId;
		String retProdId = "";
		for (int i = 0; i < sumNum; i++) {
			//校验完成，开始入库
			prodId = createOtherProdId();
			bslProductInfo.setProdId(prodId);
			bslProductInfo.setProdPlanNo(bslProductInfo.getProdPlanNo());
			bslProductInfo.setProdStatus(DictItemOperation.产品状态_已入库);
			bslProductInfo.setProdType(DictItemOperation.产品类型_成品);
			bslProductInfo.setProdCompany(bslBsPlanInfo.getBsCompany());
			bslProductInfo.setProdCustomer(bslBsPlanInfo.getBsCustomer());
			bslProductInfo.setProdPrintWeight(bslProductInfo.getProdRelWeight());//打印重量为实际重量
			bslProductInfo.setProdDclFlag(DictItemOperation.产品外协厂标志_外厂来料);
			bslProductInfo.setProdRuc(DictItemOperation.入库仓库_委外仓);
			bslProductInfo.setCrtDate(new Date());
			int result = bslProductInfoMapper.insert(bslProductInfo);
			if(result<0){
				throw new BSLException(ErrorCodeInfo.错误类型_数据库错误,"sql执行异常！");
			}else if(result==0){
				throw new BSLException(ErrorCodeInfo.错误类型_查询无记录,"入库失败");
			}
			
			//记录入库流水
			bslStockChangeDetail.setTransSerno(createStockChangeId());//流水
			bslStockChangeDetail.setProdId(bslProductInfo.getProdId());//产品编号
			bslStockChangeDetail.setPlanSerno(bslProductInfo.getProdPlanNo());//对应的来料单号
			bslStockChangeDetail.setTransCode(DictItemOperation.库存变动交易码_入库);//交易码
			bslStockChangeDetail.setProdType(DictItemOperation.产品类型_成品);//产品类型
			bslStockChangeDetail.setRubbishWeight(bslProductInfo.getProdRelWeight());//重量
			bslStockChangeDetail.setInputuser(bslProductInfo.getProdInputuser());//录入人
			bslStockChangeDetail.setCrtDate(new Date());
			int resultStock = bslStockChangeDetailMapper.insert(bslStockChangeDetail);
			if(resultStock<0){
				throw new BSLException(ErrorCodeInfo.错误类型_数据库错误,"sql执行异常！");
			}else if(resultStock==0){
				throw new BSLException(ErrorCodeInfo.错误类型_查询无记录,"新增库存变动表失败");
			}
			
			//记录返回起始编号
			if(i==0){
				retProdId = prodId;
			}
		}
		
		return BSLResult.ok(retProdId);
	}

	/**
	 * 外厂来料产品信息修改
	 */
	@Override
	public BSLResult updateOtherProdInfo(BslProductInfo bslProductInfo) {
		//获取原入库单信息进行校验
		BslProductInfo oldBslProductInfo = bslProductInfoMapper.selectByPrimaryKey(bslProductInfo.getProdId());
		if(oldBslProductInfo == null){
			throw new BSLException(ErrorCodeInfo.错误类型_查询无记录, "根据产品编码查询记录为空");
		}
		//修改了来料单号要判断单号是否正常
		if(!oldBslProductInfo.getProdPlanNo().equals(bslProductInfo.getProdPlanNo())){
			BslBsPlanInfo bslBsPlanInfo = bslBsPlanInfoMapper.selectByPrimaryKey(bslProductInfo.getProdPlanNo());
			if(bslBsPlanInfo == null){
				throw new BSLException(ErrorCodeInfo.错误类型_查询无记录, "根据关联来料单号查询记录为空");
			}
		}
		//校验状态，只有是1-已入库的状态才能修改（管理员可修改）
		/*if(!DictItemOperation.产品状态_已入库.equals(oldBslProductInfo.getProdStatus())){
			throw new BSLException(ErrorCodeInfo.错误类型_状态校验错误, "只有在库的卷板才能在此修改");
		}*/

		//参数赋值
		bslProductInfo.setUpdDate(new Date());
		
		int result = bslProductInfoMapper.updateByPrimaryKeySelective(bslProductInfo);
		if(result<0){
			throw new BSLException(ErrorCodeInfo.错误类型_数据库错误,"sql执行异常！");
		}else if(result==0){
			throw new BSLException(ErrorCodeInfo.错误类型_查询无记录,"根据条件没有符合的修改记录");
		}
		return BSLResult.ok(bslProductInfo.getProdId());
	}
	
	/**
	 * 删除
	 */
	@Override
	public BSLResult deleteOtherProd(String prodId) {
		//获取原入卷板信息进行校验
		BslProductInfo oldBslProductInfo = bslProductInfoMapper.selectByPrimaryKey(prodId);
		if(oldBslProductInfo == null){
			throw new BSLException(ErrorCodeInfo.错误类型_查询无记录, "根据产品编号查询记录为空");
		}
		if(!DictItemOperation.产品状态_已入库.equals(oldBslProductInfo.getProdStatus())){
			throw new BSLException(ErrorCodeInfo.错误类型_状态校验错误, "产品状态必须是在库才能删除");
		}
		int resultStock = bslProductInfoMapper.deleteByPrimaryKey(prodId);
		if(resultStock<0){
			throw new BSLException(ErrorCodeInfo.错误类型_数据库错误,"sql执行异常！");
		}else if(resultStock==0){
			throw new BSLException(ErrorCodeInfo.错误类型_查询无记录,"删除失败");
		}
		//记录删除信息
		BslStockChangeDetail bslStockChangeDetailRaw = new BslStockChangeDetail();
		bslStockChangeDetailRaw.setTransSerno(createStockChangeId());//流水
		bslStockChangeDetailRaw.setProdId(oldBslProductInfo.getProdId());//产品编号
		bslStockChangeDetailRaw.setPlanSerno(oldBslProductInfo.getProdPlanNo());//对应的外厂来料单号
		bslStockChangeDetailRaw.setTransCode(DictItemOperation.库存变动交易码_删除);//交易码
		bslStockChangeDetailRaw.setProdType(DictItemOperation.产品类型_成品);//产品类型
		bslStockChangeDetailRaw.setRubbishWeight(oldBslProductInfo.getProdRelWeight());//重量
		bslStockChangeDetailRaw.setInputuser(oldBslProductInfo.getProdInputuser());//录入人
		bslStockChangeDetailRaw.setCrtDate(new Date());
		int resultStockRaw = bslStockChangeDetailMapper.insert(bslStockChangeDetailRaw);
		if(resultStockRaw<0){
			throw new BSLException(ErrorCodeInfo.错误类型_数据库错误,"sql执行异常！");
		}else if(resultStockRaw==0){
			throw new BSLException(ErrorCodeInfo.错误类型_查询无记录,"新增库存变动表失败");
		}
		
		return BSLResult.ok();
	}
	
	/**
	 * 外厂来料产品自动生成编号
	 * OXCP+日期+3位序号
	 * @return
	 */
	public String createOtherProdId() {
		long incr = jedisClient.incr(REDIS_NEXT_PROD_ID);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String rawId = String.format("OXCP%s%03d", sdf.format(new Date()), incr);
		return rawId;
	}
	
	/**
	 * 库存变动流水自动生成编号
	 * CH+日期+2位序号
	 * @return
	 */
	public String createStockChangeId() {
		long incr = jedisClient.incr(REDIS_NEXT_STOCKCHANGE_ID);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String rawId = String.format("CH%s%04d", sdf.format(new Date()), incr);
		return rawId;
	}
	

}
