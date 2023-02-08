package com.bsl.service.report;

import com.bsl.common.utils.BSLResult;
import com.bsl.select.QueryCriteria;

/**
 * 产成品报表查询接口
 * duk-20230126
 */
public interface ProdReportService {
	
	//根据条件查询产成品库存报表日报
	BSLResult getM7106Report(QueryCriteria queryCriteria);
	
	//根据条件查询产成品库存报表统计
	BSLResult getM7106sReport(QueryCriteria queryCriteria);
	
	//根据条件查询产成品库存报表合计
	BSLResult getM7106sHJReport(QueryCriteria queryCriteria);
	
}
