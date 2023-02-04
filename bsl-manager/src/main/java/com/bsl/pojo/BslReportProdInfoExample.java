package com.bsl.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BslReportProdInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BslReportProdInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
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

        public Criteria andProdOutZnumIsNull() {
            addCriterion("prod_out_znum is null");
            return (Criteria) this;
        }

        public Criteria andProdOutZnumIsNotNull() {
            addCriterion("prod_out_znum is not null");
            return (Criteria) this;
        }

        public Criteria andProdOutZnumEqualTo(Float value) {
            addCriterion("prod_out_znum =", value, "prodOutZnum");
            return (Criteria) this;
        }

        public Criteria andProdOutZnumNotEqualTo(Float value) {
            addCriterion("prod_out_znum <>", value, "prodOutZnum");
            return (Criteria) this;
        }

        public Criteria andProdOutZnumGreaterThan(Float value) {
            addCriterion("prod_out_znum >", value, "prodOutZnum");
            return (Criteria) this;
        }

        public Criteria andProdOutZnumGreaterThanOrEqualTo(Float value) {
            addCriterion("prod_out_znum >=", value, "prodOutZnum");
            return (Criteria) this;
        }

        public Criteria andProdOutZnumLessThan(Float value) {
            addCriterion("prod_out_znum <", value, "prodOutZnum");
            return (Criteria) this;
        }

        public Criteria andProdOutZnumLessThanOrEqualTo(Float value) {
            addCriterion("prod_out_znum <=", value, "prodOutZnum");
            return (Criteria) this;
        }

        public Criteria andProdOutZnumIn(List<Float> values) {
            addCriterion("prod_out_znum in", values, "prodOutZnum");
            return (Criteria) this;
        }

        public Criteria andProdOutZnumNotIn(List<Float> values) {
            addCriterion("prod_out_znum not in", values, "prodOutZnum");
            return (Criteria) this;
        }

        public Criteria andProdOutZnumBetween(Float value1, Float value2) {
            addCriterion("prod_out_znum between", value1, value2, "prodOutZnum");
            return (Criteria) this;
        }

        public Criteria andProdOutZnumNotBetween(Float value1, Float value2) {
            addCriterion("prod_out_znum not between", value1, value2, "prodOutZnum");
            return (Criteria) this;
        }

        public Criteria andProdOutBnumIsNull() {
            addCriterion("prod_out_bnum is null");
            return (Criteria) this;
        }

        public Criteria andProdOutBnumIsNotNull() {
            addCriterion("prod_out_bnum is not null");
            return (Criteria) this;
        }

        public Criteria andProdOutBnumEqualTo(Float value) {
            addCriterion("prod_out_bnum =", value, "prodOutBnum");
            return (Criteria) this;
        }

        public Criteria andProdOutBnumNotEqualTo(Float value) {
            addCriterion("prod_out_bnum <>", value, "prodOutBnum");
            return (Criteria) this;
        }

        public Criteria andProdOutBnumGreaterThan(Float value) {
            addCriterion("prod_out_bnum >", value, "prodOutBnum");
            return (Criteria) this;
        }

        public Criteria andProdOutBnumGreaterThanOrEqualTo(Float value) {
            addCriterion("prod_out_bnum >=", value, "prodOutBnum");
            return (Criteria) this;
        }

        public Criteria andProdOutBnumLessThan(Float value) {
            addCriterion("prod_out_bnum <", value, "prodOutBnum");
            return (Criteria) this;
        }

        public Criteria andProdOutBnumLessThanOrEqualTo(Float value) {
            addCriterion("prod_out_bnum <=", value, "prodOutBnum");
            return (Criteria) this;
        }

        public Criteria andProdOutBnumIn(List<Float> values) {
            addCriterion("prod_out_bnum in", values, "prodOutBnum");
            return (Criteria) this;
        }

        public Criteria andProdOutBnumNotIn(List<Float> values) {
            addCriterion("prod_out_bnum not in", values, "prodOutBnum");
            return (Criteria) this;
        }

        public Criteria andProdOutBnumBetween(Float value1, Float value2) {
            addCriterion("prod_out_bnum between", value1, value2, "prodOutBnum");
            return (Criteria) this;
        }

        public Criteria andProdOutBnumNotBetween(Float value1, Float value2) {
            addCriterion("prod_out_bnum not between", value1, value2, "prodOutBnum");
            return (Criteria) this;
        }

        public Criteria andProdOutWeightIsNull() {
            addCriterion("prod_out_weight is null");
            return (Criteria) this;
        }

        public Criteria andProdOutWeightIsNotNull() {
            addCriterion("prod_out_weight is not null");
            return (Criteria) this;
        }

        public Criteria andProdOutWeightEqualTo(Float value) {
            addCriterion("prod_out_weight =", value, "prodOutWeight");
            return (Criteria) this;
        }

        public Criteria andProdOutWeightNotEqualTo(Float value) {
            addCriterion("prod_out_weight <>", value, "prodOutWeight");
            return (Criteria) this;
        }

        public Criteria andProdOutWeightGreaterThan(Float value) {
            addCriterion("prod_out_weight >", value, "prodOutWeight");
            return (Criteria) this;
        }

        public Criteria andProdOutWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("prod_out_weight >=", value, "prodOutWeight");
            return (Criteria) this;
        }

        public Criteria andProdOutWeightLessThan(Float value) {
            addCriterion("prod_out_weight <", value, "prodOutWeight");
            return (Criteria) this;
        }

        public Criteria andProdOutWeightLessThanOrEqualTo(Float value) {
            addCriterion("prod_out_weight <=", value, "prodOutWeight");
            return (Criteria) this;
        }

        public Criteria andProdOutWeightIn(List<Float> values) {
            addCriterion("prod_out_weight in", values, "prodOutWeight");
            return (Criteria) this;
        }

        public Criteria andProdOutWeightNotIn(List<Float> values) {
            addCriterion("prod_out_weight not in", values, "prodOutWeight");
            return (Criteria) this;
        }

        public Criteria andProdOutWeightBetween(Float value1, Float value2) {
            addCriterion("prod_out_weight between", value1, value2, "prodOutWeight");
            return (Criteria) this;
        }

        public Criteria andProdOutWeightNotBetween(Float value1, Float value2) {
            addCriterion("prod_out_weight not between", value1, value2, "prodOutWeight");
            return (Criteria) this;
        }

        public Criteria andProdAtZnumIsNull() {
            addCriterion("prod_at_znum is null");
            return (Criteria) this;
        }

        public Criteria andProdAtZnumIsNotNull() {
            addCriterion("prod_at_znum is not null");
            return (Criteria) this;
        }

        public Criteria andProdAtZnumEqualTo(Float value) {
            addCriterion("prod_at_znum =", value, "prodAtZnum");
            return (Criteria) this;
        }

        public Criteria andProdAtZnumNotEqualTo(Float value) {
            addCriterion("prod_at_znum <>", value, "prodAtZnum");
            return (Criteria) this;
        }

        public Criteria andProdAtZnumGreaterThan(Float value) {
            addCriterion("prod_at_znum >", value, "prodAtZnum");
            return (Criteria) this;
        }

        public Criteria andProdAtZnumGreaterThanOrEqualTo(Float value) {
            addCriterion("prod_at_znum >=", value, "prodAtZnum");
            return (Criteria) this;
        }

        public Criteria andProdAtZnumLessThan(Float value) {
            addCriterion("prod_at_znum <", value, "prodAtZnum");
            return (Criteria) this;
        }

        public Criteria andProdAtZnumLessThanOrEqualTo(Float value) {
            addCriterion("prod_at_znum <=", value, "prodAtZnum");
            return (Criteria) this;
        }

        public Criteria andProdAtZnumIn(List<Float> values) {
            addCriterion("prod_at_znum in", values, "prodAtZnum");
            return (Criteria) this;
        }

        public Criteria andProdAtZnumNotIn(List<Float> values) {
            addCriterion("prod_at_znum not in", values, "prodAtZnum");
            return (Criteria) this;
        }

        public Criteria andProdAtZnumBetween(Float value1, Float value2) {
            addCriterion("prod_at_znum between", value1, value2, "prodAtZnum");
            return (Criteria) this;
        }

        public Criteria andProdAtZnumNotBetween(Float value1, Float value2) {
            addCriterion("prod_at_znum not between", value1, value2, "prodAtZnum");
            return (Criteria) this;
        }

        public Criteria andProdAtBnumIsNull() {
            addCriterion("prod_at_bnum is null");
            return (Criteria) this;
        }

        public Criteria andProdAtBnumIsNotNull() {
            addCriterion("prod_at_bnum is not null");
            return (Criteria) this;
        }

        public Criteria andProdAtBnumEqualTo(Float value) {
            addCriterion("prod_at_bnum =", value, "prodAtBnum");
            return (Criteria) this;
        }

        public Criteria andProdAtBnumNotEqualTo(Float value) {
            addCriterion("prod_at_bnum <>", value, "prodAtBnum");
            return (Criteria) this;
        }

        public Criteria andProdAtBnumGreaterThan(Float value) {
            addCriterion("prod_at_bnum >", value, "prodAtBnum");
            return (Criteria) this;
        }

        public Criteria andProdAtBnumGreaterThanOrEqualTo(Float value) {
            addCriterion("prod_at_bnum >=", value, "prodAtBnum");
            return (Criteria) this;
        }

        public Criteria andProdAtBnumLessThan(Float value) {
            addCriterion("prod_at_bnum <", value, "prodAtBnum");
            return (Criteria) this;
        }

        public Criteria andProdAtBnumLessThanOrEqualTo(Float value) {
            addCriterion("prod_at_bnum <=", value, "prodAtBnum");
            return (Criteria) this;
        }

        public Criteria andProdAtBnumIn(List<Float> values) {
            addCriterion("prod_at_bnum in", values, "prodAtBnum");
            return (Criteria) this;
        }

        public Criteria andProdAtBnumNotIn(List<Float> values) {
            addCriterion("prod_at_bnum not in", values, "prodAtBnum");
            return (Criteria) this;
        }

        public Criteria andProdAtBnumBetween(Float value1, Float value2) {
            addCriterion("prod_at_bnum between", value1, value2, "prodAtBnum");
            return (Criteria) this;
        }

        public Criteria andProdAtBnumNotBetween(Float value1, Float value2) {
            addCriterion("prod_at_bnum not between", value1, value2, "prodAtBnum");
            return (Criteria) this;
        }

        public Criteria andProdAtWeightIsNull() {
            addCriterion("prod_at_weight is null");
            return (Criteria) this;
        }

        public Criteria andProdAtWeightIsNotNull() {
            addCriterion("prod_at_weight is not null");
            return (Criteria) this;
        }

        public Criteria andProdAtWeightEqualTo(Float value) {
            addCriterion("prod_at_weight =", value, "prodAtWeight");
            return (Criteria) this;
        }

        public Criteria andProdAtWeightNotEqualTo(Float value) {
            addCriterion("prod_at_weight <>", value, "prodAtWeight");
            return (Criteria) this;
        }

        public Criteria andProdAtWeightGreaterThan(Float value) {
            addCriterion("prod_at_weight >", value, "prodAtWeight");
            return (Criteria) this;
        }

        public Criteria andProdAtWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("prod_at_weight >=", value, "prodAtWeight");
            return (Criteria) this;
        }

        public Criteria andProdAtWeightLessThan(Float value) {
            addCriterion("prod_at_weight <", value, "prodAtWeight");
            return (Criteria) this;
        }

        public Criteria andProdAtWeightLessThanOrEqualTo(Float value) {
            addCriterion("prod_at_weight <=", value, "prodAtWeight");
            return (Criteria) this;
        }

        public Criteria andProdAtWeightIn(List<Float> values) {
            addCriterion("prod_at_weight in", values, "prodAtWeight");
            return (Criteria) this;
        }

        public Criteria andProdAtWeightNotIn(List<Float> values) {
            addCriterion("prod_at_weight not in", values, "prodAtWeight");
            return (Criteria) this;
        }

        public Criteria andProdAtWeightBetween(Float value1, Float value2) {
            addCriterion("prod_at_weight between", value1, value2, "prodAtWeight");
            return (Criteria) this;
        }

        public Criteria andProdAtWeightNotBetween(Float value1, Float value2) {
            addCriterion("prod_at_weight not between", value1, value2, "prodAtWeight");
            return (Criteria) this;
        }

        public Criteria andProdCustomerIsNull() {
            addCriterion("prod_customer is null");
            return (Criteria) this;
        }

        public Criteria andProdCustomerIsNotNull() {
            addCriterion("prod_customer is not null");
            return (Criteria) this;
        }

        public Criteria andProdCustomerEqualTo(String value) {
            addCriterion("prod_customer =", value, "prodCustomer");
            return (Criteria) this;
        }

        public Criteria andProdCustomerNotEqualTo(String value) {
            addCriterion("prod_customer <>", value, "prodCustomer");
            return (Criteria) this;
        }

        public Criteria andProdCustomerGreaterThan(String value) {
            addCriterion("prod_customer >", value, "prodCustomer");
            return (Criteria) this;
        }

        public Criteria andProdCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("prod_customer >=", value, "prodCustomer");
            return (Criteria) this;
        }

        public Criteria andProdCustomerLessThan(String value) {
            addCriterion("prod_customer <", value, "prodCustomer");
            return (Criteria) this;
        }

        public Criteria andProdCustomerLessThanOrEqualTo(String value) {
            addCriterion("prod_customer <=", value, "prodCustomer");
            return (Criteria) this;
        }

        public Criteria andProdCustomerLike(String value) {
            addCriterion("prod_customer like", value, "prodCustomer");
            return (Criteria) this;
        }

        public Criteria andProdCustomerNotLike(String value) {
            addCriterion("prod_customer not like", value, "prodCustomer");
            return (Criteria) this;
        }

        public Criteria andProdCustomerIn(List<String> values) {
            addCriterion("prod_customer in", values, "prodCustomer");
            return (Criteria) this;
        }

        public Criteria andProdCustomerNotIn(List<String> values) {
            addCriterion("prod_customer not in", values, "prodCustomer");
            return (Criteria) this;
        }

        public Criteria andProdCustomerBetween(String value1, String value2) {
            addCriterion("prod_customer between", value1, value2, "prodCustomer");
            return (Criteria) this;
        }

        public Criteria andProdCustomerNotBetween(String value1, String value2) {
            addCriterion("prod_customer not between", value1, value2, "prodCustomer");
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