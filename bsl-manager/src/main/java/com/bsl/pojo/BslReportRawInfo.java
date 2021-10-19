package com.bsl.pojo;

import java.util.Date;

public class BslReportRawInfo {
    private String dataDate;

    private String dataType;

    private String prodNorm;

    private String prodMaterial;

    private Float prodNum;

    private Float prodRecordWeight;

    private Float prodRelWeight;

    private Float prodPrintWeight;

    private String prodSource;

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

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType == null ? null : dataType.trim();
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

    public Float getProdNum() {
        return prodNum;
    }

    public void setProdNum(Float prodNum) {
        this.prodNum = prodNum;
    }

    public Float getProdRecordWeight() {
        return prodRecordWeight;
    }

    public void setProdRecordWeight(Float prodRecordWeight) {
        this.prodRecordWeight = prodRecordWeight;
    }

    public Float getProdRelWeight() {
        return prodRelWeight;
    }

    public void setProdRelWeight(Float prodRelWeight) {
        this.prodRelWeight = prodRelWeight;
    }

    public Float getProdPrintWeight() {
        return prodPrintWeight;
    }

    public void setProdPrintWeight(Float prodPrintWeight) {
        this.prodPrintWeight = prodPrintWeight;
    }

    public String getProdSource() {
        return prodSource;
    }

    public void setProdSource(String prodSource) {
        this.prodSource = prodSource == null ? null : prodSource.trim();
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