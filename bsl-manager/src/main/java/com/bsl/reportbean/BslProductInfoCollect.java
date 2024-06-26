package com.bsl.reportbean;

public class BslProductInfoCollect {
	private String prodPlanNo;
	private String prodName;
	private String prodType;
	private String prodNorm;
	private String prodMaterial;
	private Float prodLength;
	private String prodLuno;
	private Integer prodNumCount;
	private Float prodWeightTotal;
	private Float prodRecordWeightTotal;
	private String prodLevel;
	public String getProdLuno() {
		return prodLuno;
	}
	public void setProdLuno(String prodLuno) {
		this.prodLuno = prodLuno;
	}
	public String getProdType() {
		return prodType;
	}
	public void setProdType(String prodType) {
		this.prodType = prodType;
	}
	public Float getProdRecordWeightTotal() {
		return prodRecordWeightTotal;
	}
	public void setProdRecordWeightTotal(Float prodRecordWeightTotal) {
		this.prodRecordWeightTotal = prodRecordWeightTotal;
	}
	public String getProdPlanNo() {
		return prodPlanNo;
	}
	public String getProdName() {
		return prodName;
	}
	public String getProdNorm() {
		return prodNorm;
	}
	public String getProdMaterial() {
		return prodMaterial;
	}
	public Float getProdLength() {
		return prodLength;
	}
	public Integer getProdNumCount() {
		return prodNumCount;
	}
	public Float getProdWeightTotal() {
		return prodWeightTotal;
	}
	public String getProdLevel() {
		return prodLevel;
	}
	public void setProdPlanNo(String prodPlanNo) {
		this.prodPlanNo = prodPlanNo;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public void setProdNorm(String prodNorm) {
		this.prodNorm = prodNorm;
	}
	public void setProdMaterial(String prodMaterial) {
		this.prodMaterial = prodMaterial;
	}
	public void setProdLength(Float prodLength) {
		this.prodLength = prodLength;
	}
	public void setProdNumCount(Integer prodNumCount) {
		this.prodNumCount = prodNumCount;
	}
	public void setProdWeightTotal(Float prodWeightTotal) {
		this.prodWeightTotal = prodWeightTotal;
	}
	public void setProdLevel(String prodLevel) {
		this.prodLevel = prodLevel;
	}
	@Override
	public String toString() {
		return "BslProductInfoCollect [prodPlanNo=" + prodPlanNo + ", prodName=" + prodName
				+ ", prodNorm=" + prodNorm + ", prodMaterial=" + prodMaterial + ", prodLength=" + prodLength
				+ ", prodNumCount=" + prodNumCount + ", prodWeightTotal=" + prodWeightTotal + ", prodLevel=" + prodLevel
				+ "]";
	}
}
