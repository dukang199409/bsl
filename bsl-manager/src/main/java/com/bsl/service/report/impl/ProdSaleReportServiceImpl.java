package com.bsl.service.report.impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bsl.common.pojo.BSLException;
import com.bsl.common.utils.BSLResult;
import com.bsl.mapper.BslReportSaleProdInfoMapper;
import com.bsl.pojo.BslReportSaleProdInfo;
import com.bsl.pojo.BslReportSaleProdInfoExample;
import com.bsl.reportbean.BslProdSaleReportHJInfo;
import com.bsl.select.DictItemOperation;
import com.bsl.select.ErrorCodeInfo;
import com.bsl.select.QueryCriteria;
import com.bsl.service.report.ProdSaleReportService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 产成品销售出库报表查询综合类
 * duk-20230913
 */
@Service
public class ProdSaleReportServiceImpl implements ProdSaleReportService {

	@Autowired	 
	BslReportSaleProdInfoMapper bslReportSaleProdInfoMapper;
	
	
	//根据条件查询产成品销售出库报表日报
	@Override
	public BSLResult getM7110Report(QueryCriteria queryCriteria) {
		BslReportSaleProdInfoExample bslReportSaleProdInfoExample = new BslReportSaleProdInfoExample();
		com.bsl.pojo.BslReportSaleProdInfoExample.Criteria criteria = bslReportSaleProdInfoExample.createCriteria();
		if(!StringUtils.isBlank(queryCriteria.getProdCustomer())){
			criteria.andProdCustomerLike("%"+queryCriteria.getProdCustomer()+"%");
		}
		if(!StringUtils.isBlank(queryCriteria.getContractType())){
			criteria.andContractTypeEqualTo(queryCriteria.getContractType());
		}
		if(!StringUtils.isBlank(queryCriteria.getProdNorm())){
			criteria.andProdNormLike("%"+queryCriteria.getProdNorm()+"%");
		}
		if(!StringUtils.isBlank(queryCriteria.getProdMaterial())){
			criteria.andProdMaterialEqualTo(queryCriteria.getProdMaterial());
		}
		if(!StringUtils.isBlank(queryCriteria.getProdName())){
			criteria.andProdNameLike("%"+queryCriteria.getProdName()+"%");
		}
		if(!StringUtils.isBlank(queryCriteria.getProdLength())){
			criteria.andProdLengthEqualTo(Float.valueOf(queryCriteria.getProdLength()));
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
		bslReportSaleProdInfoExample.setOrderByClause("`crt_date` desc");
		
		List<BslReportSaleProdInfo> bslReportSaleProdInfos = bslReportSaleProdInfoMapper.selectByExample(bslReportSaleProdInfoExample);
		PageInfo<BslReportSaleProdInfo> pageInfo = new PageInfo<BslReportSaleProdInfo>(bslReportSaleProdInfos);
		return BSLResult.ok(bslReportSaleProdInfos,"prodSaleReportServiceImpl","getM7110Report",pageInfo.getTotal(),bslReportSaleProdInfos);
	}
	
	//根据条件查询产成品销售出库报表统计
	@Override
	public BSLResult getM7110sReport(QueryCriteria queryCriteria) {
		if(StringUtils.isBlank(queryCriteria.getProdCustomer())){
			queryCriteria.setProdCustomer(null);
		}else{
			queryCriteria.setProdCustomer("%"+queryCriteria.getProdCustomer()+"%");
		}
		if(StringUtils.isBlank(queryCriteria.getContractType())){
			queryCriteria.setContractType(null);
		}
		if(StringUtils.isBlank(queryCriteria.getProdNorm())){
			queryCriteria.setProdNorm(null);
		}else{
			queryCriteria.setProdNorm("%"+queryCriteria.getProdNorm()+"%");
		}
		if(StringUtils.isBlank(queryCriteria.getProdMaterial())){
			queryCriteria.setProdMaterial(null);
		}
		if(StringUtils.isBlank(queryCriteria.getProdName())){
			queryCriteria.setProdName(null);
		}else{
			queryCriteria.setProdName("%"+queryCriteria.getProdName()+"%");
		}
		if(StringUtils.isBlank(queryCriteria.getProdLength())){
			queryCriteria.setProdLength(null);
		}
		if(StringUtils.isBlank(queryCriteria.getStartDate())){
			throw new BSLException(ErrorCodeInfo.错误类型_查询无记录,"开始日期不能为空");
		}
		if(StringUtils.isBlank(queryCriteria.getEndDate())){
			throw new BSLException(ErrorCodeInfo.错误类型_查询无记录,"结束日期不能为空");
		}
		String startDateS = queryCriteria.getStartDate().replace("-", "");
		String endDateS = queryCriteria.getEndDate().replace("-", "");
		queryCriteria.setStartDate(startDateS);
		queryCriteria.setEndDate(endDateS);
		String dateNow = DictItemOperation.日期转换实例yyyyMMdd.format(new Date());
		if(Integer.parseInt(endDateS) >= Integer.parseInt(dateNow)){
			throw new BSLException(ErrorCodeInfo.错误类型_查询无记录,"结束日期不能大于前一日");
		}
		//分页处理
		PageHelper.startPage(Integer.parseInt(queryCriteria.getPage()), Integer.parseInt(queryCriteria.getRows()));
		
		List<BslReportSaleProdInfo> bslReportSaleProdInfos = bslReportSaleProdInfoMapper.selectProdSaleReportInfoTJ(queryCriteria);
		PageInfo<BslReportSaleProdInfo> pageInfo = new PageInfo<BslReportSaleProdInfo>(bslReportSaleProdInfos);
		return BSLResult.ok(bslReportSaleProdInfos,"prodSaleReportServiceImpl","getM7110sReport",pageInfo.getTotal(),bslReportSaleProdInfos);
	}
	
	//根据条件查询产成品销售出库报表合计
	@Override
	public BSLResult getM7110sHJReport(QueryCriteria queryCriteria) {
		if(StringUtils.isBlank(queryCriteria.getProdCustomer())){
			queryCriteria.setProdCustomer(null);
		}else{
			queryCriteria.setProdCustomer("%"+queryCriteria.getProdCustomer()+"%");
		}
		if(StringUtils.isBlank(queryCriteria.getContractType())){
			queryCriteria.setContractType(null);
		}
		if(StringUtils.isBlank(queryCriteria.getProdNorm())){
			queryCriteria.setProdNorm(null);
		}else{
			queryCriteria.setProdNorm("%"+queryCriteria.getProdNorm()+"%");
		}
		if(StringUtils.isBlank(queryCriteria.getProdMaterial())){
			queryCriteria.setProdMaterial(null);
		}
		if(StringUtils.isBlank(queryCriteria.getProdName())){
			queryCriteria.setProdName(null);
		}else{
			queryCriteria.setProdName("%"+queryCriteria.getProdName()+"%");
		}
		if(StringUtils.isBlank(queryCriteria.getProdLength())){
			queryCriteria.setProdLength(null);
		}
		
		String startDateS = queryCriteria.getStartDate().replace("-", "");
		String endDateS = queryCriteria.getEndDate().replace("-", "");
		queryCriteria.setStartDate(startDateS);
		queryCriteria.setEndDate(endDateS);
		
		List<BslProdSaleReportHJInfo> bslProdSaleReportHJInfos = bslReportSaleProdInfoMapper.selectProdSaleReportInfoHJ(queryCriteria);
		int prodNormHJ = bslReportSaleProdInfoMapper.countNormProdSaleReportInfoHJ(queryCriteria);
		
		List<BslProdSaleReportHJInfo> resInfos = new ArrayList<>();
		BslProdSaleReportHJInfo bslProdSaleReportHJInfo = new BslProdSaleReportHJInfo();
		if(bslProdSaleReportHJInfos!=null && bslProdSaleReportHJInfos.size()>0 && bslProdSaleReportHJInfos.get(0) != null){
			bslProdSaleReportHJInfo = bslProdSaleReportHJInfos.get(0);
		}
		bslProdSaleReportHJInfo.setProdHJ("合计");
		bslProdSaleReportHJInfo.setProdNormHJ(prodNormHJ);
		resInfos.add(bslProdSaleReportHJInfo);
		return BSLResult.ok(resInfos);
	}

}