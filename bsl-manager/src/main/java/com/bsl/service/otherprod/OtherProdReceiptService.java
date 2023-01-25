package com.bsl.service.otherprod;

import com.bsl.common.utils.BSLResult;
import com.bsl.pojo.BslBsPlanInfo;
import com.bsl.select.QueryCriteria;

/**
 * 外厂产品来料通知单管理接口
 * duk-20190319
 */
public interface OtherProdReceiptService {
	
	//根据条件查询所有外厂产品来料通知单单信息
	BSLResult getOtherProdReceiptService(QueryCriteria queryCriteria);
	//根据单号id查询外厂产品来料通知单信息
	BSLResult getOtherProdReceiptByBsBsId(String bsId);
	//新增外厂产品来料通知单信息
	BSLResult addOtherProdReceiptInfo(BslBsPlanInfo bslBsPlanInfo);
	//修改外厂产品来料通知单信息
	BSLResult updateOtherProdReceiptInfo(BslBsPlanInfo bslBsPlanInfo);
	//删除外厂产品来料通知单信息
	BSLResult deleteOtherProdReceiptInfo(BslBsPlanInfo bslBsPlanInfo);
	
}
