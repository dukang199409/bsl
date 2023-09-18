package com.bsl.service.report;

import com.bsl.common.utils.BSLResult;
import com.bsl.select.QueryCriteria;

/**
 * 产成品销售出库报表查询接口
 * duk-20230913
 */
public interface ProdSaleReportService {
	
	//根据条件查询产成品销售出库报表日报
	BSLResult getM7110Report(QueryCriteria queryCriteria);
	
	//根据条件查询产成品销售出库报表统计
	BSLResult getM7110sReport(QueryCriteria queryCriteria);
	
	//根据条件查询产成品销售出库报表合计
	BSLResult getM7110sHJReport(QueryCriteria queryCriteria);
	
	
}
