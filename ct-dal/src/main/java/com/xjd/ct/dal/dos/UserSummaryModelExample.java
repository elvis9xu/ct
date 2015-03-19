package com.xjd.ct.dal.dos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserSummaryModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserSummaryModelExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andInformCountIsNull() {
            addCriterion("INFORM_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andInformCountIsNotNull() {
            addCriterion("INFORM_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andInformCountEqualTo(Integer value) {
            addCriterion("INFORM_COUNT =", value, "informCount");
            return (Criteria) this;
        }

        public Criteria andInformCountNotEqualTo(Integer value) {
            addCriterion("INFORM_COUNT <>", value, "informCount");
            return (Criteria) this;
        }

        public Criteria andInformCountGreaterThan(Integer value) {
            addCriterion("INFORM_COUNT >", value, "informCount");
            return (Criteria) this;
        }

        public Criteria andInformCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("INFORM_COUNT >=", value, "informCount");
            return (Criteria) this;
        }

        public Criteria andInformCountLessThan(Integer value) {
            addCriterion("INFORM_COUNT <", value, "informCount");
            return (Criteria) this;
        }

        public Criteria andInformCountLessThanOrEqualTo(Integer value) {
            addCriterion("INFORM_COUNT <=", value, "informCount");
            return (Criteria) this;
        }

        public Criteria andInformCountIn(List<Integer> values) {
            addCriterion("INFORM_COUNT in", values, "informCount");
            return (Criteria) this;
        }

        public Criteria andInformCountNotIn(List<Integer> values) {
            addCriterion("INFORM_COUNT not in", values, "informCount");
            return (Criteria) this;
        }

        public Criteria andInformCountBetween(Integer value1, Integer value2) {
            addCriterion("INFORM_COUNT between", value1, value2, "informCount");
            return (Criteria) this;
        }

        public Criteria andInformCountNotBetween(Integer value1, Integer value2) {
            addCriterion("INFORM_COUNT not between", value1, value2, "informCount");
            return (Criteria) this;
        }

        public Criteria andFavorCountIsNull() {
            addCriterion("FAVOR_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andFavorCountIsNotNull() {
            addCriterion("FAVOR_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andFavorCountEqualTo(Integer value) {
            addCriterion("FAVOR_COUNT =", value, "favorCount");
            return (Criteria) this;
        }

        public Criteria andFavorCountNotEqualTo(Integer value) {
            addCriterion("FAVOR_COUNT <>", value, "favorCount");
            return (Criteria) this;
        }

        public Criteria andFavorCountGreaterThan(Integer value) {
            addCriterion("FAVOR_COUNT >", value, "favorCount");
            return (Criteria) this;
        }

        public Criteria andFavorCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("FAVOR_COUNT >=", value, "favorCount");
            return (Criteria) this;
        }

        public Criteria andFavorCountLessThan(Integer value) {
            addCriterion("FAVOR_COUNT <", value, "favorCount");
            return (Criteria) this;
        }

        public Criteria andFavorCountLessThanOrEqualTo(Integer value) {
            addCriterion("FAVOR_COUNT <=", value, "favorCount");
            return (Criteria) this;
        }

        public Criteria andFavorCountIn(List<Integer> values) {
            addCriterion("FAVOR_COUNT in", values, "favorCount");
            return (Criteria) this;
        }

        public Criteria andFavorCountNotIn(List<Integer> values) {
            addCriterion("FAVOR_COUNT not in", values, "favorCount");
            return (Criteria) this;
        }

        public Criteria andFavorCountBetween(Integer value1, Integer value2) {
            addCriterion("FAVOR_COUNT between", value1, value2, "favorCount");
            return (Criteria) this;
        }

        public Criteria andFavorCountNotBetween(Integer value1, Integer value2) {
            addCriterion("FAVOR_COUNT not between", value1, value2, "favorCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountIsNull() {
            addCriterion("PUBLISH_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andPublishCountIsNotNull() {
            addCriterion("PUBLISH_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPublishCountEqualTo(Integer value) {
            addCriterion("PUBLISH_COUNT =", value, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountNotEqualTo(Integer value) {
            addCriterion("PUBLISH_COUNT <>", value, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountGreaterThan(Integer value) {
            addCriterion("PUBLISH_COUNT >", value, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("PUBLISH_COUNT >=", value, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountLessThan(Integer value) {
            addCriterion("PUBLISH_COUNT <", value, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountLessThanOrEqualTo(Integer value) {
            addCriterion("PUBLISH_COUNT <=", value, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountIn(List<Integer> values) {
            addCriterion("PUBLISH_COUNT in", values, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountNotIn(List<Integer> values) {
            addCriterion("PUBLISH_COUNT not in", values, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountBetween(Integer value1, Integer value2) {
            addCriterion("PUBLISH_COUNT between", value1, value2, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountNotBetween(Integer value1, Integer value2) {
            addCriterion("PUBLISH_COUNT not between", value1, value2, "publishCount");
            return (Criteria) this;
        }

        public Criteria andIdolCountIsNull() {
            addCriterion("IDOL_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andIdolCountIsNotNull() {
            addCriterion("IDOL_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andIdolCountEqualTo(Integer value) {
            addCriterion("IDOL_COUNT =", value, "idolCount");
            return (Criteria) this;
        }

        public Criteria andIdolCountNotEqualTo(Integer value) {
            addCriterion("IDOL_COUNT <>", value, "idolCount");
            return (Criteria) this;
        }

        public Criteria andIdolCountGreaterThan(Integer value) {
            addCriterion("IDOL_COUNT >", value, "idolCount");
            return (Criteria) this;
        }

        public Criteria andIdolCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("IDOL_COUNT >=", value, "idolCount");
            return (Criteria) this;
        }

        public Criteria andIdolCountLessThan(Integer value) {
            addCriterion("IDOL_COUNT <", value, "idolCount");
            return (Criteria) this;
        }

        public Criteria andIdolCountLessThanOrEqualTo(Integer value) {
            addCriterion("IDOL_COUNT <=", value, "idolCount");
            return (Criteria) this;
        }

        public Criteria andIdolCountIn(List<Integer> values) {
            addCriterion("IDOL_COUNT in", values, "idolCount");
            return (Criteria) this;
        }

        public Criteria andIdolCountNotIn(List<Integer> values) {
            addCriterion("IDOL_COUNT not in", values, "idolCount");
            return (Criteria) this;
        }

        public Criteria andIdolCountBetween(Integer value1, Integer value2) {
            addCriterion("IDOL_COUNT between", value1, value2, "idolCount");
            return (Criteria) this;
        }

        public Criteria andIdolCountNotBetween(Integer value1, Integer value2) {
            addCriterion("IDOL_COUNT not between", value1, value2, "idolCount");
            return (Criteria) this;
        }

        public Criteria andFansCountIsNull() {
            addCriterion("FANS_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andFansCountIsNotNull() {
            addCriterion("FANS_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andFansCountEqualTo(Integer value) {
            addCriterion("FANS_COUNT =", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountNotEqualTo(Integer value) {
            addCriterion("FANS_COUNT <>", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountGreaterThan(Integer value) {
            addCriterion("FANS_COUNT >", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("FANS_COUNT >=", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountLessThan(Integer value) {
            addCriterion("FANS_COUNT <", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountLessThanOrEqualTo(Integer value) {
            addCriterion("FANS_COUNT <=", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountIn(List<Integer> values) {
            addCriterion("FANS_COUNT in", values, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountNotIn(List<Integer> values) {
            addCriterion("FANS_COUNT not in", values, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountBetween(Integer value1, Integer value2) {
            addCriterion("FANS_COUNT between", value1, value2, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountNotBetween(Integer value1, Integer value2) {
            addCriterion("FANS_COUNT not between", value1, value2, "fansCount");
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