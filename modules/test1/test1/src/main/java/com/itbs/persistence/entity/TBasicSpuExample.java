package com.itbs.persistence.entity;

import java.util.ArrayList;
import java.util.List;

public class TBasicSpuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBasicSpuExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSpuIdIsNull() {
            addCriterion("SPU_ID is null");
            return (Criteria) this;
        }

        public Criteria andSpuIdIsNotNull() {
            addCriterion("SPU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSpuIdEqualTo(Integer value) {
            addCriterion("SPU_ID =", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdNotEqualTo(Integer value) {
            addCriterion("SPU_ID <>", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdGreaterThan(Integer value) {
            addCriterion("SPU_ID >", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SPU_ID >=", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdLessThan(Integer value) {
            addCriterion("SPU_ID <", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdLessThanOrEqualTo(Integer value) {
            addCriterion("SPU_ID <=", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdIn(List<Integer> values) {
            addCriterion("SPU_ID in", values, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdNotIn(List<Integer> values) {
            addCriterion("SPU_ID not in", values, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdBetween(Integer value1, Integer value2) {
            addCriterion("SPU_ID between", value1, value2, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SPU_ID not between", value1, value2, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuCodeIsNull() {
            addCriterion("SPU_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSpuCodeIsNotNull() {
            addCriterion("SPU_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSpuCodeEqualTo(String value) {
            addCriterion("SPU_CODE =", value, "spuCode");
            return (Criteria) this;
        }

        public Criteria andSpuCodeNotEqualTo(String value) {
            addCriterion("SPU_CODE <>", value, "spuCode");
            return (Criteria) this;
        }

        public Criteria andSpuCodeGreaterThan(String value) {
            addCriterion("SPU_CODE >", value, "spuCode");
            return (Criteria) this;
        }

        public Criteria andSpuCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SPU_CODE >=", value, "spuCode");
            return (Criteria) this;
        }

        public Criteria andSpuCodeLessThan(String value) {
            addCriterion("SPU_CODE <", value, "spuCode");
            return (Criteria) this;
        }

        public Criteria andSpuCodeLessThanOrEqualTo(String value) {
            addCriterion("SPU_CODE <=", value, "spuCode");
            return (Criteria) this;
        }

        public Criteria andSpuCodeLike(String value) {
            addCriterion("SPU_CODE like", value, "spuCode");
            return (Criteria) this;
        }

        public Criteria andSpuCodeNotLike(String value) {
            addCriterion("SPU_CODE not like", value, "spuCode");
            return (Criteria) this;
        }

        public Criteria andSpuCodeIn(List<String> values) {
            addCriterion("SPU_CODE in", values, "spuCode");
            return (Criteria) this;
        }

        public Criteria andSpuCodeNotIn(List<String> values) {
            addCriterion("SPU_CODE not in", values, "spuCode");
            return (Criteria) this;
        }

        public Criteria andSpuCodeBetween(String value1, String value2) {
            addCriterion("SPU_CODE between", value1, value2, "spuCode");
            return (Criteria) this;
        }

        public Criteria andSpuCodeNotBetween(String value1, String value2) {
            addCriterion("SPU_CODE not between", value1, value2, "spuCode");
            return (Criteria) this;
        }

        public Criteria andSpuNameIsNull() {
            addCriterion("SPU_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSpuNameIsNotNull() {
            addCriterion("SPU_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSpuNameEqualTo(String value) {
            addCriterion("SPU_NAME =", value, "spuName");
            return (Criteria) this;
        }

        public Criteria andSpuNameNotEqualTo(String value) {
            addCriterion("SPU_NAME <>", value, "spuName");
            return (Criteria) this;
        }

        public Criteria andSpuNameGreaterThan(String value) {
            addCriterion("SPU_NAME >", value, "spuName");
            return (Criteria) this;
        }

        public Criteria andSpuNameGreaterThanOrEqualTo(String value) {
            addCriterion("SPU_NAME >=", value, "spuName");
            return (Criteria) this;
        }

        public Criteria andSpuNameLessThan(String value) {
            addCriterion("SPU_NAME <", value, "spuName");
            return (Criteria) this;
        }

        public Criteria andSpuNameLessThanOrEqualTo(String value) {
            addCriterion("SPU_NAME <=", value, "spuName");
            return (Criteria) this;
        }

        public Criteria andSpuNameLike(String value) {
            addCriterion("SPU_NAME like", value, "spuName");
            return (Criteria) this;
        }

        public Criteria andSpuNameNotLike(String value) {
            addCriterion("SPU_NAME not like", value, "spuName");
            return (Criteria) this;
        }

        public Criteria andSpuNameIn(List<String> values) {
            addCriterion("SPU_NAME in", values, "spuName");
            return (Criteria) this;
        }

        public Criteria andSpuNameNotIn(List<String> values) {
            addCriterion("SPU_NAME not in", values, "spuName");
            return (Criteria) this;
        }

        public Criteria andSpuNameBetween(String value1, String value2) {
            addCriterion("SPU_NAME between", value1, value2, "spuName");
            return (Criteria) this;
        }

        public Criteria andSpuNameNotBetween(String value1, String value2) {
            addCriterion("SPU_NAME not between", value1, value2, "spuName");
            return (Criteria) this;
        }

        public Criteria andSpuDescIsNull() {
            addCriterion("SPU_DESC is null");
            return (Criteria) this;
        }

        public Criteria andSpuDescIsNotNull() {
            addCriterion("SPU_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andSpuDescEqualTo(String value) {
            addCriterion("SPU_DESC =", value, "spuDesc");
            return (Criteria) this;
        }

        public Criteria andSpuDescNotEqualTo(String value) {
            addCriterion("SPU_DESC <>", value, "spuDesc");
            return (Criteria) this;
        }

        public Criteria andSpuDescGreaterThan(String value) {
            addCriterion("SPU_DESC >", value, "spuDesc");
            return (Criteria) this;
        }

        public Criteria andSpuDescGreaterThanOrEqualTo(String value) {
            addCriterion("SPU_DESC >=", value, "spuDesc");
            return (Criteria) this;
        }

        public Criteria andSpuDescLessThan(String value) {
            addCriterion("SPU_DESC <", value, "spuDesc");
            return (Criteria) this;
        }

        public Criteria andSpuDescLessThanOrEqualTo(String value) {
            addCriterion("SPU_DESC <=", value, "spuDesc");
            return (Criteria) this;
        }

        public Criteria andSpuDescLike(String value) {
            addCriterion("SPU_DESC like", value, "spuDesc");
            return (Criteria) this;
        }

        public Criteria andSpuDescNotLike(String value) {
            addCriterion("SPU_DESC not like", value, "spuDesc");
            return (Criteria) this;
        }

        public Criteria andSpuDescIn(List<String> values) {
            addCriterion("SPU_DESC in", values, "spuDesc");
            return (Criteria) this;
        }

        public Criteria andSpuDescNotIn(List<String> values) {
            addCriterion("SPU_DESC not in", values, "spuDesc");
            return (Criteria) this;
        }

        public Criteria andSpuDescBetween(String value1, String value2) {
            addCriterion("SPU_DESC between", value1, value2, "spuDesc");
            return (Criteria) this;
        }

        public Criteria andSpuDescNotBetween(String value1, String value2) {
            addCriterion("SPU_DESC not between", value1, value2, "spuDesc");
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