package com.bsl.service.otherprod;

import com.bsl.common.utils.BSLResult;
import com.bsl.pojo.BslProductInfo;
import com.bsl.select.QueryCriteria;

/**
 * 外厂来料产品库存台账
 * duk-20230125
 */
public interface OtherProdService {
	
	//根据条件查询所有外厂来料产品信息
	BSLResult getOtherProdInfo(QueryCriteria queryCriteria);
	//外厂来料产品录入
	BSLResult addOtherProdInfo(BslProductInfo bslProductInfo,int sumNum) throws Exception;
	//外厂来料产品修改
	BSLResult updateOtherProdInfo(BslProductInfo bslProductInfo);
	//删除
	BSLResult deleteOtherProd(String prodId);
	
	
}
