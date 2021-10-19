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

        public Criteria andDataTypeIsNull() {
            addCriterion("data_type is null");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNotNull() {
            addCriterion("data_type is not null");
            return (Criteria) this;
        }

        public Criteria andDataTypeEqualTo(String value) {
            addCriterion("data_type =", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotEqualTo(String value) {
            addCriterion("data_type <>", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThan(String value) {
            addCriterion("data_type >", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("data_type >=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThan(String value) {
            addCriterion("data_type <", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThanOrEqualTo(String value) {
            addCriterion("data_type <=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLike(String value) {
            addCriterion("data_type like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotLike(String value) {
            addCriterion("data_type not like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeIn(List<String> values) {
            addCriterion("data_type in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotIn(List<String> values) {
            addCriterion("data_type not in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeBetween(String value1, String value2) {
            addCriterion("data_type between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotBetween(String value1, String value2) {
            addCriterion("data_type not between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andProdTypeIsNull() {
            addCriterion("prod_type is null");
            return (Criteria) this;
        }

        public Criteria andProdTypeIsNotNull() {
            addCriterion("prod_type is not null");
            return (Criteria) this;
        }

        public Criteria andProdTypeEqualTo(String value) {
            addCriterion("prod_type =", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeNotEqualTo(String value) {
            addCriterion("prod_type <>", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeGreaterThan(String value) {
            addCriterion("prod_type >", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("prod_type >=", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeLessThan(String value) {
            addCriterion("prod_type <", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeLessThanOrEqualTo(String value) {
            addCriterion("prod_type <=", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeLike(String value) {
            addCriterion("prod_type like", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeNotLike(String value) {
            addCriterion("prod_type not like", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeIn(List<String> values) {
            addCriterion("prod_type in", values, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeNotIn(List<String> values) {
            addCriterion("prod_type not in", values, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeBetween(String value1, String value2) {
            addCriterion("prod_type between", value1, value2, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeNotBetween(String value1, String value2) {
            addCriterion("prod_type not between", value1, value2, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdJzIsNull() {
            addCriterion("prod_jz is null");
            return (Criteria) this;
        }

        public Criteria andProdJzIsNotNull() {
            addCriterion("prod_jz is not null");
            return (Criteria) this;
        }

        public Criteria andProdJzEqualTo(String value) {
            addCriterion("prod_jz =", value, "prodJz");
            return (Criteria) this;
        }

        public Criteria andProdJzNotEqualTo(String value) {
            addCriterion("prod_jz <>", value, "prodJz");
            return (Criteria) this;
        }

        public Criteria andProdJzGreaterThan(String value) {
            addCriterion("prod_jz >", value, "prodJz");
            return (Criteria) this;
        }

        public Criteria andProdJzGreaterThanOrEqualTo(String value) {
            addCriterion("prod_jz >=", value, "prodJz");
            return (Criteria) this;
        }

        public Criteria andProdJzLessThan(String value) {
            addCriterion("prod_jz <", value, "prodJz");
            return (Criteria) this;
        }

        public Criteria andProdJzLessThanOrEqualTo(String value) {
            addCriterion("prod_jz <=", value, "prodJz");
            return (Criteria) this;
        }

        public Criteria andProdJzLike(String value) {
            addCriterion("prod_jz like", value, "prodJz");
            return (Criteria) this;
        }

        public Criteria andProdJzNotLike(String value) {
            addCriterion("prod_jz not like", value, "prodJz");
            return (Criteria) this;
        }

        public Criteria andProdJzIn(List<String> values) {
            addCriterion("prod_jz in", values, "prodJz");
            return (Criteria) this;
        }

        public Criteria andProdJzNotIn(List<String> values) {
            addCriterion("prod_jz not in", values, "prodJz");
            return (Criteria) this;
        }

        public Criteria andProdJzBetween(String value1, String value2) {
            addCriterion("prod_jz between", value1, value2, "prodJz");
            return (Criteria) this;
        }

        public Criteria andProdJzNotBetween(String value1, String value2) {
            addCriterion("prod_jz not between", value1, value2, "prodJz");
            return (Criteria) this;
        }

        public Criteria andProdPlanNoIsNull() {
            addCriterion("prod_plan_no is null");
            return (Criteria) this;
        }

        public Criteria andProdPlanNoIsNotNull() {
            addCriterion("prod_plan_no is not null");
            return (Criteria) this;
        }

        public Criteria andProdPlanNoEqualTo(String value) {
            addCriterion("prod_plan_no =", value, "prodPlanNo");
            return (Criteria) this;
        }

        public Criteria andProdPlanNoNotEqualTo(String value) {
            addCriterion("prod_plan_no <>", value, "prodPlanNo");
            return (Criteria) this;
        }

        public Criteria andProdPlanNoGreaterThan(String value) {
            addCriterion("prod_plan_no >", value, "prodPlanNo");
            return (Criteria) this;
        }

        public Criteria andProdPlanNoGreaterThanOrEqualTo(String value) {
            addCriterion("prod_plan_no >=", value, "prodPlanNo");
            return (Criteria) this;
        }

        public Criteria andProdPlanNoLessThan(String value) {
            addCriterion("prod_plan_no <", value, "prodPlanNo");
            return (Criteria) this;
        }

        public Criteria andProdPlanNoLessThanOrEqualTo(String value) {
            addCriterion("prod_plan_no <=", value, "prodPlanNo");
            return (Criteria) this;
        }

        public Criteria andProdPlanNoLike(String value) {
            addCriterion("prod_plan_no like", value, "prodPlanNo");
            return (Criteria) this;
        }

        public Criteria andProdPlanNoNotLike(String value) {
            addCriterion("prod_plan_no not like", value, "prodPlanNo");
            return (Criteria) this;
        }

        public Criteria andProdPlanNoIn(List<String> values) {
            addCriterion("prod_plan_no in", values, "prodPlanNo");
            return (Criteria) this;
        }

        public Criteria andProdPlanNoNotIn(List<String> values) {
            addCriterion("prod_plan_no not in", values, "prodPlanNo");
            return (Criteria) this;
        }

        public Criteria andProdPlanNoBetween(String value1, String value2) {
            addCriterion("prod_plan_no between", value1, value2, "prodPlanNo");
            return (Criteria) this;
        }

        public Criteria andProdPlanNoNotBetween(String value1, String value2) {
            addCriterion("prod_plan_no not between", value1, value2, "prodPlanNo");
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

        public Criteria andProdBsIsNull() {
            addCriterion("prod_bs is null");
            return (Criteria) this;
        }

        public Criteria andProdBsIsNotNull() {
            addCriterion("prod_bs is not null");
            return (Criteria) this;
        }

        public Criteria andProdBsEqualTo(Float value) {
            addCriterion("prod_bs =", value, "prodBs");
            return (Criteria) this;
        }

        public Criteria andProdBsNotEqualTo(Float value) {
            addCriterion("prod_bs <>", value, "prodBs");
            return (Criteria) this;
        }

        public Criteria andProdBsGreaterThan(Float value) {
            addCriterion("prod_bs >", value, "prodBs");
            return (Criteria) this;
        }

        public Criteria andProdBsGreaterThanOrEqualTo(Float value) {
            addCriterion("prod_bs >=", value, "prodBs");
            return (Criteria) this;
        }

        public Criteria andProdBsLessThan(Float value) {
            addCriterion("prod_bs <", value, "prodBs");
            return (Criteria) this;
        }

        public Criteria andProdBsLessThanOrEqualTo(Float value) {
            addCriterion("prod_bs <=", value, "prodBs");
            return (Criteria) this;
        }

        public Criteria andProdBsIn(List<Float> values) {
            addCriterion("prod_bs in", values, "prodBs");
            return (Criteria) this;
        }

        public Criteria andProdBsNotIn(List<Float> values) {
            addCriterion("prod_bs not in", values, "prodBs");
            return (Criteria) this;
        }

        public Criteria andProdBsBetween(Float value1, Float value2) {
            addCriterion("prod_bs between", value1, value2, "prodBs");
            return (Criteria) this;
        }

        public Criteria andProdBsNotBetween(Float value1, Float value2) {
            addCriterion("prod_bs not between", value1, value2, "prodBs");
            return (Criteria) this;
        }

        public Criteria andProdZsIsNull() {
            addCriterion("prod_zs is null");
            return (Criteria) this;
        }

        public Criteria andProdZsIsNotNull() {
            addCriterion("prod_zs is not null");
            return (Criteria) this;
        }

        public Criteria andProdZsEqualTo(Float value) {
            addCriterion("prod_zs =", value, "prodZs");
            return (Criteria) this;
        }

        public Criteria andProdZsNotEqualTo(Float value) {
            addCriterion("prod_zs <>", value, "prodZs");
            return (Criteria) this;
        }

        public Criteria andProdZsGreaterThan(Float value) {
            addCriterion("prod_zs >", value, "prodZs");
            return (Criteria) this;
        }

        public Criteria andProdZsGreaterThanOrEqualTo(Float value) {
            addCriterion("prod_zs >=", value, "prodZs");
            return (Criteria) this;
        }

        public Criteria andProdZsLessThan(Float value) {
            addCriterion("prod_zs <", value, "prodZs");
            return (Criteria) this;
        }

        public Criteria andProdZsLessThanOrEqualTo(Float value) {
            addCriterion("prod_zs <=", value, "prodZs");
            return (Criteria) this;
        }

        public Criteria andProdZsIn(List<Float> values) {
            addCriterion("prod_zs in", values, "prodZs");
            return (Criteria) this;
        }

        public Criteria andProdZsNotIn(List<Float> values) {
            addCriterion("prod_zs not in", values, "prodZs");
            return (Criteria) this;
        }

        public Criteria andProdZsBetween(Float value1, Float value2) {
            addCriterion("prod_zs between", value1, value2, "prodZs");
            return (Criteria) this;
        }

        public Criteria andProdZsNotBetween(Float value1, Float value2) {
            addCriterion("prod_zs not between", value1, value2, "prodZs");
            return (Criteria) this;
        }

        public Criteria andProdWeightIsNull() {
            addCriterion("prod_weight is null");
            return (Criteria) this;
        }

        public Criteria andProdWeightIsNotNull() {
            addCriterion("prod_weight is not null");
            return (Criteria) this;
        }

        public Criteria andProdWeightEqualTo(Float value) {
            addCriterion("prod_weight =", value, "prodWeight");
            return (Criteria) this;
        }

        public Criteria andProdWeightNotEqualTo(Float value) {
            addCriterion("prod_weight <>", value, "prodWeight");
            return (Criteria) this;
        }

        public Criteria andProdWeightGreaterThan(Float value) {
            addCriterion("prod_weight >", value, "prodWeight");
            return (Criteria) this;
        }

        public Criteria andProdWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("prod_weight >=", value, "prodWeight");
            return (Criteria) this;
        }

        public Criteria andProdWeightLessThan(Float value) {
            addCriterion("prod_weight <", value, "prodWeight");
            return (Criteria) this;
        }

        public Criteria andProdWeightLessThanOrEqualTo(Float value) {
            addCriterion("prod_weight <=", value, "prodWeight");
            return (Criteria) this;
        }

        public Criteria andProdWeightIn(List<Float> values) {
            addCriterion("prod_weight in", values, "prodWeight");
            return (Criteria) this;
        }

        public Criteria andProdWeightNotIn(List<Float> values) {
            addCriterion("prod_weight not in", values, "prodWeight");
            return (Criteria) this;
        }

        public Criteria andProdWeightBetween(Float value1, Float value2) {
            addCriterion("prod_weight between", value1, value2, "prodWeight");
            return (Criteria) this;
        }

        public Criteria andProdWeightNotBetween(Float value1, Float value2) {
            addCriterion("prod_weight not between", value1, value2, "prodWeight");
            return (Criteria) this;
        }

        public Criteria andProdUseNormIsNull() {
            addCriterion("prod_use_norm is null");
            return (Criteria) this;
        }

        public Criteria andProdUseNormIsNotNull() {
            addCriterion("prod_use_norm is not null");
            return (Criteria) this;
        }

        public Criteria andProdUseNormEqualTo(String value) {
            addCriterion("prod_use_norm =", value, "prodUseNorm");
            return (Criteria) this;
        }

        public Criteria andProdUseNormNotEqualTo(String value) {
            addCriterion("prod_use_norm <>", value, "prodUseNorm");
            return (Criteria) this;
        }

        public Criteria andProdUseNormGreaterThan(String value) {
            addCriterion("prod_use_norm >", value, "prodUseNorm");
            return (Criteria) this;
        }

        public Criteria andProdUseNormGreaterThanOrEqualTo(String value) {
            addCriterion("prod_use_norm >=", value, "prodUseNorm");
            return (Criteria) this;
        }

        public Criteria andProdUseNormLessThan(String value) {
            addCriterion("prod_use_norm <", value, "prodUseNorm");
            return (Criteria) this;
        }

        public Criteria andProdUseNormLessThanOrEqualTo(String value) {
            addCriterion("prod_use_norm <=", value, "prodUseNorm");
            return (Criteria) this;
        }

        public Criteria andProdUseNormLike(String value) {
            addCriterion("prod_use_norm like", value, "prodUseNorm");
            return (Criteria) this;
        }

        public Criteria andProdUseNormNotLike(String value) {
            addCriterion("prod_use_norm not like", value, "prodUseNorm");
            return (Criteria) this;
        }

        public Criteria andProdUseNormIn(List<String> values) {
            addCriterion("prod_use_norm in", values, "prodUseNorm");
            return (Criteria) this;
        }

        public Criteria andProdUseNormNotIn(List<String> values) {
            addCriterion("prod_use_norm not in", values, "prodUseNorm");
            return (Criteria) this;
        }

        public Criteria andProdUseNormBetween(String value1, String value2) {
            addCriterion("prod_use_norm between", value1, value2, "prodUseNorm");
            return (Criteria) this;
        }

        public Criteria andProdUseNormNotBetween(String value1, String value2) {
            addCriterion("prod_use_norm not between", value1, value2, "prodUseNorm");
            return (Criteria) this;
        }

        public Criteria andProdUseNumIsNull() {
            addCriterion("prod_use_num is null");
            return (Criteria) this;
        }

        public Criteria andProdUseNumIsNotNull() {
            addCriterion("prod_use_num is not null");
            return (Criteria) this;
        }

        public Criteria andProdUseNumEqualTo(Float value) {
            addCriterion("prod_use_num =", value, "prodUseNum");
            return (Criteria) this;
        }

        public Criteria andProdUseNumNotEqualTo(Float value) {
            addCriterion("prod_use_num <>", value, "prodUseNum");
            return (Criteria) this;
        }

        public Criteria andProdUseNumGreaterThan(Float value) {
            addCriterion("prod_use_num >", value, "prodUseNum");
            return (Criteria) this;
        }

        public Criteria andProdUseNumGreaterThanOrEqualTo(Float value) {
            addCriterion("prod_use_num >=", value, "prodUseNum");
            return (Criteria) this;
        }

        public Criteria andProdUseNumLessThan(Float value) {
            addCriterion("prod_use_num <", value, "prodUseNum");
            return (Criteria) this;
        }

        public Criteria andProdUseNumLessThanOrEqualTo(Float value) {
            addCriterion("prod_use_num <=", value, "prodUseNum");
            return (Criteria) this;
        }

        public Criteria andProdUseNumIn(List<Float> values) {
            addCriterion("prod_use_num in", values, "prodUseNum");
            return (Criteria) this;
        }

        public Criteria andProdUseNumNotIn(List<Float> values) {
            addCriterion("prod_use_num not in", values, "prodUseNum");
            return (Criteria) this;
        }

        public Criteria andProdUseNumBetween(Float value1, Float value2) {
            addCriterion("prod_use_num between", value1, value2, "prodUseNum");
            return (Criteria) this;
        }

        public Criteria andProdUseNumNotBetween(Float value1, Float value2) {
            addCriterion("prod_use_num not between", value1, value2, "prodUseNum");
            return (Criteria) this;
        }

        public Criteria andProdUseWeightIsNull() {
            addCriterion("prod_use_weight is null");
            return (Criteria) this;
        }

        public Criteria andProdUseWeightIsNotNull() {
            addCriterion("prod_use_weight is not null");
            return (Criteria) this;
        }

        public Criteria andProdUseWeightEqualTo(Float value) {
            addCriterion("prod_use_weight =", value, "prodUseWeight");
            return (Criteria) this;
        }

        public Criteria andProdUseWeightNotEqualTo(Float value) {
            addCriterion("prod_use_weight <>", value, "prodUseWeight");
            return (Criteria) this;
        }

        public Criteria andProdUseWeightGreaterThan(Float value) {
            addCriterion("prod_use_weight >", value, "prodUseWeight");
            return (Criteria) this;
        }

        public Criteria andProdUseWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("prod_use_weight >=", value, "prodUseWeight");
            return (Criteria) this;
        }

        public Criteria andProdUseWeightLessThan(Float value) {
            addCriterion("prod_use_weight <", value, "prodUseWeight");
            return (Criteria) this;
        }

        public Criteria andProdUseWeightLessThanOrEqualTo(Float value) {
            addCriterion("prod_use_weight <=", value, "prodUseWeight");
            return (Criteria) this;
        }

        public Criteria andProdUseWeightIn(List<Float> values) {
            addCriterion("prod_use_weight in", values, "prodUseWeight");
            return (Criteria) this;
        }

        public Criteria andProdUseWeightNotIn(List<Float> values) {
            addCriterion("prod_use_weight not in", values, "prodUseWeight");
            return (Criteria) this;
        }

        public Criteria andProdUseWeightBetween(Float value1, Float value2) {
            addCriterion("prod_use_weight between", value1, value2, "prodUseWeight");
            return (Criteria) this;
        }

        public Criteria andProdUseWeightNotBetween(Float value1, Float value2) {
            addCriterion("prod_use_weight not between", value1, value2, "prodUseWeight");
            return (Criteria) this;
        }

        public Criteria andProdDclWeightIsNull() {
            addCriterion("prod_dcl_weight is null");
            return (Criteria) this;
        }

        public Criteria andProdDclWeightIsNotNull() {
            addCriterion("prod_dcl_weight is not null");
            return (Criteria) this;
        }

        public Criteria andProdDclWeightEqualTo(Float value) {
            addCriterion("prod_dcl_weight =", value, "prodDclWeight");
            return (Criteria) this;
        }

        public Criteria andProdDclWeightNotEqualTo(Float value) {
            addCriterion("prod_dcl_weight <>", value, "prodDclWeight");
            return (Criteria) this;
        }

        public Criteria andProdDclWeightGreaterThan(Float value) {
            addCriterion("prod_dcl_weight >", value, "prodDclWeight");
            return (Criteria) this;
        }

        public Criteria andProdDclWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("prod_dcl_weight >=", value, "prodDclWeight");
            return (Criteria) this;
        }

        public Criteria andProdDclWeightLessThan(Float value) {
            addCriterion("prod_dcl_weight <", value, "prodDclWeight");
            return (Criteria) this;
        }

        public Criteria andProdDclWeightLessThanOrEqualTo(Float value) {
            addCriterion("prod_dcl_weight <=", value, "prodDclWeight");
            return (Criteria) this;
        }

        public Criteria andProdDclWeightIn(List<Float> values) {
            addCriterion("prod_dcl_weight in", values, "prodDclWeight");
            return (Criteria) this;
        }

        public Criteria andProdDclWeightNotIn(List<Float> values) {
            addCriterion("prod_dcl_weight not in", values, "prodDclWeight");
            return (Criteria) this;
        }

        public Criteria andProdDclWeightBetween(Float value1, Float value2) {
            addCriterion("prod_dcl_weight between", value1, value2, "prodDclWeight");
            return (Criteria) this;
        }

        public Criteria andProdDclWeightNotBetween(Float value1, Float value2) {
            addCriterion("prod_dcl_weight not between", value1, value2, "prodDclWeight");
            return (Criteria) this;
        }

        public Criteria andProdFlWeightIsNull() {
            addCriterion("prod_fl_weight is null");
            return (Criteria) this;
        }

        public Criteria andProdFlWeightIsNotNull() {
            addCriterion("prod_fl_weight is not null");
            return (Criteria) this;
        }

        public Criteria andProdFlWeightEqualTo(Float value) {
            addCriterion("prod_fl_weight =", value, "prodFlWeight");
            return (Criteria) this;
        }

        public Criteria andProdFlWeightNotEqualTo(Float value) {
            addCriterion("prod_fl_weight <>", value, "prodFlWeight");
            return (Criteria) this;
        }

        public Criteria andProdFlWeightGreaterThan(Float value) {
            addCriterion("prod_fl_weight >", value, "prodFlWeight");
            return (Criteria) this;
        }

        public Criteria andProdFlWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("prod_fl_weight >=", value, "prodFlWeight");
            return (Criteria) this;
        }

        public Criteria andProdFlWeightLessThan(Float value) {
            addCriterion("prod_fl_weight <", value, "prodFlWeight");
            return (Criteria) this;
        }

        public Criteria andProdFlWeightLessThanOrEqualTo(Float value) {
            addCriterion("prod_fl_weight <=", value, "prodFlWeight");
            return (Criteria) this;
        }

        public Criteria andProdFlWeightIn(List<Float> values) {
            addCriterion("prod_fl_weight in", values, "prodFlWeight");
            return (Criteria) this;
        }

        public Criteria andProdFlWeightNotIn(List<Float> values) {
            addCriterion("prod_fl_weight not in", values, "prodFlWeight");
            return (Criteria) this;
        }

        public Criteria andProdFlWeightBetween(Float value1, Float value2) {
            addCriterion("prod_fl_weight between", value1, value2, "prodFlWeight");
            return (Criteria) this;
        }

        public Criteria andProdFlWeightNotBetween(Float value1, Float value2) {
            addCriterion("prod_fl_weight not between", value1, value2, "prodFlWeight");
            return (Criteria) this;
        }

        public Criteria andProdCclIsNull() {
            addCriterion("prod_ccl is null");
            return (Criteria) this;
        }

        public Criteria andProdCclIsNotNull() {
            addCriterion("prod_ccl is not null");
            return (Criteria) this;
        }

        public Criteria andProdCclEqualTo(Float value) {
            addCriterion("prod_ccl =", value, "prodCcl");
            return (Criteria) this;
        }

        public Criteria andProdCclNotEqualTo(Float value) {
            addCriterion("prod_ccl <>", value, "prodCcl");
            return (Criteria) this;
        }

        public Criteria andProdCclGreaterThan(Float value) {
            addCriterion("prod_ccl >", value, "prodCcl");
            return (Criteria) this;
        }

        public Criteria andProdCclGreaterThanOrEqualTo(Float value) {
            addCriterion("prod_ccl >=", value, "prodCcl");
            return (Criteria) this;
        }

        public Criteria andProdCclLessThan(Float value) {
            addCriterion("prod_ccl <", value, "prodCcl");
            return (Criteria) this;
        }

        public Criteria andProdCclLessThanOrEqualTo(Float value) {
            addCriterion("prod_ccl <=", value, "prodCcl");
            return (Criteria) this;
        }

        public Criteria andProdCclIn(List<Float> values) {
            addCriterion("prod_ccl in", values, "prodCcl");
            return (Criteria) this;
        }

        public Criteria andProdCclNotIn(List<Float> values) {
            addCriterion("prod_ccl not in", values, "prodCcl");
            return (Criteria) this;
        }

        public Criteria andProdCclBetween(Float value1, Float value2) {
            addCriterion("prod_ccl between", value1, value2, "prodCcl");
            return (Criteria) this;
        }

        public Criteria andProdCclNotBetween(Float value1, Float value2) {
            addCriterion("prod_ccl not between", value1, value2, "prodCcl");
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