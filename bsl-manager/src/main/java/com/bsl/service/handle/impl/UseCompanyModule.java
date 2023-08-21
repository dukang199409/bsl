package com.bsl.service.handle.impl;

import com.alibaba.excel.annotation.ExcelProperty;

public class UseCompanyModule {

	@ExcelProperty(value = "产品编码", index = 0)
	private String prodId;

	@ExcelProperty(value = "使用单位", index = 1)
	private String useCompany;

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getUseCompany() {
		return useCompany;
	}

	public void setUseCompany(String useCompany) {
		this.useCompany = useCompany;
	}
	
	
	

}
