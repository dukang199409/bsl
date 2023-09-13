package com.bsl.reportbean;

//半成品销售出库报表合计信息
public class BslSemiSaleReportHJInfo {

	private String prodHJ;
    
    private int prodNormHJ;

    private Float prodOutNum;

    private Float prodOutWeight;

    private Float prodChaWeight;
    
    private Float prodRetWeight;

    private Float saleAmt;

	public String getProdHJ() {
		return prodHJ;
	}

	public void setProdHJ(String prodHJ) {
		this.prodHJ = prodHJ;
	}

	public int getProdNormHJ() {
		return prodNormHJ;
	}

	public void setProdNormHJ(int prodNormHJ) {
		this.prodNormHJ = prodNormHJ;
	}

	public Float getProdOutNum() {
		return prodOutNum;
	}

	public void setProdOutNum(Float prodOutNum) {
		this.prodOutNum = prodOutNum;
	}

	public Float getProdOutWeight() {
		return prodOutWeight;
	}

	public void setProdOutWeight(Float prodOutWeight) {
		this.prodOutWeight = prodOutWeight;
	}

	public Float getProdChaWeight() {
		return prodChaWeight;
	}

	public void setProdChaWeight(Float prodChaWeight) {
		this.prodChaWeight = prodChaWeight;
	}

	public Float getProdRetWeight() {
		return prodRetWeight;
	}

	public void setProdRetWeight(Float prodRetWeight) {
		this.prodRetWeight = prodRetWeight;
	}

	public Float getSaleAmt() {
		return saleAmt;
	}

	public void setSaleAmt(Float saleAmt) {
		this.saleAmt = saleAmt;
	}
    
    
	
}