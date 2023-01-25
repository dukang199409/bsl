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
import com.bsl.pojo.BslBsPlanInfo;
import com.bsl.pojo.BslBsPlanInfoExample;
import com.bsl.pojo.BslBsPlanInfoExample.Criteria;
import com.bsl.pojo.BslProductInfo;
import com.bsl.pojo.BslProductInfoExample;
import com.bsl.select.DictItemOperation;
import com.bsl.select.ErrorCodeInfo;
import com.bsl.select.QueryCriteria;
import com.bsl.service.otherprod.OtherProdReceiptService;
import com.bsl.service.rawmaterialsmanager.RawService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.base.CaseFormat;

/**
 * 外厂成品来料通知单管理实现类
 * duk-20190319
 */
@Service
public class OtherProdReceiptServiceImpl implements OtherProdReceiptService{
	
	 @Autowired	 
	 BslBsPlanInfoMapper bslBsPlanInfoMapper;
	 @Autowired	 
	 BslProductInfoMapper bslProductInfoMapper;
	 @Autowired	 
	 RawService rawService;
	 
	 @Autowired
	 private JedisClient jedisClient;
		
	 @Value("${REDIS_NEXT_RECEIPT_ID}")
	 private String REDIS_NEXT_RECEIPT_ID;
	
	/**
	 * 获取符合条件的外厂成品来料通知单
	 */
	@Override
	public BSLResult getOtherProdReceiptService(QueryCriteria queryCriteria) {
		 
		//创建查询的实例，并赋值
		BslBsPlanInfoExample bslBsPlanInfoExample = new BslBsPlanInfoExample();
		Criteria criteria = bslBsPlanInfoExample.createCriteria();
		//查询外厂成品来料通知单
		criteria.andBsTypeEqualTo(DictItemOperation.收发标志_原料入库通知单);
		criteria.andBsFlagEqualTo(DictItemOperation.收发类别_外厂成品来料单);
		if(!StringUtils.isBlank(queryCriteria.getBsId())){
			criteria.andBsIdLike("%"+queryCriteria.getBsId()+"%");
		}
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
			bslBsPlanInfoExample.setOrderByClause("`bs_id` desc");
		}else{
			String sortSql = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, queryCriteria.getSort());
			if(!StringUtils.isBlank(sortSql)){
				bslBsPlanInfoExample.setOrderByClause("`"+sortSql+"` "+ queryCriteria.getOrder());
			}
		}
		List<BslBsPlanInfo> bslBsPlanInfoList = bslBsPlanInfoMapper.selectByExample(bslBsPlanInfoExample);
		PageInfo<BslBsPlanInfo> pageInfo = new PageInfo<BslBsPlanInfo>(bslBsPlanInfoList);
		return BSLResult.ok(bslBsPlanInfoList,"otherProdReceiptServiceImpl","getOtherProdReceiptService",pageInfo.getTotal(),bslBsPlanInfoList);
	}


	/**
	 * 新增外厂成品来料通知单
	 */
	@Override
	public BSLResult addOtherProdReceiptInfo(BslBsPlanInfo bslBsPlanInfo) {
		bslBsPlanInfo.setBsType(DictItemOperation.收发标志_原料入库通知单);
		bslBsPlanInfo.setBsFlag(DictItemOperation.收发类别_外厂成品来料单);
		bslBsPlanInfo.setBsStatus(DictItemOperation.通知单状态_创建);//状态默认为0-创建
		bslBsPlanInfo.setCrtDate(new Date());//创建日期当天
		bslBsPlanInfo.setBsId(createReceiptId());
		int result = bslBsPlanInfoMapper.insert(bslBsPlanInfo);
		if(result<0){
			throw new BSLException(ErrorCodeInfo.错误类型_数据库错误,"sql执行异常！");
		}else if(result==0){
			throw new BSLException(ErrorCodeInfo.错误类型_查询无记录,"新增失败");
		}
		return BSLResult.ok(bslBsPlanInfo.getBsId());
	}
	
	/**
	 * 修改外厂成品来料通知单
	 */
	@Override
	public BSLResult updateOtherProdReceiptInfo(BslBsPlanInfo bslBsPlanInfo) {
		//修改之前先校验状态是不是创建或进行中
		BslBsPlanInfo bslSelectPlanInfo = bslBsPlanInfoMapper.selectByPrimaryKey(bslBsPlanInfo.getBsId());
		if(bslSelectPlanInfo == null){
			throw new BSLException(ErrorCodeInfo.错误类型_查询无记录,"根据单号未查询到入库通知单信息");
		}
		
		//进行修改
		bslBsPlanInfo.setUpdDate(new Date());//修改日期当天
		int result = bslBsPlanInfoMapper.updateByPrimaryKeySelective(bslBsPlanInfo);
		if(result<0){
			throw new BSLException(ErrorCodeInfo.错误类型_数据库错误,"sql执行异常！");
		}else if(result==0){
			throw new BSLException(ErrorCodeInfo.错误类型_查询无记录,"根据条件没有符合的修改记录");
		}		
		return BSLResult.ok(bslBsPlanInfo.getBsId());
	}

	/**
	 * 删除外厂成品来料通知单
	 */
	@Override
	public BSLResult deleteOtherProdReceiptInfo(BslBsPlanInfo bslBsPlanInfo) {
		//删除之前先校验状态以及是不是下面已经有预录入的入库单
		//先校验状态是不是创建
		BslBsPlanInfo bslBsPlanInfoOld = bslBsPlanInfoMapper.selectByPrimaryKey(bslBsPlanInfo.getBsId());
		if(bslBsPlanInfoOld == null){
			throw new BSLException(ErrorCodeInfo.错误类型_查询无记录,"根据单号未查询到入库通知单信息");
		}
		//创建产品的实体类
		BslProductInfoExample bslProductInfoExample = new BslProductInfoExample(); 
		com.bsl.pojo.BslProductInfoExample.Criteria criteria = bslProductInfoExample.createCriteria();
		criteria.andProdPlanNoEqualTo(bslBsPlanInfo.getBsId());
		//获取该外厂成品来料通知单下的产品信息
		List<BslProductInfo> listBslProductInfo = bslProductInfoMapper.selectByExample(bslProductInfoExample);
		if(listBslProductInfo != null && listBslProductInfo.size()>0){
			throw new BSLException(ErrorCodeInfo.错误类型_删除前子数据检查,"该通知单下有录入产品信息，若要删除请先删除产品信息");
		}	
		
		//删除操作
		int result = bslBsPlanInfoMapper.deleteByPrimaryKey(bslBsPlanInfo.getBsId());
		if(result<0){
			throw new BSLException(ErrorCodeInfo.错误类型_数据库错误,"sql执行异常！");
		}else if(result==0){
			throw new BSLException(ErrorCodeInfo.错误类型_查询无记录,"根据条件没有符合的删除记录");
		}		
		return BSLResult.ok(bslBsPlanInfo.getBsId());
	}

	/**
	 * 根据单号获取通知单信息
	 */
	@Override
	public BSLResult getOtherProdReceiptByBsBsId(String bsId) {
		BslBsPlanInfo bslBsPlanInfo = bslBsPlanInfoMapper.selectByPrimaryKey(bsId);
		return BSLResult.ok(bslBsPlanInfo);
	}
	
	/**
	 * 外厂成品来料通知单自动生成编号
	 * ORC+日期+2位序号
	 * @return
	 */
	public String createReceiptId() {
		long incr = jedisClient.incr(REDIS_NEXT_RECEIPT_ID);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String rawId = String.format("ORC%s%02d", sdf.format(new Date()), incr);
		return rawId;
	}

	
	

}
