package com.bsl.service.report.impl;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bsl.common.utils.BSLResult;
import com.bsl.mapper.BslReportProdInfoMapper;
import com.bsl.pojo.BslReportProdInfo;
import com.bsl.pojo.BslReportProdInfoExample;
import com.bsl.select.DictItemOperation;
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
		return BSLResult.ok(bslReportProdInfos,"reportServiceImpl","getM7106Report",pageInfo.getTotal(),bslReportProdInfos);
	}
	

}