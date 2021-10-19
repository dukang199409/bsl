package com.bsl.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BslReportSaleInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BslReportSaleInfoExample() {
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

        public Criteria andSaleCustomerIsNull() {
            addCriterion("sale_customer is null");
            return (Criteria) this;
        }

        public Criteria andSaleCustomerIsNotNull() {
            addCriterion("sale_customer is not null");
            return (Criteria) this;
        }

        public Criteria andSaleCustomerEqualTo(String value) {
            addCriterion("sale_customer =", value, "saleCustomer");
            return (Criteria) this;
        }

        public Criteria andSaleCustomerNotEqualTo(String value) {
            addCriterion("sale_customer <>", value, "saleCustomer");
            return (Criteria) this;
        }

        public Criteria andSaleCustomerGreaterThan(String value) {
            addCriterion("sale_customer >", value, "saleCustomer");
            return (Criteria) this;
        }

        public Criteria andSaleCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("sale_customer >=", value, "saleCustomer");
            return (Criteria) this;
        }

        public Criteria andSaleCustomerLessThan(String value) {
            addCriterion("sale_customer <", value, "saleCustomer");
            return (Criteria) this;
        }

        public Criteria andSaleCustomerLessThanOrEqualTo(String value) {
            addCriterion("sale_customer <=", value, "saleCustomer");
            return (Criteria) this;
        }

        public Criteria andSaleCustomerLike(String value) {
            addCriterion("sale_customer like", value, "saleCustomer");
            return (Criteria) this;
        }

        public Criteria andSaleCustomerNotLike(String value) {
            addCriterion("sale_customer not like", value, "saleCustomer");
            return (Criteria) this;
        }

        public Criteria andSaleCustomerIn(List<String> values) {
            addCriterion("sale_customer in", values, "saleCustomer");
            return (Criteria) this;
        }

        public Criteria andSaleCustomerNotIn(List<String> values) {
            addCriterion("sale_customer not in", values, "saleCustomer");
            return (Criteria) this;
        }

        public Criteria andSaleCustomerBetween(String value1, String value2) {
            addCriterion("sale_customer between", value1, value2, "saleCustomer");
            return (Criteria) this;
        }

        public Criteria andSaleCustomerNotBetween(String value1, String value2) {
            addCriterion("sale_customer not between", value1, value2, "saleCustomer");
            return (Criteria) this;
        }

        public Criteria andSaleRucIsNull() {
            addCriterion("sale_ruc is null");
            return (Criteria) this;
        }

        public Criteria andSaleRucIsNotNull() {
            addCriterion("sale_ruc is not null");
            return (Criteria) this;
        }

        public Criteria andSaleRucEqualTo(String value) {
            addCriterion("sale_ruc =", value, "saleRuc");
            return (Criteria) this;
        }

        public Criteria andSaleRucNotEqualTo(String value) {
            addCriterion("sale_ruc <>", value, "saleRuc");
            return (Criteria) this;
        }

        public Criteria andSaleRucGreaterThan(String value) {
            addCriterion("sale_ruc >", value, "saleRuc");
            return (Criteria) this;
        }

        public Criteria andSaleRucGreaterThanOrEqualTo(String value) {
            addCriterion("sale_ruc >=", value, "saleRuc");
            return (Criteria) this;
        }

        public Criteria andSaleRucLessThan(String value) {
            addCriterion("sale_ruc <", value, "saleRuc");
            return (Criteria) this;
        }

        public Criteria andSaleRucLessThanOrEqualTo(String value) {
            addCriterion("sale_ruc <=", value, "saleRuc");
            return (Criteria) this;
        }

        public Criteria andSaleRucLike(String value) {
            addCriterion("sale_ruc like", value, "saleRuc");
            return (Criteria) this;
        }

        public Criteria andSaleRucNotLike(String value) {
            addCriterion("sale_ruc not like", value, "saleRuc");
            return (Criteria) this;
        }

        public Criteria andSaleRucIn(List<String> values) {
            addCriterion("sale_ruc in", values, "saleRuc");
            return (Criteria) this;
        }

        public Criteria andSaleRucNotIn(List<String> values) {
            addCriterion("sale_ruc not in", values, "saleRuc");
            return (Criteria) this;
        }

        public Criteria andSaleRucBetween(String value1, String value2) {
            addCriterion("sale_ruc between", value1, value2, "saleRuc");
            return (Criteria) this;
        }

        public Criteria andSaleRucNotBetween(String value1, String value2) {
            addCriterion("sale_ruc not between", value1, value2, "saleRuc");
            return (Criteria) this;
        }

        public Criteria andSaleGettypeIsNull() {
            addCriterion("sale_gettype is null");
            return (Criteria) this;
        }

        public Criteria andSaleGettypeIsNotNull() {
            addCriterion("sale_gettype is not null");
            return (Criteria) this;
        }

        public Criteria andSaleGettypeEqualTo(String value) {
            addCriterion("sale_gettype =", value, "saleGettype");
            return (Criteria) this;
        }

        public Criteria andSaleGettypeNotEqualTo(String value) {
            addCriterion("sale_gettype <>", value, "saleGettype");
            return (Criteria) this;
        }

        public Criteria andSaleGettypeGreaterThan(String value) {
            addCriterion("sale_gettype >", value, "saleGettype");
            return (Criteria) this;
        }

        public Criteria andSaleGettypeGreaterThanOrEqualTo(String value) {
            addCriterion("sale_gettype >=", value, "saleGettype");
            return (Criteria) this;
        }

        public Criteria andSaleGettypeLessThan(String value) {
            addCriterion("sale_gettype <", value, "saleGettype");
            return (Criteria) this;
        }

        public Criteria andSaleGettypeLessThanOrEqualTo(String value) {
            addCriterion("sale_gettype <=", value, "saleGettype");
            return (Criteria) this;
        }

        public Criteria andSaleGettypeLike(String value) {
            addCriterion("sale_gettype like", value, "saleGettype");
            return (Criteria) this;
        }

        public Criteria andSaleGettypeNotLike(String value) {
            addCriterion("sale_gettype not like", value, "saleGettype");
            return (Criteria) this;
        }

        public Criteria andSaleGettypeIn(List<String> values) {
            addCriterion("sale_gettype in", values, "saleGettype");
            return (Criteria) this;
        }

        public Criteria andSaleGettypeNotIn(List<String> values) {
            addCriterion("sale_gettype not in", values, "saleGettype");
            return (Criteria) this;
        }

        public Criteria andSaleGettypeBetween(String value1, String value2) {
            addCriterion("sale_gettype between", value1, value2, "saleGettype");
            return (Criteria) this;
        }

        public Criteria andSaleGettypeNotBetween(String value1, String value2) {
            addCriterion("sale_gettype not between", value1, value2, "saleGettype");
            return (Criteria) this;
        }

        public Criteria andProdNameIsNull() {
            addCriterion("prod_name is null");
            return (Criteria) this;
        }

        public Criteria andProdNameIsNotNull() {
            addCriterion("prod_name is not null");
            return (Criteria) this;
        }

        public Criteria andProdNameEqualTo(String value) {
            addCriterion("prod_name =", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotEqualTo(String value) {
            addCriterion("prod_name <>", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameGreaterThan(String value) {
            addCriterion("prod_name >", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameGreaterThanOrEqualTo(String value) {
            addCriterion("prod_name >=", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLessThan(String value) {
            addCriterion("prod_name <", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLessThanOrEqualTo(String value) {
            addCriterion("prod_name <=", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLike(String value) {
            addCriterion("prod_name like", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotLike(String value) {
            addCriterion("prod_name not like", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameIn(List<String> values) {
            addCriterion("prod_name in", values, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotIn(List<String> values) {
            addCriterion("prod_name not in", values, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameBetween(String value1, String value2) {
            addCriterion("prod_name between", value1, value2, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotBetween(String value1, String value2) {
            addCriterion("prod_name not between", value1, value2, "prodName");
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

        public Criteria andChaWeightIsNull() {
            addCriterion("cha_weight is null");
            return (Criteria) this;
        }

        public Criteria andChaWeightIsNotNull() {
            addCriterion("cha_weight is not null");
            return (Criteria) this;
        }

        public Criteria andChaWeightEqualTo(Float value) {
            addCriterion("cha_weight =", value, "chaWeight");
            return (Criteria) this;
        }

        public Criteria andChaWeightNotEqualTo(Float value) {
            addCriterion("cha_weight <>", value, "chaWeight");
            return (Criteria) this;
        }

        public Criteria andChaWeightGreaterThan(Float value) {
            addCriterion("cha_weight >", value, "chaWeight");
            return (Criteria) this;
        }

        public Criteria andChaWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("cha_weight >=", value, "chaWeight");
            return (Criteria) this;
        }

        public Criteria andChaWeightLessThan(Float value) {
            addCriterion("cha_weight <", value, "chaWeight");
            return (Criteria) this;
        }

        public Criteria andChaWeightLessThanOrEqualTo(Float value) {
            addCriterion("cha_weight <=", value, "chaWeight");
            return (Criteria) this;
        }

        public Criteria andChaWeightIn(List<Float> values) {
            addCriterion("cha_weight in", values, "chaWeight");
            return (Criteria) this;
        }

        public Criteria andChaWeightNotIn(List<Float> values) {
            addCriterion("cha_weight not in", values, "chaWeight");
            return (Criteria) this;
        }

        public Criteria andChaWeightBetween(Float value1, Float value2) {
            addCriterion("cha_weight between", value1, value2, "chaWeight");
            return (Criteria) this;
        }

        public Criteria andChaWeightNotBetween(Float value1, Float value2) {
            addCriterion("cha_weight not between", value1, value2, "chaWeight");
            return (Criteria) this;
        }

        public Criteria andRetWeightIsNull() {
            addCriterion("ret_weight is null");
            return (Criteria) this;
        }

        public Criteria andRetWeightIsNotNull() {
            addCriterion("ret_weight is not null");
            return (Criteria) this;
        }

        public Criteria andRetWeightEqualTo(Float value) {
            addCriterion("ret_weight =", value, "retWeight");
            return (Criteria) this;
        }

        public Criteria andRetWeightNotEqualTo(Float value) {
            addCriterion("ret_weight <>", value, "retWeight");
            return (Criteria) this;
        }

        public Criteria andRetWeightGreaterThan(Float value) {
            addCriterion("ret_weight >", value, "retWeight");
            return (Criteria) this;
        }

        public Criteria andRetWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("ret_weight >=", value, "retWeight");
            return (Criteria) this;
        }

        public Criteria andRetWeightLessThan(Float value) {
            addCriterion("ret_weight <", value, "retWeight");
            return (Criteria) this;
        }

        public Criteria andRetWeightLessThanOrEqualTo(Float value) {
            addCriterion("ret_weight <=", value, "retWeight");
            return (Criteria) this;
        }

        public Criteria andRetWeightIn(List<Float> values) {
            addCriterion("ret_weight in", values, "retWeight");
            return (Criteria) this;
        }

        public Criteria andRetWeightNotIn(List<Float> values) {
            addCriterion("ret_weight not in", values, "retWeight");
            return (Criteria) this;
        }

        public Criteria andRetWeightBetween(Float value1, Float value2) {
            addCriterion("ret_weight between", value1, value2, "retWeight");
            return (Criteria) this;
        }

        public Criteria andRetWeightNotBetween(Float value1, Float value2) {
            addCriterion("ret_weight not between", value1, value2, "retWeight");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNull() {
            addCriterion("sale_price is null");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNotNull() {
            addCriterion("sale_price is not null");
            return (Criteria) this;
        }

        public Criteria andSalePriceEqualTo(Float value) {
            addCriterion("sale_price =", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotEqualTo(Float value) {
            addCriterion("sale_price <>", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThan(Float value) {
            addCriterion("sale_price >", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThanOrEqualTo(Float value) {
            addCriterion("sale_price >=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThan(Float value) {
            addCriterion("sale_price <", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThanOrEqualTo(Float value) {
            addCriterion("sale_price <=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceIn(List<Float> values) {
            addCriterion("sale_price in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotIn(List<Float> values) {
            addCriterion("sale_price not in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceBetween(Float value1, Float value2) {
            addCriterion("sale_price between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotBetween(Float value1, Float value2) {
            addCriterion("sale_price not between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSaleAmtIsNull() {
            addCriterion("sale_amt is null");
            return (Criteria) this;
        }

        public Criteria andSaleAmtIsNotNull() {
            addCriterion("sale_amt is not null");
            return (Criteria) this;
        }

        public Criteria andSaleAmtEqualTo(Float value) {
            addCriterion("sale_amt =", value, "saleAmt");
            return (Criteria) this;
        }

        public Criteria andSaleAmtNotEqualTo(Float value) {
            addCriterion("sale_amt <>", value, "saleAmt");
            return (Criteria) this;
        }

        public Criteria andSaleAmtGreaterThan(Float value) {
            addCriterion("sale_amt >", value, "saleAmt");
            return (Criteria) this;
        }

        public Criteria andSaleAmtGreaterThanOrEqualTo(Float value) {
            addCriterion("sale_amt >=", value, "saleAmt");
            return (Criteria) this;
        }

        public Criteria andSaleAmtLessThan(Float value) {
            addCriterion("sale_amt <", value, "saleAmt");
            return (Criteria) this;
        }

        public Criteria andSaleAmtLessThanOrEqualTo(Float value) {
            addCriterion("sale_amt <=", value, "saleAmt");
            return (Criteria) this;
        }

        public Criteria andSaleAmtIn(List<Float> values) {
            addCriterion("sale_amt in", values, "saleAmt");
            return (Criteria) this;
        }

        public Criteria andSaleAmtNotIn(List<Float> values) {
            addCriterion("sale_amt not in", values, "saleAmt");
            return (Criteria) this;
        }

        public Criteria andSaleAmtBetween(Float value1, Float value2) {
            addCriterion("sale_amt between", value1, value2, "saleAmt");
            return (Criteria) this;
        }

        public Criteria andSaleAmtNotBetween(Float value1, Float value2) {
            addCriterion("sale_amt not between", value1, value2, "saleAmt");
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