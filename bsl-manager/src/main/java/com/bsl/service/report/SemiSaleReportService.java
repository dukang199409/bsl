package com.bsl.service.report;

import com.bsl.common.utils.BSLResult;
import com.bsl.select.QueryCriteria;

/**
 * 半成品销售出库报表查询接口
 * duk-20230913
 */
public interface SemiSaleReportService {
	
	//根据条件查询半成品销售出库报表日报
	BSLResult getM7109Report(QueryCriteria queryCriteria);
	
	//根据条件查询半成品销售出库报表统计
	BSLResult getM7109sReport(QueryCriteria queryCriteria);
	
	//根据条件查询半成品销售出库报表合计
	BSLResult getM7109sHJReport(QueryCriteria queryCriteria);
	
	
}
