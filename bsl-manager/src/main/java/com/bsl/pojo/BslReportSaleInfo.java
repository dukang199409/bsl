package com.bsl.pojo;

import java.util.Date;

public class BslReportSaleInfo {
    private String dataDate;

    private String dataType;

    private String prodType;

    private String saleCustomer;

    private String saleRuc;

    private String saleGettype;

    private String prodName;

    private String prodNorm;

    private String prodMaterial;

    private Float prodLength;

    private Float prodBs;

    private Float prodNum;

    private Float prodWeight;

    private Float chaWeight;

    private Float retWeight;

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

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType == null ? null : dataType.trim();
    }

    public String getProdType() {
        return prodType;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType == null ? null : prodType.trim();
    }

    public String getSaleCustomer() {
        return saleCustomer;
    }

    public void setSaleCustomer(String saleCustomer) {
        this.saleCustomer = saleCustomer == null ? null : saleCustomer.trim();
    }

    public String getSaleRuc() {
        return saleRuc;
    }

    public void setSaleRuc(String saleRuc) {
        this.saleRuc = saleRuc == null ? null : saleRuc.trim();
    }

    public String getSaleGettype() {
        return saleGettype;
    }

    public void setSaleGettype(String saleGettype) {
        this.saleGettype = saleGettype == null ? null : saleGettype.trim();
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

    public Float getProdLength() {
        return prodLength;
    }

    public void setProdLength(Float prodLength) {
        this.prodLength = prodLength;
    }

    public Float getProdBs() {
        return prodBs;
    }

    public void setProdBs(Float prodBs) {
        this.prodBs = prodBs;
    }

    public Float getProdNum() {
        return prodNum;
    }

    public void setProdNum(Float prodNum) {
        this.prodNum = prodNum;
    }

    public Float getProdWeight() {
        return prodWeight;
    }

    public void setProdWeight(Float prodWeight) {
        this.prodWeight = prodWeight;
    }

    public Float getChaWeight() {
        return chaWeight;
    }

    public void setChaWeight(Float chaWeight) {
        this.chaWeight = chaWeight;
    }

    public Float getRetWeight() {
        return retWeight;
    }

    public void setRetWeight(Float retWeight) {
        this.retWeight = retWeight;
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