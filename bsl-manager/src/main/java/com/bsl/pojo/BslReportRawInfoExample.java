package com.bsl.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BslReportRawInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BslReportRawInfoExample() {
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

        public Criteria andProdNumIsNull() {
            addCriterion("prod_num is null");
            return (Criteria) this;
        }

        public Criteria andProdNumIsNotNull() {
            addCriterion("prod_num is not null");
            return (Criteria) this;
        }

        public Criteria andProdNumEqualTo(Float value) {
            addCriterion("prod_num =", value, "prodNum");
            return (Criteria) this;
        }

        public Criteria andProdNumNotEqualTo(Float value) {
            addCriterion("prod_num <>", value, "prodNum");
            return (Criteria) this;
        }

        public Criteria andProdNumGreaterThan(Float value) {
            addCriterion("prod_num >", value, "prodNum");
            return (Criteria) this;
        }

        public Criteria andProdNumGreaterThanOrEqualTo(Float value) {
            addCriterion("prod_num >=", value, "prodNum");
            return (Criteria) this;
        }

        public Criteria andProdNumLessThan(Float value) {
            addCriterion("prod_num <", value, "prodNum");
            return (Criteria) this;
        }

        public Criteria andProdNumLessThanOrEqualTo(Float value) {
            addCriterion("prod_num <=", value, "prodNum");
            return (Criteria) this;
        }

        public Criteria andProdNumIn(List<Float> values) {
            addCriterion("prod_num in", values, "prodNum");
            return (Criteria) this;
        }

        public Criteria andProdNumNotIn(List<Float> values) {
            addCriterion("prod_num not in", values, "prodNum");
            return (Criteria) this;
        }

        public Criteria andProdNumBetween(Float value1, Float value2) {
            addCriterion("prod_num between", value1, value2, "prodNum");
            return (Criteria) this;
        }

        public Criteria andProdNumNotBetween(Float value1, Float value2) {
            addCriterion("prod_num not between", value1, value2, "prodNum");
            return (Criteria) this;
        }

        public Criteria andProdRecordWeightIsNull() {
            addCriterion("prod_record_weight is null");
            return (Criteria) this;
        }

        public Criteria andProdRecordWeightIsNotNull() {
            addCriterion("prod_record_weight is not null");
            return (Criteria) this;
        }

        public Criteria andProdRecordWeightEqualTo(Float value) {
            addCriterion("prod_record_weight =", value, "prodRecordWeight");
            return (Criteria) this;
        }

        public Criteria andProdRecordWeightNotEqualTo(Float value) {
            addCriterion("prod_record_weight <>", value, "prodRecordWeight");
            return (Criteria) this;
        }

        public Criteria andProdRecordWeightGreaterThan(Float value) {
            addCriterion("prod_record_weight >", value, "prodRecordWeight");
            return (Criteria) this;
        }

        public Criteria andProdRecordWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("prod_record_weight >=", value, "prodRecordWeight");
            return (Criteria) this;
        }

        public Criteria andProdRecordWeightLessThan(Float value) {
            addCriterion("prod_record_weight <", value, "prodRecordWeight");
            return (Criteria) this;
        }

        public Criteria andProdRecordWeightLessThanOrEqualTo(Float value) {
            addCriterion("prod_record_weight <=", value, "prodRecordWeight");
            return (Criteria) this;
        }

        public Criteria andProdRecordWeightIn(List<Float> values) {
            addCriterion("prod_record_weight in", values, "prodRecordWeight");
            return (Criteria) this;
        }

        public Criteria andProdRecordWeightNotIn(List<Float> values) {
            addCriterion("prod_record_weight not in", values, "prodRecordWeight");
            return (Criteria) this;
        }

        public Criteria andProdRecordWeightBetween(Float value1, Float value2) {
            addCriterion("prod_record_weight between", value1, value2, "prodRecordWeight");
            return (Criteria) this;
        }

        public Criteria andProdRecordWeightNotBetween(Float value1, Float value2) {
            addCriterion("prod_record_weight not between", value1, value2, "prodRecordWeight");
            return (Criteria) this;
        }

        public Criteria andProdRelWeightIsNull() {
            addCriterion("prod_rel_weight is null");
            return (Criteria) this;
        }

        public Criteria andProdRelWeightIsNotNull() {
            addCriterion("prod_rel_weight is not null");
            return (Criteria) this;
        }

        public Criteria andProdRelWeightEqualTo(Float value) {
            addCriterion("prod_rel_weight =", value, "prodRelWeight");
            return (Criteria) this;
        }

        public Criteria andProdRelWeightNotEqualTo(Float value) {
            addCriterion("prod_rel_weight <>", value, "prodRelWeight");
            return (Criteria) this;
        }

        public Criteria andProdRelWeightGreaterThan(Float value) {
            addCriterion("prod_rel_weight >", value, "prodRelWeight");
            return (Criteria) this;
        }

        public Criteria andProdRelWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("prod_rel_weight >=", value, "prodRelWeight");
            return (Criteria) this;
        }

        public Criteria andProdRelWeightLessThan(Float value) {
            addCriterion("prod_rel_weight <", value, "prodRelWeight");
            return (Criteria) this;
        }

        public Criteria andProdRelWeightLessThanOrEqualTo(Float value) {
            addCriterion("prod_rel_weight <=", value, "prodRelWeight");
            return (Criteria) this;
        }

        public Criteria andProdRelWeightIn(List<Float> values) {
            addCriterion("prod_rel_weight in", values, "prodRelWeight");
            return (Criteria) this;
        }

        public Criteria andProdRelWeightNotIn(List<Float> values) {
            addCriterion("prod_rel_weight not in", values, "prodRelWeight");
            return (Criteria) this;
        }

        public Criteria andProdRelWeightBetween(Float value1, Float value2) {
            addCriterion("prod_rel_weight between", value1, value2, "prodRelWeight");
            return (Criteria) this;
        }

        public Criteria andProdRelWeightNotBetween(Float value1, Float value2) {
            addCriterion("prod_rel_weight not between", value1, value2, "prodRelWeight");
            return (Criteria) this;
        }

        public Criteria andProdPrintWeightIsNull() {
            addCriterion("prod_print_weight is null");
            return (Criteria) this;
        }

        public Criteria andProdPrintWeightIsNotNull() {
            addCriterion("prod_print_weight is not null");
            return (Criteria) this;
        }

        public Criteria andProdPrintWeightEqualTo(Float value) {
            addCriterion("prod_print_weight =", value, "prodPrintWeight");
            return (Criteria) this;
        }

        public Criteria andProdPrintWeightNotEqualTo(Float value) {
            addCriterion("prod_print_weight <>", value, "prodPrintWeight");
            return (Criteria) this;
        }

        public Criteria andProdPrintWeightGreaterThan(Float value) {
            addCriterion("prod_print_weight >", value, "prodPrintWeight");
            return (Criteria) this;
        }

        public Criteria andProdPrintWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("prod_print_weight >=", value, "prodPrintWeight");
            return (Criteria) this;
        }

        public Criteria andProdPrintWeightLessThan(Float value) {
            addCriterion("prod_print_weight <", value, "prodPrintWeight");
            return (Criteria) this;
        }

        public Criteria andProdPrintWeightLessThanOrEqualTo(Float value) {
            addCriterion("prod_print_weight <=", value, "prodPrintWeight");
            return (Criteria) this;
        }

        public Criteria andProdPrintWeightIn(List<Float> values) {
            addCriterion("prod_print_weight in", values, "prodPrintWeight");
            return (Criteria) this;
        }

        public Criteria andProdPrintWeightNotIn(List<Float> values) {
            addCriterion("prod_print_weight not in", values, "prodPrintWeight");
            return (Criteria) this;
        }

        public Criteria andProdPrintWeightBetween(Float value1, Float value2) {
            addCriterion("prod_print_weight between", value1, value2, "prodPrintWeight");
            return (Criteria) this;
        }

        public Criteria andProdPrintWeightNotBetween(Float value1, Float value2) {
            addCriterion("prod_print_weight not between", value1, value2, "prodPrintWeight");
            return (Criteria) this;
        }

        public Criteria andProdSourceIsNull() {
            addCriterion("prod_source is null");
            return (Criteria) this;
        }

        public Criteria andProdSourceIsNotNull() {
            addCriterion("prod_source is not null");
            return (Criteria) this;
        }

        public Criteria andProdSourceEqualTo(String value) {
            addCriterion("prod_source =", value, "prodSource");
            return (Criteria) this;
        }

        public Criteria andProdSourceNotEqualTo(String value) {
            addCriterion("prod_source <>", value, "prodSource");
            return (Criteria) this;
        }

        public Criteria andProdSourceGreaterThan(String value) {
            addCriterion("prod_source >", value, "prodSource");
            return (Criteria) this;
        }

        public Criteria andProdSourceGreaterThanOrEqualTo(String value) {
            addCriterion("prod_source >=", value, "prodSource");
            return (Criteria) this;
        }

        public Criteria andProdSourceLessThan(String value) {
            addCriterion("prod_source <", value, "prodSource");
            return (Criteria) this;
        }

        public Criteria andProdSourceLessThanOrEqualTo(String value) {
            addCriterion("prod_source <=", value, "prodSource");
            return (Criteria) this;
        }

        public Criteria andProdSourceLike(String value) {
            addCriterion("prod_source like", value, "prodSource");
            return (Criteria) this;
        }

        public Criteria andProdSourceNotLike(String value) {
            addCriterion("prod_source not like", value, "prodSource");
            return (Criteria) this;
        }

        public Criteria andProdSourceIn(List<String> values) {
            addCriterion("prod_source in", values, "prodSource");
            return (Criteria) this;
        }

        public Criteria andProdSourceNotIn(List<String> values) {
            addCriterion("prod_source not in", values, "prodSource");
            return (Criteria) this;
        }

        public Criteria andProdSourceBetween(String value1, String value2) {
            addCriterion("prod_source between", value1, value2, "prodSource");
            return (Criteria) this;
        }

        public Criteria andProdSourceNotBetween(String value1, String value2) {
            addCriterion("prod_source not between", value1, value2, "prodSource");
            return (Criteria) this;
        }

        public Criteria andProdCompanyIsNull() {
            addCriterion("prod_company is null");
            return (Criteria) this;
        }

        public Criteria andProdCompanyIsNotNull() {
            addCriterion("prod_company is not null");
            return (Criteria) this;
        }

        public Criteria andProdCompanyEqualTo(String value) {
            addCriterion("prod_company =", value, "prodCompany");
            return (Criteria) this;
        }

        public Criteria andProdCompanyNotEqualTo(String value) {
            addCriterion("prod_company <>", value, "prodCompany");
            return (Criteria) this;
        }

        public Criteria andProdCompanyGreaterThan(String value) {
            addCriterion("prod_company >", value, "prodCompany");
            return (Criteria) this;
        }

        public Criteria andProdCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("prod_company >=", value, "prodCompany");
            return (Criteria) this;
        }

        public Criteria andProdCompanyLessThan(String value) {
            addCriterion("prod_company <", value, "prodCompany");
            return (Criteria) this;
        }

        public Criteria andProdCompanyLessThanOrEqualTo(String value) {
            addCriterion("prod_company <=", value, "prodCompany");
            return (Criteria) this;
        }

        public Criteria andProdCompanyLike(String value) {
            addCriterion("prod_company like", value, "prodCompany");
            return (Criteria) this;
        }

        public Criteria andProdCompanyNotLike(String value) {
            addCriterion("prod_company not like", value, "prodCompany");
            return (Criteria) this;
        }

        public Criteria andProdCompanyIn(List<String> values) {
            addCriterion("prod_company in", values, "prodCompany");
            return (Criteria) this;
        }

        public Criteria andProdCompanyNotIn(List<String> values) {
            addCriterion("prod_company not in", values, "prodCompany");
            return (Criteria) this;
        }

        public Criteria andProdCompanyBetween(String value1, String value2) {
            addCriterion("prod_company between", value1, value2, "prodCompany");
            return (Criteria) this;
        }

        public Criteria andProdCompanyNotBetween(String value1, String value2) {
            addCriterion("prod_company not between", value1, value2, "prodCompany");
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