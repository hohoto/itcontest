package com.itbs.persistence.entity;

import java.util.ArrayList;
import java.util.List;

public class TBasicSkuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBasicSkuExample() {
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

        public Criteria andSkuIdIsNull() {
            addCriterion("SKU_ID is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("SKU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(Integer value) {
            addCriterion("SKU_ID =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(Integer value) {
            addCriterion("SKU_ID <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(Integer value) {
            addCriterion("SKU_ID >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SKU_ID >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(Integer value) {
            addCriterion("SKU_ID <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(Integer value) {
            addCriterion("SKU_ID <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<Integer> values) {
            addCriterion("SKU_ID in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<Integer> values) {
            addCriterion("SKU_ID not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(Integer value1, Integer value2) {
            addCriterion("SKU_ID between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SKU_ID not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuCodeIsNull() {
            addCriterion("SKU_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSkuCodeIsNotNull() {
            addCriterion("SKU_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSkuCodeEqualTo(String value) {
            addCriterion("SKU_CODE =", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeNotEqualTo(String value) {
            addCriterion("SKU_CODE <>", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeGreaterThan(String value) {
            addCriterion("SKU_CODE >", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SKU_CODE >=", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeLessThan(String value) {
            addCriterion("SKU_CODE <", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeLessThanOrEqualTo(String value) {
            addCriterion("SKU_CODE <=", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeLike(String value) {
            addCriterion("SKU_CODE like", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeNotLike(String value) {
            addCriterion("SKU_CODE not like", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeIn(List<String> values) {
            addCriterion("SKU_CODE in", values, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeNotIn(List<String> values) {
            addCriterion("SKU_CODE not in", values, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeBetween(String value1, String value2) {
            addCriterion("SKU_CODE between", value1, value2, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeNotBetween(String value1, String value2) {
            addCriterion("SKU_CODE not between", value1, value2, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuDescIsNull() {
            addCriterion("SKU_DESC is null");
            return (Criteria) this;
        }

        public Criteria andSkuDescIsNotNull() {
            addCriterion("SKU_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andSkuDescEqualTo(String value) {
            addCriterion("SKU_DESC =", value, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescNotEqualTo(String value) {
            addCriterion("SKU_DESC <>", value, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescGreaterThan(String value) {
            addCriterion("SKU_DESC >", value, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescGreaterThanOrEqualTo(String value) {
            addCriterion("SKU_DESC >=", value, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescLessThan(String value) {
            addCriterion("SKU_DESC <", value, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescLessThanOrEqualTo(String value) {
            addCriterion("SKU_DESC <=", value, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescLike(String value) {
            addCriterion("SKU_DESC like", value, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescNotLike(String value) {
            addCriterion("SKU_DESC not like", value, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescIn(List<String> values) {
            addCriterion("SKU_DESC in", values, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescNotIn(List<String> values) {
            addCriterion("SKU_DESC not in", values, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescBetween(String value1, String value2) {
            addCriterion("SKU_DESC between", value1, value2, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescNotBetween(String value1, String value2) {
            addCriterion("SKU_DESC not between", value1, value2, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDetailIsNull() {
            addCriterion("SKU_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andSkuDetailIsNotNull() {
            addCriterion("SKU_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andSkuDetailEqualTo(Object value) {
            addCriterion("SKU_DETAIL =", value, "skuDetail");
            return (Criteria) this;
        }

        public Criteria andSkuDetailNotEqualTo(Object value) {
            addCriterion("SKU_DETAIL <>", value, "skuDetail");
            return (Criteria) this;
        }

        public Criteria andSkuDetailGreaterThan(Object value) {
            addCriterion("SKU_DETAIL >", value, "skuDetail");
            return (Criteria) this;
        }

        public Criteria andSkuDetailGreaterThanOrEqualTo(Object value) {
            addCriterion("SKU_DETAIL >=", value, "skuDetail");
            return (Criteria) this;
        }

        public Criteria andSkuDetailLessThan(Object value) {
            addCriterion("SKU_DETAIL <", value, "skuDetail");
            return (Criteria) this;
        }

        public Criteria andSkuDetailLessThanOrEqualTo(Object value) {
            addCriterion("SKU_DETAIL <=", value, "skuDetail");
            return (Criteria) this;
        }

        public Criteria andSkuDetailIn(List<Object> values) {
            addCriterion("SKU_DETAIL in", values, "skuDetail");
            return (Criteria) this;
        }

        public Criteria andSkuDetailNotIn(List<Object> values) {
            addCriterion("SKU_DETAIL not in", values, "skuDetail");
            return (Criteria) this;
        }

        public Criteria andSkuDetailBetween(Object value1, Object value2) {
            addCriterion("SKU_DETAIL between", value1, value2, "skuDetail");
            return (Criteria) this;
        }

        public Criteria andSkuDetailNotBetween(Object value1, Object value2) {
            addCriterion("SKU_DETAIL not between", value1, value2, "skuDetail");
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

        public Criteria andSkuOtherIsNull() {
            addCriterion("SKU_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andSkuOtherIsNotNull() {
            addCriterion("SKU_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andSkuOtherEqualTo(Object value) {
            addCriterion("SKU_OTHER =", value, "skuOther");
            return (Criteria) this;
        }

        public Criteria andSkuOtherNotEqualTo(Object value) {
            addCriterion("SKU_OTHER <>", value, "skuOther");
            return (Criteria) this;
        }

        public Criteria andSkuOtherGreaterThan(Object value) {
            addCriterion("SKU_OTHER >", value, "skuOther");
            return (Criteria) this;
        }

        public Criteria andSkuOtherGreaterThanOrEqualTo(Object value) {
            addCriterion("SKU_OTHER >=", value, "skuOther");
            return (Criteria) this;
        }

        public Criteria andSkuOtherLessThan(Object value) {
            addCriterion("SKU_OTHER <", value, "skuOther");
            return (Criteria) this;
        }

        public Criteria andSkuOtherLessThanOrEqualTo(Object value) {
            addCriterion("SKU_OTHER <=", value, "skuOther");
            return (Criteria) this;
        }

        public Criteria andSkuOtherIn(List<Object> values) {
            addCriterion("SKU_OTHER in", values, "skuOther");
            return (Criteria) this;
        }

        public Criteria andSkuOtherNotIn(List<Object> values) {
            addCriterion("SKU_OTHER not in", values, "skuOther");
            return (Criteria) this;
        }

        public Criteria andSkuOtherBetween(Object value1, Object value2) {
            addCriterion("SKU_OTHER between", value1, value2, "skuOther");
            return (Criteria) this;
        }

        public Criteria andSkuOtherNotBetween(Object value1, Object value2) {
            addCriterion("SKU_OTHER not between", value1, value2, "skuOther");
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