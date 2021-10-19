package com.bsl.pojo;

import java.util.Date;

public class BslReportProdMakeInfo {
    private String dataDate;

    private String dataType;

    private String prodType;

    private String prodJz;

    private String prodPlanNo;

    private String prodNorm;

    private String prodMaterial;

    private Float prodBs;

    private Float prodZs;

    private Float prodWeight;

    private String prodUseNorm;

    private Float prodUseNum;

    private Float prodUseWeight;

    private Float prodDclWeight;

    private Float prodFlWeight;

    private Float prodCcl;

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

    public String getProdJz() {
        return prodJz;
    }

    public void setProdJz(String prodJz) {
        this.prodJz = prodJz == null ? null : prodJz.trim();
    }

    public String getProdPlanNo() {
        return prodPlanNo;
    }

    public void setProdPlanNo(String prodPlanNo) {
        this.prodPlanNo = prodPlanNo == null ? null : prodPlanNo.trim();
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

    public Float getProdBs() {
        return prodBs;
    }

    public void setProdBs(Float prodBs) {
        this.prodBs = prodBs;
    }

    public Float getProdZs() {
        return prodZs;
    }

    public void setProdZs(Float prodZs) {
        this.prodZs = prodZs;
    }

    public Float getProdWeight() {
        return prodWeight;
    }

    public void setProdWeight(Float prodWeight) {
        this.prodWeight = prodWeight;
    }

    public String getProdUseNorm() {
        return prodUseNorm;
    }

    public void setProdUseNorm(String prodUseNorm) {
        this.prodUseNorm = prodUseNorm == null ? null : prodUseNorm.trim();
    }

    public Float getProdUseNum() {
        return prodUseNum;
    }

    public void setProdUseNum(Float prodUseNum) {
        this.prodUseNum = prodUseNum;
    }

    public Float getProdUseWeight() {
        return prodUseWeight;
    }

    public void setProdUseWeight(Float prodUseWeight) {
        this.prodUseWeight = prodUseWeight;
    }

    public Float getProdDclWeight() {
        return prodDclWeight;
    }

    public void setProdDclWeight(Float prodDclWeight) {
        this.prodDclWeight = prodDclWeight;
    }

    public Float getProdFlWeight() {
        return prodFlWeight;
    }

    public void setProdFlWeight(Float prodFlWeight) {
        this.prodFlWeight = prodFlWeight;
    }

    public Float getProdCcl() {
        return prodCcl;
    }

    public void setProdCcl(Float prodCcl) {
        this.prodCcl = prodCcl;
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