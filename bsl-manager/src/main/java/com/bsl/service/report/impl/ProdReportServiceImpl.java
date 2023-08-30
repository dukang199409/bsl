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
import com.bsl.mapper.BslReportProdInfoMapper;
import com.bsl.pojo.BslReportProdInfo;
import com.bsl.pojo.BslReportProdInfoExample;
import com.bsl.reportbean.BslProdReportHJInfo;
import com.bsl.select.DictItemOperation;
import com.bsl.select.ErrorCodeInfo;
import com.bsl.select.QueryCriteria;
import com.bsl.service.report.ProdReportService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 产成品库存报表查询综合类
 * duk-20230126
 */
@Service
public class ProdReportServiceImpl implements ProdReportService {

	@Autowired
	BslReportProdInfoMapper bslReportProdInfoMapper;
	
	
	//根据条件查询产成品库存报表日报
	@Override
	public BSLResult getM7106Report(QueryCriteria queryCriteria) {
		BslReportProdInfoExample bslReportProdInfoExample = new BslReportProdInfoExample();
		com.bsl.pojo.BslReportProdInfoExample.Criteria criteria = bslReportProdInfoExample.createCriteria();
		if(!StringUtils.isBlank(queryCriteria.getProdMaterial())){
			criteria.andProdMaterialEqualTo(queryCriteria.getProdMaterial());
		}
		if(!StringUtils.isBlank(queryCriteria.getProdNorm())){
			criteria.andProdNormLike("%"+queryCriteria.getProdNorm()+"%");
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
		bslReportProdInfoExample.setOrderByClause("`crt_date` desc");
		
		List<BslReportProdInfo> bslReportProdInfos = bslReportProdInfoMapper.selectByExample(bslReportProdInfoExample);
		PageInfo<BslReportProdInfo> pageInfo = new PageInfo<BslReportProdInfo>(bslReportProdInfos);
		return BSLResult.ok(bslReportProdInfos,"prodReportServiceImpl","getM7106Report",pageInfo.getTotal(),bslReportProdInfos);
	}
	
	//根据条件查询产成品库存报表统计
	@Override
	public BSLResult getM7106sReport(QueryCriteria queryCriteria) {
		if(StringUtils.isBlank(queryCriteria.getProdMaterial())){
			queryCriteria.setProdMaterial(null);
		}
		if(StringUtils.isBlank(queryCriteria.getProdNorm())){
			queryCriteria.setProdNorm(null);
		}else{
			queryCriteria.setProdNorm("%"+queryCriteria.getProdNorm()+"%");
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
		
		List<BslReportProdInfo> bslReportProdInfos = bslReportProdInfoMapper.selectProdReportInfoTJ(queryCriteria);
		PageInfo<BslReportProdInfo> pageInfo = new PageInfo<BslReportProdInfo>(bslReportProdInfos);
		return BSLResult.ok(bslReportProdInfos,"prodReportServiceImpl","getM7106sReport",pageInfo.getTotal(),bslReportProdInfos);
	}
	
	//根据条件查询产成品库存报表合计
	@Override
	public BSLResult getM7106sHJReport(QueryCriteria queryCriteria) {
		if(StringUtils.isBlank(queryCriteria.getProdMaterial())){
			queryCriteria.setProdMaterial(null);
		}
		if(StringUtils.isBlank(queryCriteria.getProdNorm())){
			queryCriteria.setProdNorm(null);
		}else{
			queryCriteria.setProdNorm("%"+queryCriteria.getProdNorm()+"%");
		}
		if(StringUtils.isBlank(queryCriteria.getProdCustomer())){
			queryCriteria.setProdCustomer(null);
		}else{
			queryCriteria.setProdCustomer("%"+queryCriteria.getProdCustomer()+"%");
		}
		queryCriteria.setStartDate(queryCriteria.getStartDate().replace("-", ""));
		queryCriteria.setEndDate(queryCriteria.getEndDate().replace("-", ""));
		
		List<BslProdReportHJInfo> bslReportProdHJInfos = bslReportProdInfoMapper.selectProdReportInfoHJ(queryCriteria);
		int prodNormHJ = bslReportProdInfoMapper.countNormProdReportInfoHJ(queryCriteria);
		
		List<BslProdReportHJInfo> resInfos = new ArrayList<>();
		BslProdReportHJInfo prodReportHJInfo = new BslProdReportHJInfo();
		if(bslReportProdHJInfos!=null && bslReportProdHJInfos.size()>0 && bslReportProdHJInfos.get(0) != null){
			prodReportHJInfo = bslReportProdHJInfos.get(0);
		}
		prodReportHJInfo.setProdHJ("合计");
		prodReportHJInfo.setProdNormHJ(prodNormHJ);
		resInfos.add(prodReportHJInfo);
		return BSLResult.ok(resInfos);
	}
	

}