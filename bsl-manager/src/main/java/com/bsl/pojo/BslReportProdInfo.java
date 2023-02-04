package com.bsl.pojo;

import java.util.Date;

public class BslReportProdInfo {
    private String dataDate;

    private String prodNorm;

    private Float prodLength;

    private String prodMaterial;

    private Float prodRuZnum;

    private Float prodRuBnum;

    private Float prodRuWeight;

    private Float prodOutZnum;

    private Float prodOutBnum;

    private Float prodOutWeight;

    private Float prodAtZnum;

    private Float prodAtBnum;

    private Float prodAtWeight;

    private String prodCustomer;

    private String remark;

    private Date crtDate;

    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate == null ? null : dataDate.trim();
    }

    public String getProdNorm() {
        return prodNorm;
    }

    public void setProdNorm(String prodNorm) {
        this.prodNorm = prodNorm == null ? null : prodNorm.trim();
    }

    public Float getProdLength() {
        return prodLength;
    }

    public void setProdLength(Float prodLength) {
        this.prodLength = prodLength;
    }

    public String getProdMaterial() {
        return prodMaterial;
    }

    public void setProdMaterial(String prodMaterial) {
        this.prodMaterial = prodMaterial == null ? null : prodMaterial.trim();
    }

    public Float getProdRuZnum() {
        return prodRuZnum;
    }

    public void setProdRuZnum(Float prodRuZnum) {
        this.prodRuZnum = prodRuZnum;
    }

    public Float getProdRuBnum() {
        return prodRuBnum;
    }

    public void setProdRuBnum(Float prodRuBnum) {
        this.prodRuBnum = prodRuBnum;
    }

    public Float getProdRuWeight() {
        return prodRuWeight;
    }

    public void setProdRuWeight(Float prodRuWeight) {
        this.prodRuWeight = prodRuWeight;
    }

    public Float getProdOutZnum() {
        return prodOutZnum;
    }

    public void setProdOutZnum(Float prodOutZnum) {
        this.prodOutZnum = prodOutZnum;
    }

    public Float getProdOutBnum() {
        return prodOutBnum;
    }

    public void setProdOutBnum(Float prodOutBnum) {
        this.prodOutBnum = prodOutBnum;
    }

    public Float getProdOutWeight() {
        return prodOutWeight;
    }

    public void setProdOutWeight(Float prodOutWeight) {
        this.prodOutWeight = prodOutWeight;
    }

    public Float getProdAtZnum() {
        return prodAtZnum;
    }

    public void setProdAtZnum(Float prodAtZnum) {
        this.prodAtZnum = prodAtZnum;
    }

    public Float getProdAtBnum() {
        return prodAtBnum;
    }

    public void setProdAtBnum(Float prodAtBnum) {
        this.prodAtBnum = prodAtBnum;
    }

    public Float getProdAtWeight() {
        return prodAtWeight;
    }

    public void setProdAtWeight(Float prodAtWeight) {
        this.prodAtWeight = prodAtWeight;
    }

    public String getProdCustomer() {
        return prodCustomer;
    }

    public void setProdCustomer(String prodCustomer) {
        this.prodCustomer = prodCustomer == null ? null : prodCustomer.trim();
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