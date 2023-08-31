package com.bsl.service.report;

import com.bsl.common.utils.BSLResult;
import com.bsl.select.QueryCriteria;

/**
 * 成型机组生产报表查询接口
 * duk-20230831
 */
public interface ProdMakeReportService {
	
	//根据条件查询成型机组生产报表报表日报
	BSLResult getM7108Report(QueryCriteria queryCriteria);
	
	//根据条件查询成型机组生产报表报表统计
	BSLResult getM7108sReport(QueryCriteria queryCriteria);
	
	//根据条件查询成型机组生产报表报表合计
	BSLResult getM7108sHJReport(QueryCriteria queryCriteria);
	
	
}
