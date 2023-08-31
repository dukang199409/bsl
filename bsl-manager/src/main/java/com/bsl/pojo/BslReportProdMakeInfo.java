package com.bsl.pojo;

import java.util.Date;

public class BslReportProdMakeInfo {
    private String dataDate;

    private String prodMakeJz;

    private String prodBc;

    private Float prodLength;

    private String prodNorm;

    private String prodMaterial;

    private Float prodRuZnum;

    private Float prodRuBnum;

    private Float prodRuWeight;

    private Float prodTouNum;

    private Float prodTouWeight;

    private String ccrate;

    private String remark;

    private Date crtDate;

    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate == null ? null : dataDate.trim();
    }

    public String getProdMakeJz() {
        return prodMakeJz;
    }

    public void setProdMakeJz(String prodMakeJz) {
        this.prodMakeJz = prodMakeJz == null ? null : prodMakeJz.trim();
    }

    public String getProdBc() {
        return prodBc;
    }

    public void setProdBc(String prodBc) {
        this.prodBc = prodBc == null ? null : prodBc.trim();
    }

    public Float getProdLength() {
        return prodLength;
    }

    public void setProdLength(Float prodLength) {
        this.prodLength = prodLength;
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

    public Float getProdTouNum() {
        return prodTouNum;
    }

    public void setProdTouNum(Float prodTouNum) {
        this.prodTouNum = prodTouNum;
    }

    public Float getProdTouWeight() {
        return prodTouWeight;
    }

    public void setProdTouWeight(Float prodTouWeight) {
        this.prodTouWeight = prodTouWeight;
    }

    public String getCcrate() {
        return ccrate;
    }

    public void setCcrate(String ccrate) {
        this.ccrate = ccrate == null ? null : ccrate.trim();
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