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
import com.bsl.mapper.BslReportRawInfoMapper;
import com.bsl.pojo.BslReportRawInfo;
import com.bsl.pojo.BslReportRawInfoExample;
import com.bsl.reportbean.BslRawReportHJInfo;
import com.bsl.select.DictItemOperation;
import com.bsl.select.ErrorCodeInfo;
import com.bsl.select.QueryCriteria;
import com.bsl.service.report.RawReportService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 卷板报表查询综合类
 * duk-20230126
 */
@Service
public class RawReportServiceImpl implements RawReportService {

	@Autowired	 
	BslReportRawInfoMapper bslReportRawInfoMapper;
	
	
	//根据条件查询原材料进库报表日报
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
		return BSLResult.ok(bslReportRawInfos,"rawReportServiceImpl","getM7105Report",pageInfo.getTotal(),bslReportRawInfos);
	}
	
	//根据条件查询原材料进库报表统计
	@Override
	public BSLResult getM7105sReport(QueryCriteria queryCriteria) {
		if(StringUtils.isBlank(queryCriteria.getProdMaterial())){
			queryCriteria.setProdMaterial(null);
		}
		if(StringUtils.isBlank(queryCriteria.getProdNorm())){
			queryCriteria.setProdNorm(null);
		}else{
			queryCriteria.setProdNorm("%"+queryCriteria.getProdNorm()+"%");
		}
		if(StringUtils.isBlank(queryCriteria.getProdCompany())){
			queryCriteria.setProdCompany(null);
		}else{
			queryCriteria.setProdCompany("%"+queryCriteria.getProdCompany()+"%");
		}
		if(StringUtils.isBlank(queryCriteria.getProdCustomer())){
			queryCriteria.setProdCustomer(null);
		}else{
			queryCriteria.setProdCustomer("%"+queryCriteria.getProdCustomer()+"%");
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
		
		List<BslReportRawInfo> bslReportRawInfos = bslReportRawInfoMapper.selectRawReportInfoTH(queryCriteria);
		PageInfo<BslReportRawInfo> pageInfo = new PageInfo<BslReportRawInfo>(bslReportRawInfos);
		return BSLResult.ok(bslReportRawInfos,"rawReportServiceImpl","getM7105sReport",pageInfo.getTotal(),bslReportRawInfos);
	}
	
	//根据条件查询原材料进库报表合计
	@Override
	public BSLResult getM7105sHJReport(QueryCriteria queryCriteria) {
		if(StringUtils.isBlank(queryCriteria.getProdMaterial())){
			queryCriteria.setProdMaterial(null);
		}
		if(StringUtils.isBlank(queryCriteria.getProdNorm())){
			queryCriteria.setProdNorm(null);
		}else{
			queryCriteria.setProdNorm("%"+queryCriteria.getProdNorm()+"%");
		}
		if(StringUtils.isBlank(queryCriteria.getProdCompany())){
			queryCriteria.setProdCompany(null);
		}else{
			queryCriteria.setProdCompany("%"+queryCriteria.getProdCompany()+"%");
		}
		if(StringUtils.isBlank(queryCriteria.getProdCustomer())){
			queryCriteria.setProdCustomer(null);
		}else{
			queryCriteria.setProdCustomer("%"+queryCriteria.getProdCustomer()+"%");
		}
		queryCriteria.setStartDate(queryCriteria.getStartDate().replace("-", ""));
		queryCriteria.setEndDate(queryCriteria.getEndDate().replace("-", ""));
		
		List<BslRawReportHJInfo> bslReportRawHJInfos = bslReportRawInfoMapper.selectRawReportInfoHJ(queryCriteria);
		int prodNormHJ = bslReportRawInfoMapper.countNormRawReportInfoHJ(queryCriteria);
		
		List<BslRawReportHJInfo> resInfos = new ArrayList<>();
		BslRawReportHJInfo rawReportHJInfo = new BslRawReportHJInfo();
		if(bslReportRawHJInfos!=null && bslReportRawHJInfos.size()>0 && bslReportRawHJInfos.get(0) != null){
			rawReportHJInfo = bslReportRawHJInfos.get(0);
		}
		rawReportHJInfo.setProdHJ("合计");
		rawReportHJInfo.setProdNormHJ(prodNormHJ);
		resInfos.add(rawReportHJInfo);
		return BSLResult.ok(resInfos);
	}

}