package com.xjd.ct.dal.dos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PublishModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PublishModelExample() {
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

        public Criteria andPublishIdIsNull() {
            addCriterion("PUBLISH_ID is null");
            return (Criteria) this;
        }

        public Criteria andPublishIdIsNotNull() {
            addCriterion("PUBLISH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPublishIdEqualTo(Long value) {
            addCriterion("PUBLISH_ID =", value, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdNotEqualTo(Long value) {
            addCriterion("PUBLISH_ID <>", value, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdGreaterThan(Long value) {
            addCriterion("PUBLISH_ID >", value, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PUBLISH_ID >=", value, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdLessThan(Long value) {
            addCriterion("PUBLISH_ID <", value, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdLessThanOrEqualTo(Long value) {
            addCriterion("PUBLISH_ID <=", value, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdIn(List<Long> values) {
            addCriterion("PUBLISH_ID in", values, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdNotIn(List<Long> values) {
            addCriterion("PUBLISH_ID not in", values, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdBetween(Long value1, Long value2) {
            addCriterion("PUBLISH_ID between", value1, value2, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdNotBetween(Long value1, Long value2) {
            addCriterion("PUBLISH_ID not between", value1, value2, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishTitleIsNull() {
            addCriterion("PUBLISH_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andPublishTitleIsNotNull() {
            addCriterion("PUBLISH_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTitleEqualTo(String value) {
            addCriterion("PUBLISH_TITLE =", value, "publishTitle");
            return (Criteria) this;
        }

        public Criteria andPublishTitleNotEqualTo(String value) {
            addCriterion("PUBLISH_TITLE <>", value, "publishTitle");
            return (Criteria) this;
        }

        public Criteria andPublishTitleGreaterThan(String value) {
            addCriterion("PUBLISH_TITLE >", value, "publishTitle");
            return (Criteria) this;
        }

        public Criteria andPublishTitleGreaterThanOrEqualTo(String value) {
            addCriterion("PUBLISH_TITLE >=", value, "publishTitle");
            return (Criteria) this;
        }

        public Criteria andPublishTitleLessThan(String value) {
            addCriterion("PUBLISH_TITLE <", value, "publishTitle");
            return (Criteria) this;
        }

        public Criteria andPublishTitleLessThanOrEqualTo(String value) {
            addCriterion("PUBLISH_TITLE <=", value, "publishTitle");
            return (Criteria) this;
        }

        public Criteria andPublishTitleLike(String value) {
            addCriterion("PUBLISH_TITLE like", value, "publishTitle");
            return (Criteria) this;
        }

        public Criteria andPublishTitleNotLike(String value) {
            addCriterion("PUBLISH_TITLE not like", value, "publishTitle");
            return (Criteria) this;
        }

        public Criteria andPublishTitleIn(List<String> values) {
            addCriterion("PUBLISH_TITLE in", values, "publishTitle");
            return (Criteria) this;
        }

        public Criteria andPublishTitleNotIn(List<String> values) {
            addCriterion("PUBLISH_TITLE not in", values, "publishTitle");
            return (Criteria) this;
        }

        public Criteria andPublishTitleBetween(String value1, String value2) {
            addCriterion("PUBLISH_TITLE between", value1, value2, "publishTitle");
            return (Criteria) this;
        }

        public Criteria andPublishTitleNotBetween(String value1, String value2) {
            addCriterion("PUBLISH_TITLE not between", value1, value2, "publishTitle");
            return (Criteria) this;
        }

        public Criteria andPublishTextIsNull() {
            addCriterion("PUBLISH_TEXT is null");
            return (Criteria) this;
        }

        public Criteria andPublishTextIsNotNull() {
            addCriterion("PUBLISH_TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTextEqualTo(String value) {
            addCriterion("PUBLISH_TEXT =", value, "publishText");
            return (Criteria) this;
        }

        public Criteria andPublishTextNotEqualTo(String value) {
            addCriterion("PUBLISH_TEXT <>", value, "publishText");
            return (Criteria) this;
        }

        public Criteria andPublishTextGreaterThan(String value) {
            addCriterion("PUBLISH_TEXT >", value, "publishText");
            return (Criteria) this;
        }

        public Criteria andPublishTextGreaterThanOrEqualTo(String value) {
            addCriterion("PUBLISH_TEXT >=", value, "publishText");
            return (Criteria) this;
        }

        public Criteria andPublishTextLessThan(String value) {
            addCriterion("PUBLISH_TEXT <", value, "publishText");
            return (Criteria) this;
        }

        public Criteria andPublishTextLessThanOrEqualTo(String value) {
            addCriterion("PUBLISH_TEXT <=", value, "publishText");
            return (Criteria) this;
        }

        public Criteria andPublishTextLike(String value) {
            addCriterion("PUBLISH_TEXT like", value, "publishText");
            return (Criteria) this;
        }

        public Criteria andPublishTextNotLike(String value) {
            addCriterion("PUBLISH_TEXT not like", value, "publishText");
            return (Criteria) this;
        }

        public Criteria andPublishTextIn(List<String> values) {
            addCriterion("PUBLISH_TEXT in", values, "publishText");
            return (Criteria) this;
        }

        public Criteria andPublishTextNotIn(List<String> values) {
            addCriterion("PUBLISH_TEXT not in", values, "publishText");
            return (Criteria) this;
        }

        public Criteria andPublishTextBetween(String value1, String value2) {
            addCriterion("PUBLISH_TEXT between", value1, value2, "publishText");
            return (Criteria) this;
        }

        public Criteria andPublishTextNotBetween(String value1, String value2) {
            addCriterion("PUBLISH_TEXT not between", value1, value2, "publishText");
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