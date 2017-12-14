package com.helloword.entity;

import java.util.ArrayList;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIsNull() {
            addCriterion("customer_sex is null");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIsNotNull() {
            addCriterion("customer_sex is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerSexEqualTo(String value) {
            addCriterion("customer_sex =", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotEqualTo(String value) {
            addCriterion("customer_sex <>", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexGreaterThan(String value) {
            addCriterion("customer_sex >", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexGreaterThanOrEqualTo(String value) {
            addCriterion("customer_sex >=", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexLessThan(String value) {
            addCriterion("customer_sex <", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexLessThanOrEqualTo(String value) {
            addCriterion("customer_sex <=", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexLike(String value) {
            addCriterion("customer_sex like", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotLike(String value) {
            addCriterion("customer_sex not like", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIn(List<String> values) {
            addCriterion("customer_sex in", values, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotIn(List<String> values) {
            addCriterion("customer_sex not in", values, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexBetween(String value1, String value2) {
            addCriterion("customer_sex between", value1, value2, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotBetween(String value1, String value2) {
            addCriterion("customer_sex not between", value1, value2, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerIdcardIsNull() {
            addCriterion("customer_idcard is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdcardIsNotNull() {
            addCriterion("customer_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdcardEqualTo(String value) {
            addCriterion("customer_idcard =", value, "customerIdcard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdcardNotEqualTo(String value) {
            addCriterion("customer_idcard <>", value, "customerIdcard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdcardGreaterThan(String value) {
            addCriterion("customer_idcard >", value, "customerIdcard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("customer_idcard >=", value, "customerIdcard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdcardLessThan(String value) {
            addCriterion("customer_idcard <", value, "customerIdcard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdcardLessThanOrEqualTo(String value) {
            addCriterion("customer_idcard <=", value, "customerIdcard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdcardLike(String value) {
            addCriterion("customer_idcard like", value, "customerIdcard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdcardNotLike(String value) {
            addCriterion("customer_idcard not like", value, "customerIdcard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdcardIn(List<String> values) {
            addCriterion("customer_idcard in", values, "customerIdcard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdcardNotIn(List<String> values) {
            addCriterion("customer_idcard not in", values, "customerIdcard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdcardBetween(String value1, String value2) {
            addCriterion("customer_idcard between", value1, value2, "customerIdcard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdcardNotBetween(String value1, String value2) {
            addCriterion("customer_idcard not between", value1, value2, "customerIdcard");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhotoIsNull() {
            addCriterion("customer_photo is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhotoIsNotNull() {
            addCriterion("customer_photo is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhotoEqualTo(String value) {
            addCriterion("customer_photo =", value, "customerPhoto");
            return (Criteria) this;
        }

        public Criteria andCustomerPhotoNotEqualTo(String value) {
            addCriterion("customer_photo <>", value, "customerPhoto");
            return (Criteria) this;
        }

        public Criteria andCustomerPhotoGreaterThan(String value) {
            addCriterion("customer_photo >", value, "customerPhoto");
            return (Criteria) this;
        }

        public Criteria andCustomerPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("customer_photo >=", value, "customerPhoto");
            return (Criteria) this;
        }

        public Criteria andCustomerPhotoLessThan(String value) {
            addCriterion("customer_photo <", value, "customerPhoto");
            return (Criteria) this;
        }

        public Criteria andCustomerPhotoLessThanOrEqualTo(String value) {
            addCriterion("customer_photo <=", value, "customerPhoto");
            return (Criteria) this;
        }

        public Criteria andCustomerPhotoLike(String value) {
            addCriterion("customer_photo like", value, "customerPhoto");
            return (Criteria) this;
        }

        public Criteria andCustomerPhotoNotLike(String value) {
            addCriterion("customer_photo not like", value, "customerPhoto");
            return (Criteria) this;
        }

        public Criteria andCustomerPhotoIn(List<String> values) {
            addCriterion("customer_photo in", values, "customerPhoto");
            return (Criteria) this;
        }

        public Criteria andCustomerPhotoNotIn(List<String> values) {
            addCriterion("customer_photo not in", values, "customerPhoto");
            return (Criteria) this;
        }

        public Criteria andCustomerPhotoBetween(String value1, String value2) {
            addCriterion("customer_photo between", value1, value2, "customerPhoto");
            return (Criteria) this;
        }

        public Criteria andCustomerPhotoNotBetween(String value1, String value2) {
            addCriterion("customer_photo not between", value1, value2, "customerPhoto");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNull() {
            addCriterion("customer_type is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNotNull() {
            addCriterion("customer_type is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeEqualTo(String value) {
            addCriterion("customer_type =", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotEqualTo(String value) {
            addCriterion("customer_type <>", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThan(String value) {
            addCriterion("customer_type >", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("customer_type >=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThan(String value) {
            addCriterion("customer_type <", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThanOrEqualTo(String value) {
            addCriterion("customer_type <=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLike(String value) {
            addCriterion("customer_type like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotLike(String value) {
            addCriterion("customer_type not like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIn(List<String> values) {
            addCriterion("customer_type in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotIn(List<String> values) {
            addCriterion("customer_type not in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeBetween(String value1, String value2) {
            addCriterion("customer_type between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotBetween(String value1, String value2) {
            addCriterion("customer_type not between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andSpareIsNull() {
            addCriterion("spare is null");
            return (Criteria) this;
        }

        public Criteria andSpareIsNotNull() {
            addCriterion("spare is not null");
            return (Criteria) this;
        }

        public Criteria andSpareEqualTo(String value) {
            addCriterion("spare =", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareNotEqualTo(String value) {
            addCriterion("spare <>", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareGreaterThan(String value) {
            addCriterion("spare >", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareGreaterThanOrEqualTo(String value) {
            addCriterion("spare >=", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareLessThan(String value) {
            addCriterion("spare <", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareLessThanOrEqualTo(String value) {
            addCriterion("spare <=", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareLike(String value) {
            addCriterion("spare like", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareNotLike(String value) {
            addCriterion("spare not like", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareIn(List<String> values) {
            addCriterion("spare in", values, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareNotIn(List<String> values) {
            addCriterion("spare not in", values, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareBetween(String value1, String value2) {
            addCriterion("spare between", value1, value2, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareNotBetween(String value1, String value2) {
            addCriterion("spare not between", value1, value2, "spare");
            return (Criteria) this;
        }
    }

    /**
     */
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