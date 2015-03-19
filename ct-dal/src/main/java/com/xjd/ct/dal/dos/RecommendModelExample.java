package com.xjd.ct.dal.dos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecommendModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecommendModelExample() {
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

        public Criteria andRecommendIdIsNull() {
            addCriterion("RECOMMEND_ID is null");
            return (Criteria) this;
        }

        public Criteria andRecommendIdIsNotNull() {
            addCriterion("RECOMMEND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendIdEqualTo(Long value) {
            addCriterion("RECOMMEND_ID =", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdNotEqualTo(Long value) {
            addCriterion("RECOMMEND_ID <>", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdGreaterThan(Long value) {
            addCriterion("RECOMMEND_ID >", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdGreaterThanOrEqualTo(Long value) {
            addCriterion("RECOMMEND_ID >=", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdLessThan(Long value) {
            addCriterion("RECOMMEND_ID <", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdLessThanOrEqualTo(Long value) {
            addCriterion("RECOMMEND_ID <=", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdIn(List<Long> values) {
            addCriterion("RECOMMEND_ID in", values, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdNotIn(List<Long> values) {
            addCriterion("RECOMMEND_ID not in", values, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdBetween(Long value1, Long value2) {
            addCriterion("RECOMMEND_ID between", value1, value2, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdNotBetween(Long value1, Long value2) {
            addCriterion("RECOMMEND_ID not between", value1, value2, "recommendId");
            return (Criteria) this;
        }

        public Criteria andObjectTypeIsNull() {
            addCriterion("OBJECT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andObjectTypeIsNotNull() {
            addCriterion("OBJECT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andObjectTypeEqualTo(Byte value) {
            addCriterion("OBJECT_TYPE =", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeNotEqualTo(Byte value) {
            addCriterion("OBJECT_TYPE <>", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeGreaterThan(Byte value) {
            addCriterion("OBJECT_TYPE >", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("OBJECT_TYPE >=", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeLessThan(Byte value) {
            addCriterion("OBJECT_TYPE <", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeLessThanOrEqualTo(Byte value) {
            addCriterion("OBJECT_TYPE <=", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeIn(List<Byte> values) {
            addCriterion("OBJECT_TYPE in", values, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeNotIn(List<Byte> values) {
            addCriterion("OBJECT_TYPE not in", values, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeBetween(Byte value1, Byte value2) {
            addCriterion("OBJECT_TYPE between", value1, value2, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("OBJECT_TYPE not between", value1, value2, "objectType");
            return (Criteria) this;
        }

        public Criteria andRecommendRefIdIsNull() {
            addCriterion("RECOMMEND_REF_ID is null");
            return (Criteria) this;
        }

        public Criteria andRecommendRefIdIsNotNull() {
            addCriterion("RECOMMEND_REF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendRefIdEqualTo(Long value) {
            addCriterion("RECOMMEND_REF_ID =", value, "recommendRefId");
            return (Criteria) this;
        }

        public Criteria andRecommendRefIdNotEqualTo(Long value) {
            addCriterion("RECOMMEND_REF_ID <>", value, "recommendRefId");
            return (Criteria) this;
        }

        public Criteria andRecommendRefIdGreaterThan(Long value) {
            addCriterion("RECOMMEND_REF_ID >", value, "recommendRefId");
            return (Criteria) this;
        }

        public Criteria andRecommendRefIdGreaterThanOrEqualTo(Long value) {
            addCriterion("RECOMMEND_REF_ID >=", value, "recommendRefId");
            return (Criteria) this;
        }

        public Criteria andRecommendRefIdLessThan(Long value) {
            addCriterion("RECOMMEND_REF_ID <", value, "recommendRefId");
            return (Criteria) this;
        }

        public Criteria andRecommendRefIdLessThanOrEqualTo(Long value) {
            addCriterion("RECOMMEND_REF_ID <=", value, "recommendRefId");
            return (Criteria) this;
        }

        public Criteria andRecommendRefIdIn(List<Long> values) {
            addCriterion("RECOMMEND_REF_ID in", values, "recommendRefId");
            return (Criteria) this;
        }

        public Criteria andRecommendRefIdNotIn(List<Long> values) {
            addCriterion("RECOMMEND_REF_ID not in", values, "recommendRefId");
            return (Criteria) this;
        }

        public Criteria andRecommendRefIdBetween(Long value1, Long value2) {
            addCriterion("RECOMMEND_REF_ID between", value1, value2, "recommendRefId");
            return (Criteria) this;
        }

        public Criteria andRecommendRefIdNotBetween(Long value1, Long value2) {
            addCriterion("RECOMMEND_REF_ID not between", value1, value2, "recommendRefId");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeIsNull() {
            addCriterion("RECOMMEND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeIsNotNull() {
            addCriterion("RECOMMEND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeEqualTo(Date value) {
            addCriterion("RECOMMEND_TIME =", value, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeNotEqualTo(Date value) {
            addCriterion("RECOMMEND_TIME <>", value, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeGreaterThan(Date value) {
            addCriterion("RECOMMEND_TIME >", value, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RECOMMEND_TIME >=", value, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeLessThan(Date value) {
            addCriterion("RECOMMEND_TIME <", value, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeLessThanOrEqualTo(Date value) {
            addCriterion("RECOMMEND_TIME <=", value, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeIn(List<Date> values) {
            addCriterion("RECOMMEND_TIME in", values, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeNotIn(List<Date> values) {
            addCriterion("RECOMMEND_TIME not in", values, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeBetween(Date value1, Date value2) {
            addCriterion("RECOMMEND_TIME between", value1, value2, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeNotBetween(Date value1, Date value2) {
            addCriterion("RECOMMEND_TIME not between", value1, value2, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendOrderIsNull() {
            addCriterion("RECOMMEND_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andRecommendOrderIsNotNull() {
            addCriterion("RECOMMEND_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendOrderEqualTo(Short value) {
            addCriterion("RECOMMEND_ORDER =", value, "recommendOrder");
            return (Criteria) this;
        }

        public Criteria andRecommendOrderNotEqualTo(Short value) {
            addCriterion("RECOMMEND_ORDER <>", value, "recommendOrder");
            return (Criteria) this;
        }

        public Criteria andRecommendOrderGreaterThan(Short value) {
            addCriterion("RECOMMEND_ORDER >", value, "recommendOrder");
            return (Criteria) this;
        }

        public Criteria andRecommendOrderGreaterThanOrEqualTo(Short value) {
            addCriterion("RECOMMEND_ORDER >=", value, "recommendOrder");
            return (Criteria) this;
        }

        public Criteria andRecommendOrderLessThan(Short value) {
            addCriterion("RECOMMEND_ORDER <", value, "recommendOrder");
            return (Criteria) this;
        }

        public Criteria andRecommendOrderLessThanOrEqualTo(Short value) {
            addCriterion("RECOMMEND_ORDER <=", value, "recommendOrder");
            return (Criteria) this;
        }

        public Criteria andRecommendOrderIn(List<Short> values) {
            addCriterion("RECOMMEND_ORDER in", values, "recommendOrder");
            return (Criteria) this;
        }

        public Criteria andRecommendOrderNotIn(List<Short> values) {
            addCriterion("RECOMMEND_ORDER not in", values, "recommendOrder");
            return (Criteria) this;
        }

        public Criteria andRecommendOrderBetween(Short value1, Short value2) {
            addCriterion("RECOMMEND_ORDER between", value1, value2, "recommendOrder");
            return (Criteria) this;
        }

        public Criteria andRecommendOrderNotBetween(Short value1, Short value2) {
            addCriterion("RECOMMEND_ORDER not between", value1, value2, "recommendOrder");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("ADD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("ADD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("ADD_TIME =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("ADD_TIME <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("ADD_TIME >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ADD_TIME >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("ADD_TIME <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("ADD_TIME <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("ADD_TIME in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("ADD_TIME not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("ADD_TIME between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("ADD_TIME not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIsNull() {
            addCriterion("UPD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIsNotNull() {
            addCriterion("UPD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdTimeEqualTo(Date value) {
            addCriterion("UPD_TIME =", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotEqualTo(Date value) {
            addCriterion("UPD_TIME <>", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThan(Date value) {
            addCriterion("UPD_TIME >", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPD_TIME >=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThan(Date value) {
            addCriterion("UPD_TIME <", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPD_TIME <=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIn(List<Date> values) {
            addCriterion("UPD_TIME in", values, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotIn(List<Date> values) {
            addCriterion("UPD_TIME not in", values, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeBetween(Date value1, Date value2) {
            addCriterion("UPD_TIME between", value1, value2, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPD_TIME not between", value1, value2, "updTime");
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