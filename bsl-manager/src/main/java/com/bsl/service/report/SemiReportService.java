package com.bsl.service.report;

import com.bsl.common.utils.BSLResult;
import com.bsl.select.QueryCriteria;

/**
 * 纵剪机组生产报表查询接口
 * duk-20230830
 */
public interface SemiReportService {
	
	//根据条件查询纵剪机组生产报表报表日报
	BSLResult getM7107Report(QueryCriteria queryCriteria);
	
	//根据条件查询纵剪机组生产报表报表统计
	BSLResult getM7107sReport(QueryCriteria queryCriteria);
	
	//根据条件查询纵剪机组生产报表报表合计
	BSLResult getM7107sHJReport(QueryCriteria queryCriteria);
	
	
}
