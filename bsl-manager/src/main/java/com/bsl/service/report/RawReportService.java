package com.bsl.service.report;

import com.bsl.common.utils.BSLResult;
import com.bsl.select.QueryCriteria;

/**
 * 卷板报表查询接口
 * duk-20230126
 */
public interface RawReportService {
	
	//根据条件查询原材料进库报表日报
	BSLResult getM7105Report(QueryCriteria queryCriteria);
	
	//根据条件查询原材料进库报表统计
	BSLResult getM7105sReport(QueryCriteria queryCriteria);
	
	//根据条件查询原材料进库报表合计
	BSLResult getM7105sHJReport(QueryCriteria queryCriteria);
	
	
}
