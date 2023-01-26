package com.bsl.pojo;

import java.util.Date;

public class BslReportRawInfo {
    private String dataDate;

    private String prodNorm;

    private String prodMaterial;

    private Float prodRuWeight;

    private Float prodRuNum;

    private Float prodOutWeight;

    private Float prodOutNum;

    private Float prodAtWeight;

    private Float prodAtNum;

    private String prodCompany;

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

    public String getProdMaterial() {
        return prodMaterial;
    }

    public void setProdMaterial(String prodMaterial) {
        this.prodMaterial = prodMaterial == null ? null : prodMaterial.trim();
    }

    public Float getProdRuWeight() {
        return prodRuWeight;
    }

    public void setProdRuWeight(Float prodRuWeight) {
        this.prodRuWeight = prodRuWeight;
    }

    public Float getProdRuNum() {
        return prodRuNum;
    }

    public void setProdRuNum(Float prodRuNum) {
        this.prodRuNum = prodRuNum;
    }

    public Float getProdOutWeight() {
        return prodOutWeight;
    }

    public void setProdOutWeight(Float prodOutWeight) {
        this.prodOutWeight = prodOutWeight;
    }

    public Float getProdOutNum() {
        return prodOutNum;
    }

    public void setProdOutNum(Float prodOutNum) {
        this.prodOutNum = prodOutNum;
    }

    public Float getProdAtWeight() {
        return prodAtWeight;
    }

    public void setProdAtWeight(Float prodAtWeight) {
        this.prodAtWeight = prodAtWeight;
    }

    public Float getProdAtNum() {
        return prodAtNum;
    }

    public void setProdAtNum(Float prodAtNum) {
        this.prodAtNum = prodAtNum;
    }

    public String getProdCompany() {
        return prodCompany;
    }

    public void setProdCompany(String prodCompany) {
        this.prodCompany = prodCompany == null ? null : prodCompany.trim();
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