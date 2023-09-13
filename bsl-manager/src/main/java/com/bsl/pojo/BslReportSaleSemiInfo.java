package com.bsl.pojo;

import java.util.Date;

public class BslReportSaleSemiInfo {
    private String dataDate;

    private String contractType;

    private String prodCustomer;

    private String prodName;

    private String prodNorm;

    private String prodMaterial;

    private Float prodOutNum;

    private Float prodOutWeight;

    private Float prodChaWeight;

    private Float prodRetWeight;

    private Float salePrice;

    private Float saleAmt;

    private String remark;

    private Date crtDate;

    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate == null ? null : dataDate.trim();
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType == null ? null : contractType.trim();
    }

    public String getProdCustomer() {
        return prodCustomer;
    }

    public void setProdCustomer(String prodCustomer) {
        this.prodCustomer = prodCustomer == null ? null : prodCustomer.trim();
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName == null ? null : prodName.trim();
    }

    public String getProdNorm() {
        return prodNorm;
    }

    public void setProdNorm(String prodNorm) {
        this.prodNorm = prodNorm == null ? null : prodNorm.trim();
    }

    public String getProdMaterial() {
        return prodMaterial;
    }

    public void setProdMaterial(String prodMaterial) {
        this.prodMaterial = prodMaterial == null ? null : prodMaterial.trim();
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

    public Float getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Float salePrice) {
        this.salePrice = salePrice;
    }

    public Float getSaleAmt() {
        return saleAmt;
    }

    public void setSaleAmt(Float saleAmt) {
        this.saleAmt = saleAmt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCrtDate() {
        return crtDate;
    }

    public void setCrtDate(Date crtDate) {
        this.crtDate = crtDate;
    }
}