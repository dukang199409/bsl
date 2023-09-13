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
import com.bsl.mapper.BslReportSaleSemiInfoMapper;
import com.bsl.pojo.BslReportSaleSemiInfo;
import com.bsl.pojo.BslReportSaleSemiInfoExample;
import com.bsl.reportbean.BslSemiSaleReportHJInfo;
import com.bsl.select.DictItemOperation;
import com.bsl.select.ErrorCodeInfo;
import com.bsl.select.QueryCriteria;
import com.bsl.service.report.SemiSaleReportService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 半成品销售出库报表查询综合类
 * duk-20230913
 */
@Service
public class SemiSaleReportServiceImpl implements SemiSaleReportService {

	@Autowired	 
	BslReportSaleSemiInfoMapper bslReportSaleSemiInfoMapper;
	
	
	//根据条件查询半成品销售出库报表日报
	@Override
	public BSLResult getM7109Report(QueryCriteria queryCriteria) {
		BslReportSaleSemiInfoExample bslReportSaleSemiInfoExample = new BslReportSaleSemiInfoExample();
		com.bsl.pojo.BslReportSaleSemiInfoExample.Criteria criteria = bslReportSaleSemiInfoExample.createCriteria();
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
		bslReportSaleSemiInfoExample.setOrderByClause("`crt_date` desc");
		
		List<BslReportSaleSemiInfo> bslReportSaleSemiInfos = bslReportSaleSemiInfoMapper.selectByExample(bslReportSaleSemiInfoExample);
		PageInfo<BslReportSaleSemiInfo> pageInfo = new PageInfo<BslReportSaleSemiInfo>(bslReportSaleSemiInfos);
		return BSLResult.ok(bslReportSaleSemiInfos,"semiSaleReportServiceImpl","getM7109Report",pageInfo.getTotal(),bslReportSaleSemiInfos);
	}
	
	//根据条件查询半成品销售出库报表统计
	@Override
	public BSLResult getM7109sReport(QueryCriteria queryCriteria) {
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
		
		List<BslReportSaleSemiInfo> bslReportSaleSemiInfos = bslReportSaleSemiInfoMapper.selectSemiSaleReportInfoTJ(queryCriteria);
		PageInfo<BslReportSaleSemiInfo> pageInfo = new PageInfo<BslReportSaleSemiInfo>(bslReportSaleSemiInfos);
		return BSLResult.ok(bslReportSaleSemiInfos,"semiSaleReportServiceImpl","getM7109sReport",pageInfo.getTotal(),bslReportSaleSemiInfos);
	}
	
	//根据条件查询半成品销售出库报表合计
	@Override
	public BSLResult getM7109sHJReport(QueryCriteria queryCriteria) {
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
		
		String startDateS = queryCriteria.getStartDate().replace("-", "");
		String endDateS = queryCriteria.getEndDate().replace("-", "");
		queryCriteria.setStartDate(startDateS);
		queryCriteria.setEndDate(endDateS);
		
		List<BslSemiSaleReportHJInfo> bslSemiSaleReportHJInfos = bslReportSaleSemiInfoMapper.selectSemiSaleReportInfoHJ(queryCriteria);
		int prodNormHJ = bslReportSaleSemiInfoMapper.countNormSemiSaleReportInfoHJ(queryCriteria);
		
		List<BslSemiSaleReportHJInfo> resInfos = new ArrayList<>();
		BslSemiSaleReportHJInfo bslSemiSaleReportHJInfo = new BslSemiSaleReportHJInfo();
		if(bslSemiSaleReportHJInfos!=null && bslSemiSaleReportHJInfos.size()>0 && bslSemiSaleReportHJInfos.get(0) != null){
			bslSemiSaleReportHJInfo = bslSemiSaleReportHJInfos.get(0);
		}
		bslSemiSaleReportHJInfo.setProdHJ("合计");
		bslSemiSaleReportHJInfo.setProdNormHJ(prodNormHJ);
		resInfos.add(bslSemiSaleReportHJInfo);
		return BSLResult.ok(resInfos);
	}

}