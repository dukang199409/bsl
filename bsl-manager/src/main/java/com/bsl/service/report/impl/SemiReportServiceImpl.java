package com.bsl.service.report.impl;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bsl.common.utils.BSLResult;
import com.bsl.mapper.BslReportSemiInfoMapper;
import com.bsl.pojo.BslReportSemiInfo;
import com.bsl.pojo.BslReportSemiInfoExample;
import com.bsl.select.DictItemOperation;
import com.bsl.select.QueryCriteria;
import com.bsl.service.report.SemiReportService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 纵剪机组生产报表查询综合类
 * duk-20230830
 */
@Service
public class SemiReportServiceImpl implements SemiReportService {

	@Autowired	 
	BslReportSemiInfoMapper bslReportSemiInfoMapper;
	
	
	//根据条件查询纵剪机组生产报表日报
	@Override
	public BSLResult getM7107Report(QueryCriteria queryCriteria) {
		BslReportSemiInfoExample bslReportSemiInfoExample = new BslReportSemiInfoExample();
		com.bsl.pojo.BslReportSemiInfoExample.Criteria criteria = bslReportSemiInfoExample.createCriteria();
		if(!StringUtils.isBlank(queryCriteria.getProdMaterial())){
			criteria.andProdMaterialEqualTo(queryCriteria.getProdMaterial());
		}
		if(!StringUtils.isBlank(queryCriteria.getProdNorm())){
			criteria.andProdNormLike("%"+queryCriteria.getProdNorm()+"%");
		}
		if(!StringUtils.isBlank(queryCriteria.getProdBc())){
			criteria.andProdBcEqualTo(queryCriteria.getProdBc());
		}
		if(!StringUtils.isBlank(queryCriteria.getProdMakeJz())){
			criteria.andProdMakeJzEqualTo(queryCriteria.getProdMakeJz());
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
		bslReportSemiInfoExample.setOrderByClause("`crt_date` desc");
		
		List<BslReportSemiInfo> bslReportSemiInfos = bslReportSemiInfoMapper.selectByExample(bslReportSemiInfoExample);
		PageInfo<BslReportSemiInfo> pageInfo = new PageInfo<BslReportSemiInfo>(bslReportSemiInfos);
		return BSLResult.ok(bslReportSemiInfos,"semiReportServiceImpl","getM7107Report",pageInfo.getTotal(),bslReportSemiInfos);
	}
	
	//根据条件查询纵剪机组生产报表统计
	@Override
	public BSLResult getM7107sReport(QueryCriteria queryCriteria) {
		return null;
	}
	
	//根据条件查询纵剪机组生产报表合计
	@Override
	public BSLResult getM7107sHJReport(QueryCriteria queryCriteria) {
		return null;
	}

}