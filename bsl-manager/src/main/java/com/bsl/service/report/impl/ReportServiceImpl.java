package com.bsl.service.report.impl;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bsl.common.pojo.EasyUIDataGridResult;
import com.bsl.common.utils.BSLResult;
import com.bsl.mapper.BslLuStockInfoMapper;
import com.bsl.mapper.BslProductPhotoInfoMapper;
import com.bsl.mapper.BslReportProdMakeInfoMapper;
import com.bsl.mapper.BslReportRawInfoMapper;
import com.bsl.mapper.BslReportSaleInfoMapper;
import com.bsl.mapper.BslStockChangePhotoMapper;
import com.bsl.pojo.BslLuStockInfo;
import com.bsl.pojo.BslLuStockInfoExample;
import com.bsl.pojo.BslReportProdMakeInfo;
import com.bsl.pojo.BslReportProdMakeInfoExample;
import com.bsl.pojo.BslReportRawInfo;
import com.bsl.pojo.BslReportRawInfoExample;
import com.bsl.pojo.BslReportSaleInfo;
import com.bsl.pojo.BslReportSaleInfoExample;
import com.bsl.pojo.BslStockChangePhoto;
import com.bsl.pojo.BslStockChangePhotoExample;
import com.bsl.reportbean.BslStockChangeSumReport;
import com.bsl.reportbean.BslStockPhotoReport;
import com.bsl.select.DictItemOperation;
import com.bsl.select.QueryCriteria;
import com.bsl.service.report.ReportService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.base.CaseFormat;

/**
 * 报表查询综合类
 * duk-20190319
 */
@Service
public class ReportServiceImpl implements ReportService {

	@Autowired	 
	BslLuStockInfoMapper bslLuStockInfoMapper;
	
	@Autowired	 
	BslProductPhotoInfoMapper bslProductPhotoInfoMapper;
	
	@Autowired	 
	BslStockChangePhotoMapper bslStockChangePhotoMapper;
	
	@Autowired	 
	BslReportProdMakeInfoMapper bslReportProdMakeInfoMapper;
	
	@Autowired	 
	BslReportRawInfoMapper bslReportRawInfoMapper;
	
	@Autowired	 
	BslReportSaleInfoMapper bslReportSaleInfoMapper;
	
	/**
	 * 初始化查询所有库存日照报表信息
	 */
	@Override
	public EasyUIDataGridResult getAllProductPhotoService(Integer page, Integer rows) {
		//分页处理
		PageHelper.startPage(page,rows);
		QueryCriteria criteria = new QueryCriteria();
		//调用sql查询
		criteria.setOrderByClause("`trans_date` desc,`prod_id` desc");
		List<BslStockPhotoReport> bslStockPhotoReports = bslProductPhotoInfoMapper.selectByExampleNew(criteria);
		//创建一个返回值对象
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setRows(bslStockPhotoReports);
		//取记录总条数
		PageInfo<BslStockPhotoReport> pageInfo = new PageInfo<>(bslStockPhotoReports);
		result.setTotal(pageInfo.getTotal());
		result.setClassName("reportServiceImpl");
		result.setMethodName("getProductPhotoService");
		return result;
	}

	/**
	 * 根据条件查询库存日照报表信息
	 */
	@Override
	public BSLResult getProductPhotoService(QueryCriteria queryCriteria) {
		
		if(StringUtils.isBlank(queryCriteria.getProdId())){
			queryCriteria.setProdId(null);
		}else{
			queryCriteria.setProdId("%"+queryCriteria.getProdId()+"%");
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
		queryCriteria.setDateStart(dateStart);
		queryCriteria.setDateEnd(dateEnd);
		
		//分页处理
		PageHelper.startPage(Integer.parseInt(queryCriteria.getPage()), Integer.parseInt(queryCriteria.getRows()));
		//调用sql查询
		if(StringUtils.isBlank(queryCriteria.getSort()) || StringUtils.isBlank(queryCriteria.getOrder())){
			queryCriteria.setOrderByClause("`trans_date` desc,`prod_id` desc");
		}else{
			String sortSql = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, queryCriteria.getSort());
			if(!StringUtils.isBlank(sortSql)){
				queryCriteria.setOrderByClause("`"+sortSql+"` "+ queryCriteria.getOrder());
			}
		}
		List<BslStockPhotoReport> bslStockPhotoReports = bslProductPhotoInfoMapper.selectByExampleNew(queryCriteria);
		PageInfo<BslStockPhotoReport> pageInfo = new PageInfo<BslStockPhotoReport>(bslStockPhotoReports);
		return BSLResult.ok(bslStockPhotoReports,"reportServiceImpl","getProductPhotoService",pageInfo.getTotal(),bslStockPhotoReports);
	}
	
	/**
	 * 初始化查询所有库存变动日汇总信息
	 */
	@Override
	public EasyUIDataGridResult getAllStockChangeInfoService(Integer page, Integer rows) {
		//查询条件状态 
		BslStockChangePhotoExample bslStockChangePhotoExample = new BslStockChangePhotoExample();
		//分页处理
		PageHelper.startPage(page,rows);
		//调用sql查询
		bslStockChangePhotoExample.setOrderByClause("`trans_date` desc,`prod_type` asc,`trans_code` asc");
		List<BslStockChangePhoto> bslStockChangePhotos = bslStockChangePhotoMapper.selectByExample(bslStockChangePhotoExample);
		//创建一个返回值对象
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setRows(bslStockChangePhotos);
		//取记录总条数
		PageInfo<BslStockChangePhoto> pageInfo = new PageInfo<>(bslStockChangePhotos);
		result.setTotal(pageInfo.getTotal());
		result.setClassName("reportServiceImpl");
		result.setMethodName("getStockChangeInfoService");
		return result;
	}

	/**
	 * 根据条件查询库存变动日汇总信息
	 */
	@Override
	public BSLResult getStockChangeInfoService(QueryCriteria queryCriteria) {
		//查询条件状态 
		BslStockChangePhotoExample bslStockChangePhotoExample = new BslStockChangePhotoExample();
		com.bsl.pojo.BslStockChangePhotoExample.Criteria criteria = bslStockChangePhotoExample.createCriteria();
		if(!StringUtils.isBlank(queryCriteria.getProdType())){
			criteria.andProdTypeEqualTo(queryCriteria.getProdType());
		}
		if(!StringUtils.isBlank(queryCriteria.getTransCode())){
			criteria.andTransCodeEqualTo(queryCriteria.getTransCode());
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
		criteria.andTransDateBetween(dateStart,dateEnd);
		//分页处理
		PageHelper.startPage(Integer.parseInt(queryCriteria.getPage()), Integer.parseInt(queryCriteria.getRows()));
		//调用sql查询
		if(StringUtils.isBlank(queryCriteria.getSort()) || StringUtils.isBlank(queryCriteria.getOrder())){
			bslStockChangePhotoExample.setOrderByClause("`trans_date` desc,`prod_type` asc,`trans_code` asc");
		}else{
			String sortSql = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, queryCriteria.getSort());
			if(!StringUtils.isBlank(sortSql)){
				bslStockChangePhotoExample.setOrderByClause("`"+sortSql+"` "+ queryCriteria.getOrder());
			}
		}
		List<BslStockChangePhoto> bslStockChangePhotos = bslStockChangePhotoMapper.selectByExample(bslStockChangePhotoExample);
		PageInfo<BslStockChangePhoto> pageInfo = new PageInfo<BslStockChangePhoto>(bslStockChangePhotos);
		return BSLResult.ok(bslStockChangePhotos,"reportServiceImpl","getStockChangeInfoService",pageInfo.getTotal(),bslStockChangePhotos);
	}
	
	/**
	 * 初始化查询所有库存变动汇总信息
	 */
	@Override
	public EasyUIDataGridResult getAllStockChangeSumService(Integer page, Integer rows) {
		//查询条件状态 
		QueryCriteria criteria = new QueryCriteria();
		//分页处理
		PageHelper.startPage(page,rows);
		//调用sql查询
		criteria.setOrderByClause("`prod_type` asc,`trans_code` asc");
		List<BslStockChangeSumReport> bslStockChangeSumReports = bslStockChangePhotoMapper.selectStockChangeSumAllInfo(criteria);
		//创建一个返回值对象
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setRows(bslStockChangeSumReports);
		//取记录总条数
		PageInfo<BslStockChangeSumReport> pageInfo = new PageInfo<>(bslStockChangeSumReports);
		result.setTotal(pageInfo.getTotal());
		result.setClassName("reportServiceImpl");
		result.setMethodName("getStockChangeSumService");
		return result;
	}

	/**
	 * 根据条件查询库存变动汇总信息
	 */
	@Override
	public BSLResult getStockChangeSumService(QueryCriteria queryCriteria) {
		//查询条件状态 
		if(StringUtils.isBlank(queryCriteria.getProdType())){
			queryCriteria.setProdType(null);
		}else{
			queryCriteria.setProdType(queryCriteria.getProdType());
		}
		if(StringUtils.isBlank(queryCriteria.getTransCode())){
			queryCriteria.setTransCode(null);
		}else{
			queryCriteria.setTransCode(queryCriteria.getTransCode());
		}
		//开始日期结束日期
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
		queryCriteria.setDateStart(dateStart);
		queryCriteria.setDateEnd(dateEnd);
		
		//分页处理
		PageHelper.startPage(Integer.parseInt(queryCriteria.getPage()), Integer.parseInt(queryCriteria.getRows()));
		//调用sql查询
		if(StringUtils.isBlank(queryCriteria.getSort()) || StringUtils.isBlank(queryCriteria.getOrder())){
			queryCriteria.setOrderByClause("`prod_type` asc,`trans_code` asc");
		}else{
			String sortSql = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, queryCriteria.getSort());
			if(!StringUtils.isBlank(sortSql)){
				queryCriteria.setOrderByClause("`"+sortSql+"` "+ queryCriteria.getOrder());
			}
		}
		List<BslStockChangeSumReport> bslStockChangeSumReports = bslStockChangePhotoMapper.selectStockChangeSumAllInfo(queryCriteria);
		PageInfo<BslStockChangeSumReport> pageInfo = new PageInfo<BslStockChangeSumReport>(bslStockChangeSumReports);
		return BSLResult.ok(bslStockChangeSumReports,"reportServiceImpl","getStockChangeSumService",pageInfo.getTotal(),bslStockChangeSumReports);
	}

	/**
	 * 初始化查询所有单炉库存重量统计信息
	 */
	@Override
	public EasyUIDataGridResult getAllLuStockInfoService(Integer page, Integer rows) {
		//查询条件状态 
		BslLuStockInfoExample luStockInfoExample = new BslLuStockInfoExample();
		//分页处理
		PageHelper.startPage(page,rows);
		//调用sql查询
		luStockInfoExample.setOrderByClause("`trans_date` desc,`prod_luno` desc");
		List<BslLuStockInfo> bslLuStockInfos = bslLuStockInfoMapper.selectByExample(luStockInfoExample);
		//创建一个返回值对象
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setRows(bslLuStockInfos);
		//取记录总条数
		PageInfo<BslLuStockInfo> pageInfo = new PageInfo<>(bslLuStockInfos);
		result.setTotal(pageInfo.getTotal());
		result.setClassName("reportServiceImpl");
		result.setMethodName("getLuStockInfoService");
		return result;
	}

	/**
	 * 根据条件查询所有单炉库存重量统计信息
	 */
	@Override
	public BSLResult getLuStockInfoService(QueryCriteria queryCriteria) {
		//查询条件状态 
		BslLuStockInfoExample luStockInfoExample = new BslLuStockInfoExample();
		com.bsl.pojo.BslLuStockInfoExample.Criteria criteria = luStockInfoExample.createCriteria();
		if(!StringUtils.isBlank(queryCriteria.getProdLuno())){
			criteria.andProdLunoLike("%"+queryCriteria.getProdLuno()+"%");
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
		criteria.andTransDateBetween(dateStart,dateEnd);
		//分页处理
		PageHelper.startPage(Integer.parseInt(queryCriteria.getPage()), Integer.parseInt(queryCriteria.getRows()));
		//调用sql查询
		if(StringUtils.isBlank(queryCriteria.getSort()) || StringUtils.isBlank(queryCriteria.getOrder())){
			luStockInfoExample.setOrderByClause("`trans_date` desc,`prod_luno` desc");
		}else{
			String sortSql = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, queryCriteria.getSort());
			if(!StringUtils.isBlank(sortSql)){
				luStockInfoExample.setOrderByClause("`"+sortSql+"` "+ queryCriteria.getOrder());
			}
		}
		List<BslLuStockInfo> bslLuStockInfos = bslLuStockInfoMapper.selectByExample(luStockInfoExample);
		PageInfo<BslLuStockInfo> pageInfo = new PageInfo<BslLuStockInfo>(bslLuStockInfos);
		return BSLResult.ok(bslLuStockInfos,"reportServiceImpl","getLuStockInfoService",pageInfo.getTotal(),bslLuStockInfos);
	
	}

	//根据条件查询成型机组生产报表
	@Override
	public BSLResult getM7101Report(QueryCriteria queryCriteria) {
		BslReportProdMakeInfoExample bslReportProdMakeInfoExample = new BslReportProdMakeInfoExample();
		com.bsl.pojo.BslReportProdMakeInfoExample.Criteria criteria = bslReportProdMakeInfoExample.createCriteria();
		criteria.andProdTypeEqualTo(DictItemOperation.产品类型_成品);
		if(!StringUtils.isBlank(queryCriteria.getDataType())){
			criteria.andDataTypeEqualTo(queryCriteria.getDataType());
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
		bslReportProdMakeInfoExample.setOrderByClause("`crt_date` desc");
		
		List<BslReportProdMakeInfo> bslReportProdMakeInfos = bslReportProdMakeInfoMapper.selectByExample(bslReportProdMakeInfoExample);
		PageInfo<BslReportProdMakeInfo> pageInfo = new PageInfo<BslReportProdMakeInfo>(bslReportProdMakeInfos);
		return BSLResult.ok(bslReportProdMakeInfos,"reportServiceImpl","getM7101Report",pageInfo.getTotal(),bslReportProdMakeInfos);
	}

	//根据条件查询纵剪机组生产报表
	@Override
	public BSLResult getM7102Report(QueryCriteria queryCriteria) {
		BslReportProdMakeInfoExample bslReportProdMakeInfoExample = new BslReportProdMakeInfoExample();
		com.bsl.pojo.BslReportProdMakeInfoExample.Criteria criteria = bslReportProdMakeInfoExample.createCriteria();
		criteria.andProdTypeEqualTo(DictItemOperation.产品类型_半成品);
		if(!StringUtils.isBlank(queryCriteria.getDataType())){
			criteria.andDataTypeEqualTo(queryCriteria.getDataType());
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
		bslReportProdMakeInfoExample.setOrderByClause("`crt_date` desc");
		
		List<BslReportProdMakeInfo> bslReportProdMakeInfos = bslReportProdMakeInfoMapper.selectByExample(bslReportProdMakeInfoExample);
		PageInfo<BslReportProdMakeInfo> pageInfo = new PageInfo<BslReportProdMakeInfo>(bslReportProdMakeInfos);
		return BSLResult.ok(bslReportProdMakeInfos,"reportServiceImpl","getM7102Report",pageInfo.getTotal(),bslReportProdMakeInfos);
	}

	//根据条件查询产成品销售报表
	@Override
	public BSLResult getM7103Report(QueryCriteria queryCriteria) {
		BslReportSaleInfoExample bslReportSaleInfoExample = new BslReportSaleInfoExample();
		com.bsl.pojo.BslReportSaleInfoExample.Criteria criteria = bslReportSaleInfoExample.createCriteria();
		criteria.andProdTypeEqualTo(DictItemOperation.产品类型_成品);
		if(!StringUtils.isBlank(queryCriteria.getDataType())){
			criteria.andDataTypeEqualTo(queryCriteria.getDataType());
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
		bslReportSaleInfoExample.setOrderByClause("`crt_date` desc");
		
		List<BslReportSaleInfo> bslReportSaleInfos = bslReportSaleInfoMapper.selectByExample(bslReportSaleInfoExample);
		PageInfo<BslReportSaleInfo> pageInfo = new PageInfo<BslReportSaleInfo>(bslReportSaleInfos);
		return BSLResult.ok(bslReportSaleInfos,"reportServiceImpl","getM7103Report",pageInfo.getTotal(),bslReportSaleInfos);
	}

	//根据条件查询半成品销售报表
	@Override
	public BSLResult getM7104Report(QueryCriteria queryCriteria) {
		BslReportSaleInfoExample bslReportSaleInfoExample = new BslReportSaleInfoExample();
		com.bsl.pojo.BslReportSaleInfoExample.Criteria criteria = bslReportSaleInfoExample.createCriteria();
		criteria.andProdTypeEqualTo(DictItemOperation.产品类型_半成品);
		if(!StringUtils.isBlank(queryCriteria.getDataType())){
			criteria.andDataTypeEqualTo(queryCriteria.getDataType());
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
		bslReportSaleInfoExample.setOrderByClause("`crt_date` desc");
		
		List<BslReportSaleInfo> bslReportSaleInfos = bslReportSaleInfoMapper.selectByExample(bslReportSaleInfoExample);
		PageInfo<BslReportSaleInfo> pageInfo = new PageInfo<BslReportSaleInfo>(bslReportSaleInfos);
		return BSLResult.ok(bslReportSaleInfos,"reportServiceImpl","getM7104Report",pageInfo.getTotal(),bslReportSaleInfos);
	}

	//根据条件查询原材料进库表报
	@Override
	public BSLResult getM7105Report(QueryCriteria queryCriteria) {
		BslReportRawInfoExample bslReportRawInfoExample = new BslReportRawInfoExample();
		com.bsl.pojo.BslReportRawInfoExample.Criteria criteria = bslReportRawInfoExample.createCriteria();
		if(!StringUtils.isBlank(queryCriteria.getProdMaterial())){
			criteria.andProdMaterialEqualTo(queryCriteria.getProdMaterial());
		}
		if(!StringUtils.isBlank(queryCriteria.getProdNorm())){
			criteria.andProdNormLike("%"+queryCriteria.getProdNorm()+"%");
		}
		if(!StringUtils.isBlank(queryCriteria.getProdCompany())){
			criteria.andProdCompanyLike("%"+queryCriteria.getProdCompany()+"%");
		}
		if(!StringUtils.isBlank(queryCriteria.getProdCustomer())){
			criteria.andProdCustomerLike("%"+queryCriteria.getProdCustomer()+"%");
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
		bslReportRawInfoExample.setOrderByClause("`crt_date` desc");
		
		List<BslReportRawInfo> bslReportRawInfos = bslReportRawInfoMapper.selectByExample(bslReportRawInfoExample);
		PageInfo<BslReportRawInfo> pageInfo = new PageInfo<BslReportRawInfo>(bslReportRawInfos);
		return BSLResult.ok(bslReportRawInfos,"reportServiceImpl","getM7105Report",pageInfo.getTotal(),bslReportRawInfos);
	}

}