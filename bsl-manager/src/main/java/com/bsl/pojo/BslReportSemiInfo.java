package com.bsl.pojo;

import java.util.Date;

public class BslReportSemiInfo {
    private String dataDate;

    private String prodMakeJz;

    private String prodBc;

    private String prodNorm;

    private String prodMaterial;

    private Float prodRuWeight;

    private Float prodRuNum;

    private Float prodTouWeight;

    private Float prodTouNum;

    private String ccrate;

    private Float prodOutWeight;

    private Float prodOutNum;

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

    public Float getProdTouWeight() {
        return prodTouWeight;
    }

    public void setProdTouWeight(Float prodTouWeight) {
        this.prodTouWeight = prodTouWeight;
    }

    public Float getProdTouNum() {
        return prodTouNum;
    }

    public void setProdTouNum(Float prodTouNum) {
        this.prodTouNum = prodTouNum;
    }

    public String getCcrate() {
        return ccrate;
    }

    public void setCcrate(String ccrate) {
        this.ccrate = ccrate == null ? null : ccrate.trim();
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