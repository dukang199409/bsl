package com.bsl.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BslReportProdMakeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BslReportProdMakeInfoExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andDataDateIsNull() {
            addCriterion("data_date is null");
            return (Criteria) this;
        }

        public Criteria andDataDateIsNotNull() {
            addCriterion("data_date is not null");
            return (Criteria) this;
        }

        public Criteria andDataDateEqualTo(String value) {
            addCriterion("data_date =", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateNotEqualTo(String value) {
            addCriterion("data_date <>", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateGreaterThan(String value) {
            addCriterion("data_date >", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateGreaterThanOrEqualTo(String value) {
            addCriterion("data_date >=", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateLessThan(String value) {
            addCriterion("data_date <", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateLessThanOrEqualTo(String value) {
            addCriterion("data_date <=", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateLike(String value) {
            addCriterion("data_date like", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateNotLike(String value) {
            addCriterion("data_date not like", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateIn(List<String> values) {
            addCriterion("data_date in", values, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateNotIn(List<String> values) {
            addCriterion("data_date not in", values, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateBetween(String value1, String value2) {
            addCriterion("data_date between", value1, value2, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateNotBetween(String value1, String value2) {
            addCriterion("data_date not between", value1, value2, "dataDate");
            return (Criteria) this;
        }

        public Criteria andProdMakeJzIsNull() {
            addCriterion("prod_make_jz is null");
            return (Criteria) this;
        }

        public Criteria andProdMakeJzIsNotNull() {
            addCriterion("prod_make_jz is not null");
            return (Criteria) this;
        }

        public Criteria andProdMakeJzEqualTo(String value) {
            addCriterion("prod_make_jz =", value, "prodMakeJz");
            return (Criteria) this;
        }

        public Criteria andProdMakeJzNotEqualTo(String value) {
            addCriterion("prod_make_jz <>", value, "prodMakeJz");
            return (Criteria) this;
        }

        public Criteria andProdMakeJzGreaterThan(String value) {
            addCriterion("prod_make_jz >", value, "prodMakeJz");
            return (Criteria) this;
        }

        public Criteria andProdMakeJzGreaterThanOrEqualTo(String value) {
            addCriterion("prod_make_jz >=", value, "prodMakeJz");
            return (Criteria) this;
        }

        public Criteria andProdMakeJzLessThan(String value) {
            addCriterion("prod_make_jz <", value, "prodMakeJz");
            return (Criteria) this;
        }

        public Criteria andProdMakeJzLessThanOrEqualTo(String value) {
            addCriterion("prod_make_jz <=", value, "prodMakeJz");
            return (Criteria) this;
        }

        public Criteria andProdMakeJzLike(String value) {
            addCriterion("prod_make_jz like", value, "prodMakeJz");
            return (Criteria) this;
        }

        public Criteria andProdMakeJzNotLike(String value) {
            addCriterion("prod_make_jz not like", value, "prodMakeJz");
            return (Criteria) this;
        }

        public Criteria andProdMakeJzIn(List<String> values) {
            addCriterion("prod_make_jz in", values, "prodMakeJz");
            return (Criteria) this;
        }

        public Criteria andProdMakeJzNotIn(List<String> values) {
            addCriterion("prod_make_jz not in", values, "prodMakeJz");
            return (Criteria) this;
        }

        public Criteria andProdMakeJzBetween(String value1, String value2) {
            addCriterion("prod_make_jz between", value1, value2, "prodMakeJz");
            return (Criteria) this;
        }

        public Criteria andProdMakeJzNotBetween(String value1, String value2) {
            addCriterion("prod_make_jz not between", value1, value2, "prodMakeJz");
            return (Criteria) this;
        }

        public Criteria andProdBcIsNull() {
            addCriterion("prod_bc is null");
            return (Criteria) this;
        }

        public Criteria andProdBcIsNotNull() {
            addCriterion("prod_bc is not null");
            return (Criteria) this;
        }

        public Criteria andProdBcEqualTo(String value) {
            addCriterion("prod_bc =", value, "prodBc");
            return (Criteria) this;
        }

        public Criteria andProdBcNotEqualTo(String value) {
            addCriterion("prod_bc <>", value, "prodBc");
            return (Criteria) this;
        }

        public Criteria andProdBcGreaterThan(String value) {
            addCriterion("prod_bc >", value, "prodBc");
            return (Criteria) this;
        }

        public Criteria andProdBcGreaterThanOrEqualTo(String value) {
            addCriterion("prod_bc >=", value, "prodBc");
            return (Criteria) this;
        }

        public Criteria andProdBcLessThan(String value) {
            addCriterion("prod_bc <", value, "prodBc");
            return (Criteria) this;
        }

        public Criteria andProdBcLessThanOrEqualTo(String value) {
            addCriterion("prod_bc <=", value, "prodBc");
            return (Criteria) this;
        }

        public Criteria andProdBcLike(String value) {
            addCriterion("prod_bc like", value, "prodBc");
            return (Criteria) this;
        }

        public Criteria andProdBcNotLike(String value) {
            addCriterion("prod_bc not like", value, "prodBc");
            return (Criteria) this;
        }

        public Criteria andProdBcIn(List<String> values) {
            addCriterion("prod_bc in", values, "prodBc");
            return (Criteria) this;
        }

        public Criteria andProdBcNotIn(List<String> values) {
            addCriterion("prod_bc not in", values, "prodBc");
            return (Criteria) this;
        }

        public Criteria andProdBcBetween(String value1, String value2) {
            addCriterion("prod_bc between", value1, value2, "prodBc");
            return (Criteria) this;
        }

        public Criteria andProdBcNotBetween(String value1, String value2) {
            addCriterion("prod_bc not between", value1, value2, "prodBc");
            return (Criteria) this;
        }

        public Criteria andProdLengthIsNull() {
            addCriterion("prod_length is null");
            return (Criteria) this;
        }

        public Criteria andProdLengthIsNotNull() {
            addCriterion("prod_length is not null");
            return (Criteria) this;
        }

        public Criteria andProdLengthEqualTo(Float value) {
            addCriterion("prod_length =", value, "prodLength");
            return (Criteria) this;
        }

        public Criteria andProdLengthNotEqualTo(Float value) {
            addCriterion("prod_length <>", value, "prodLength");
            return (Criteria) this;
        }

        public Criteria andProdLengthGreaterThan(Float value) {
            addCriterion("prod_length >", value, "prodLength");
            return (Criteria) this;
        }

        public Criteria andProdLengthGreaterThanOrEqualTo(Float value) {
            addCriterion("prod_length >=", value, "prodLength");
            return (Criteria) this;
        }

        public Criteria andProdLengthLessThan(Float value) {
            addCriterion("prod_length <", value, "prodLength");
            return (Criteria) this;
        }

        public Criteria andProdLengthLessThanOrEqualTo(Float value) {
            addCriterion("prod_length <=", value, "prodLength");
            return (Criteria) this;
        }

        public Criteria andProdLengthIn(List<Float> values) {
            addCriterion("prod_length in", values, "prodLength");
            return (Criteria) this;
        }

        public Criteria andProdLengthNotIn(List<Float> values) {
            addCriterion("prod_length not in", values, "prodLength");
            return (Criteria) this;
        }

        public Criteria andProdLengthBetween(Float value1, Float value2) {
            addCriterion("prod_length between", value1, value2, "prodLength");
            return (Criteria) this;
        }

        public Criteria andProdLengthNotBetween(Float value1, Float value2) {
            addCriterion("prod_length not between", value1, value2, "prodLength");
            return (Criteria) this;
        }

        public Criteria andProdNormIsNull() {
            addCriterion("prod_norm is null");
            return (Criteria) this;
        }

        public Criteria andProdNormIsNotNull() {
            addCriterion("prod_norm is not null");
            return (Criteria) this;
        }

        public Criteria andProdNormEqualTo(String value) {
            addCriterion("prod_norm =", value, "prodNorm");
            return (Criteria) this;
        }

        public Criteria andProdNormNotEqualTo(String value) {
            addCriterion("prod_norm <>", value, "prodNorm");
            return (Criteria) this;
        }

        public Criteria andProdNormGreaterThan(String value) {
            addCriterion("prod_norm >", value, "prodNorm");
            return (Criteria) this;
        }

        public Criteria andProdNormGreaterThanOrEqualTo(String value) {
            addCriterion("prod_norm >=", value, "prodNorm");
            return (Criteria) this;
        }

        public Criteria andProdNormLessThan(String value) {
            addCriterion("prod_norm <", value, "prodNorm");
            return (Criteria) this;
        }

        public Criteria andProdNormLessThanOrEqualTo(String value) {
            addCriterion("prod_norm <=", value, "prodNorm");
            return (Criteria) this;
        }

        public Criteria andProdNormLike(String value) {
            addCriterion("prod_norm like", value, "prodNorm");
            return (Criteria) this;
        }

        public Criteria andProdNormNotLike(String value) {
            addCriterion("prod_norm not like", value, "prodNorm");
            return (Criteria) this;
        }

        public Criteria andProdNormIn(List<String> values) {
            addCriterion("prod_norm in", values, "prodNorm");
            return (Criteria) this;
        }

        public Criteria andProdNormNotIn(List<String> values) {
            addCriterion("prod_norm not in", values, "prodNorm");
            return (Criteria) this;
        }

        public Criteria andProdNormBetween(String value1, String value2) {
            addCriterion("prod_norm between", value1, value2, "prodNorm");
            return (Criteria) this;
        }

        public Criteria andProdNormNotBetween(String value1, String value2) {
            addCriterion("prod_norm not between", value1, value2, "prodNorm");
            return (Criteria) this;
        }

        public Criteria andProdMaterialIsNull() {
            addCriterion("prod_material is null");
            return (Criteria) this;
        }

        public Criteria andProdMaterialIsNotNull() {
            addCriterion("prod_material is not null");
            return (Criteria) this;
        }

        public Criteria andProdMaterialEqualTo(String value) {
            addCriterion("prod_material =", value, "prodMaterial");
            return (Criteria) this;
        }

        public Criteria andProdMaterialNotEqualTo(String value) {
            addCriterion("prod_material <>", value, "prodMaterial");
            return (Criteria) this;
        }

        public Criteria andProdMaterialGreaterThan(String value) {
            addCriterion("prod_material >", value, "prodMaterial");
            return (Criteria) this;
        }

        public Criteria andProdMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("prod_material >=", value, "prodMaterial");
            return (Criteria) this;
        }

        public Criteria andProdMaterialLessThan(String value) {
            addCriterion("prod_material <", value, "prodMaterial");
            return (Criteria) this;
        }

        public Criteria andProdMaterialLessThanOrEqualTo(String value) {
            addCriterion("prod_material <=", value, "prodMaterial");
            return (Criteria) this;
        }

        public Criteria andProdMaterialLike(String value) {
            addCriterion("prod_material like", value, "prodMaterial");
            return (Criteria) this;
        }

        public Criteria andProdMaterialNotLike(String value) {
            addCriterion("prod_material not like", value, "prodMaterial");
            return (Criteria) this;
        }

        public Criteria andProdMaterialIn(List<String> values) {
            addCriterion("prod_material in", values, "prodMaterial");
            return (Criteria) this;
        }

        public Criteria andProdMaterialNotIn(List<String> values) {
            addCriterion("prod_material not in", values, "prodMaterial");
            return (Criteria) this;
        }

        public Criteria andProdMaterialBetween(String value1, String value2) {
            addCriterion("prod_material between", value1, value2, "prodMaterial");
            return (Criteria) this;
        }

        public Criteria andProdMaterialNotBetween(String value1, String value2) {
            addCriterion("prod_material not between", value1, value2, "prodMaterial");
            return (Criteria) this;
        }

        public Criteria andProdRuZnumIsNull() {
            addCriterion("prod_ru_znum is null");
            return (Criteria) this;
        }

        public Criteria andProdRuZnumIsNotNull() {
            addCriterion("prod_ru_znum is not null");
            return (Criteria) this;
        }

        public Criteria andProdRuZnumEqualTo(Float value) {
            addCriterion("prod_ru_znum =", value, "prodRuZnum");
            return (Criteria) this;
        }

        public Criteria andProdRuZnumNotEqualTo(Float value) {
            addCriterion("prod_ru_znum <>", value, "prodRuZnum");
            return (Criteria) this;
        }

        public Criteria andProdRuZnumGreaterThan(Float value) {
            addCriterion("prod_ru_znum >", value, "prodRuZnum");
            return (Criteria) this;
        }

        public Criteria andProdRuZnumGreaterThanOrEqualTo(Float value) {
            addCriterion("prod_ru_znum >=", value, "prodRuZnum");
            return (Criteria) this;
        }

        public Criteria andProdRuZnumLessThan(Float value) {
            addCriterion("prod_ru_znum <", value, "prodRuZnum");
            return (Criteria) this;
        }

        public Criteria andProdRuZnumLessThanOrEqualTo(Float value) {
            addCriterion("prod_ru_znum <=", value, "prodRuZnum");
            return (Criteria) this;
        }

        public Criteria andProdRuZnumIn(List<Float> values) {
            addCriterion("prod_ru_znum in", values, "prodRuZnum");
            return (Criteria) this;
        }

        public Criteria andProdRuZnumNotIn(List<Float> values) {
            addCriterion("prod_ru_znum not in", values, "prodRuZnum");
            return (Criteria) this;
        }

        public Criteria andProdRuZnumBetween(Float value1, Float value2) {
            addCriterion("prod_ru_znum between", value1, value2, "prodRuZnum");
            return (Criteria) this;
        }

        public Criteria andProdRuZnumNotBetween(Float value1, Float value2) {
            addCriterion("prod_ru_znum not between", value1, value2, "prodRuZnum");
            return (Criteria) this;
        }

        public Criteria andProdRuBnumIsNull() {
            addCriterion("prod_ru_bnum is null");
            return (Criteria) this;
        }

        public Criteria andProdRuBnumIsNotNull() {
            addCriterion("prod_ru_bnum is not null");
            return (Criteria) this;
        }

        public Criteria andProdRuBnumEqualTo(Float value) {
            addCriterion("prod_ru_bnum =", value, "prodRuBnum");
            return (Criteria) this;
        }

        public Criteria andProdRuBnumNotEqualTo(Float value) {
            addCriterion("prod_ru_bnum <>", value, "prodRuBnum");
            return (Criteria) this;
        }

        public Criteria andProdRuBnumGreaterThan(Float value) {
            addCriterion("prod_ru_bnum >", value, "prodRuBnum");
            return (Criteria) this;
        }

        public Criteria andProdRuBnumGreaterThanOrEqualTo(Float value) {
            addCriterion("prod_ru_bnum >=", value, "prodRuBnum");
            return (Criteria) this;
        }

        public Criteria andProdRuBnumLessThan(Float value) {
            addCriterion("prod_ru_bnum <", value, "prodRuBnum");
            return (Criteria) this;
        }

        public Criteria andProdRuBnumLessThanOrEqualTo(Float value) {
            addCriterion("prod_ru_bnum <=", value, "prodRuBnum");
            return (Criteria) this;
        }

        public Criteria andProdRuBnumIn(List<Float> values) {
            addCriterion("prod_ru_bnum in", values, "prodRuBnum");
            return (Criteria) this;
        }

        public Criteria andProdRuBnumNotIn(List<Float> values) {
            addCriterion("prod_ru_bnum not in", values, "prodRuBnum");
            return (Criteria) this;
        }

        public Criteria andProdRuBnumBetween(Float value1, Float value2) {
            addCriterion("prod_ru_bnum between", value1, value2, "prodRuBnum");
            return (Criteria) this;
        }

        public Criteria andProdRuBnumNotBetween(Float value1, Float value2) {
            addCriterion("prod_ru_bnum not between", value1, value2, "prodRuBnum");
            return (Criteria) this;
        }

        public Criteria andProdRuWeightIsNull() {
            addCriterion("prod_ru_weight is null");
            return (Criteria) this;
        }

        public Criteria andProdRuWeightIsNotNull() {
            addCriterion("prod_ru_weight is not null");
            return (Criteria) this;
        }

        public Criteria andProdRuWeightEqualTo(Float value) {
            addCriterion("prod_ru_weight =", value, "prodRuWeight");
            return (Criteria) this;
        }

        public Criteria andProdRuWeightNotEqualTo(Float value) {
            addCriterion("prod_ru_weight <>", value, "prodRuWeight");
            return (Criteria) this;
        }

        public Criteria andProdRuWeightGreaterThan(Float value) {
            addCriterion("prod_ru_weight >", value, "prodRuWeight");
            return (Criteria) this;
        }

        public Criteria andProdRuWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("prod_ru_weight >=", value, "prodRuWeight");
            return (Criteria) this;
        }

        public Criteria andProdRuWeightLessThan(Float value) {
            addCriterion("prod_ru_weight <", value, "prodRuWeight");
            return (Criteria) this;
        }

        public Criteria andProdRuWeightLessThanOrEqualTo(Float value) {
            addCriterion("prod_ru_weight <=", value, "prodRuWeight");
            return (Criteria) this;
        }

        public Criteria andProdRuWeightIn(List<Float> values) {
            addCriterion("prod_ru_weight in", values, "prodRuWeight");
            return (Criteria) this;
        }

        public Criteria andProdRuWeightNotIn(List<Float> values) {
            addCriterion("prod_ru_weight not in", values, "prodRuWeight");
            return (Criteria) this;
        }

        public Criteria andProdRuWeightBetween(Float value1, Float value2) {
            addCriterion("prod_ru_weight between", value1, value2, "prodRuWeight");
            return (Criteria) this;
        }

        public Criteria andProdRuWeightNotBetween(Float value1, Float value2) {
            addCriterion("prod_ru_weight not between", value1, value2, "prodRuWeight");
            return (Criteria) this;
        }

        public Criteria andProdTouNumIsNull() {
            addCriterion("prod_tou_num is null");
            return (Criteria) this;
        }

        public Criteria andProdTouNumIsNotNull() {
            addCriterion("prod_tou_num is not null");
            return (Criteria) this;
        }

        public Criteria andProdTouNumEqualTo(Float value) {
            addCriterion("prod_tou_num =", value, "prodTouNum");
            return (Criteria) this;
        }

        public Criteria andProdTouNumNotEqualTo(Float value) {
            addCriterion("prod_tou_num <>", value, "prodTouNum");
            return (Criteria) this;
        }

        public Criteria andProdTouNumGreaterThan(Float value) {
            addCriterion("prod_tou_num >", value, "prodTouNum");
            return (Criteria) this;
        }

        public Criteria andProdTouNumGreaterThanOrEqualTo(Float value) {
            addCriterion("prod_tou_num >=", value, "prodTouNum");
            return (Criteria) this;
        }

        public Criteria andProdTouNumLessThan(Float value) {
            addCriterion("prod_tou_num <", value, "prodTouNum");
            return (Criteria) this;
        }

        public Criteria andProdTouNumLessThanOrEqualTo(Float value) {
            addCriterion("prod_tou_num <=", value, "prodTouNum");
            return (Criteria) this;
        }

        public Criteria andProdTouNumIn(List<Float> values) {
            addCriterion("prod_tou_num in", values, "prodTouNum");
            return (Criteria) this;
        }

        public Criteria andProdTouNumNotIn(List<Float> values) {
            addCriterion("prod_tou_num not in", values, "prodTouNum");
            return (Criteria) this;
        }

        public Criteria andProdTouNumBetween(Float value1, Float value2) {
            addCriterion("prod_tou_num between", value1, value2, "prodTouNum");
            return (Criteria) this;
        }

        public Criteria andProdTouNumNotBetween(Float value1, Float value2) {
            addCriterion("prod_tou_num not between", value1, value2, "prodTouNum");
            return (Criteria) this;
        }

        public Criteria andProdTouWeightIsNull() {
            addCriterion("prod_tou_weight is null");
            return (Criteria) this;
        }

        public Criteria andProdTouWeightIsNotNull() {
            addCriterion("prod_tou_weight is not null");
            return (Criteria) this;
        }

        public Criteria andProdTouWeightEqualTo(Float value) {
            addCriterion("prod_tou_weight =", value, "prodTouWeight");
            return (Criteria) this;
        }

        public Criteria andProdTouWeightNotEqualTo(Float value) {
            addCriterion("prod_tou_weight <>", value, "prodTouWeight");
            return (Criteria) this;
        }

        public Criteria andProdTouWeightGreaterThan(Float value) {
            addCriterion("prod_tou_weight >", value, "prodTouWeight");
            return (Criteria) this;
        }

        public Criteria andProdTouWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("prod_tou_weight >=", value, "prodTouWeight");
            return (Criteria) this;
        }

        public Criteria andProdTouWeightLessThan(Float value) {
            addCriterion("prod_tou_weight <", value, "prodTouWeight");
            return (Criteria) this;
        }

        public Criteria andProdTouWeightLessThanOrEqualTo(Float value) {
            addCriterion("prod_tou_weight <=", value, "prodTouWeight");
            return (Criteria) this;
        }

        public Criteria andProdTouWeightIn(List<Float> values) {
            addCriterion("prod_tou_weight in", values, "prodTouWeight");
            return (Criteria) this;
        }

        public Criteria andProdTouWeightNotIn(List<Float> values) {
            addCriterion("prod_tou_weight not in", values, "prodTouWeight");
            return (Criteria) this;
        }

        public Criteria andProdTouWeightBetween(Float value1, Float value2) {
            addCriterion("prod_tou_weight between", value1, value2, "prodTouWeight");
            return (Criteria) this;
        }

        public Criteria andProdTouWeightNotBetween(Float value1, Float value2) {
            addCriterion("prod_tou_weight not between", value1, value2, "prodTouWeight");
            return (Criteria) this;
        }

        public Criteria andCcrateIsNull() {
            addCriterion("ccrate is null");
            return (Criteria) this;
        }

        public Criteria andCcrateIsNotNull() {
            addCriterion("ccrate is not null");
            return (Criteria) this;
        }

        public Criteria andCcrateEqualTo(String value) {
            addCriterion("ccrate =", value, "ccrate");
            return (Criteria) this;
        }

        public Criteria andCcrateNotEqualTo(String value) {
            addCriterion("ccrate <>", value, "ccrate");
            return (Criteria) this;
        }

        public Criteria andCcrateGreaterThan(String value) {
            addCriterion("ccrate >", value, "ccrate");
            return (Criteria) this;
        }

        public Criteria andCcrateGreaterThanOrEqualTo(String value) {
            addCriterion("ccrate >=", value, "ccrate");
            return (Criteria) this;
        }

        public Criteria andCcrateLessThan(String value) {
            addCriterion("ccrate <", value, "ccrate");
            return (Criteria) this;
        }

        public Criteria andCcrateLessThanOrEqualTo(String value) {
            addCriterion("ccrate <=", value, "ccrate");
            return (Criteria) this;
        }

        public Criteria andCcrateLike(String value) {
            addCriterion("ccrate like", value, "ccrate");
            return (Criteria) this;
        }

        public Criteria andCcrateNotLike(String value) {
            addCriterion("ccrate not like", value, "ccrate");
            return (Criteria) this;
        }

        public Criteria andCcrateIn(List<String> values) {
            addCriterion("ccrate in", values, "ccrate");
            return (Criteria) this;
        }

        public Criteria andCcrateNotIn(List<String> values) {
            addCriterion("ccrate not in", values, "ccrate");
            return (Criteria) this;
        }

        public Criteria andCcrateBetween(String value1, String value2) {
            addCriterion("ccrate between", value1, value2, "ccrate");
            return (Criteria) this;
        }

        public Criteria andCcrateNotBetween(String value1, String value2) {
            addCriterion("ccrate not between", value1, value2, "ccrate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCrtDateIsNull() {
            addCriterion("crt_date is null");
            return (Criteria) this;
        }

        public Criteria andCrtDateIsNotNull() {
            addCriterion("crt_date is not null");
            return (Criteria) this;
        }

        public Criteria andCrtDateEqualTo(Date value) {
            addCriterionForJDBCDate("crt_date =", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("crt_date <>", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateGreaterThan(Date value) {
            addCriterionForJDBCDate("crt_date >", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("crt_date >=", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateLessThan(Date value) {
            addCriterionForJDBCDate("crt_date <", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("crt_date <=", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateIn(List<Date> values) {
            addCriterionForJDBCDate("crt_date in", values, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("crt_date not in", values, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("crt_date between", value1, value2, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("crt_date not between", value1, value2, "crtDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}