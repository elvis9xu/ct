package com.xjd.ct.dal.dos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServiceModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceModelExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("VERSION like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("VERSION not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andNeedLoginFlagIsNull() {
            addCriterion("NEED_LOGIN_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andNeedLoginFlagIsNotNull() {
            addCriterion("NEED_LOGIN_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andNeedLoginFlagEqualTo(Byte value) {
            addCriterion("NEED_LOGIN_FLAG =", value, "needLoginFlag");
            return (Criteria) this;
        }

        public Criteria andNeedLoginFlagNotEqualTo(Byte value) {
            addCriterion("NEED_LOGIN_FLAG <>", value, "needLoginFlag");
            return (Criteria) this;
        }

        public Criteria andNeedLoginFlagGreaterThan(Byte value) {
            addCriterion("NEED_LOGIN_FLAG >", value, "needLoginFlag");
            return (Criteria) this;
        }

        public Criteria andNeedLoginFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("NEED_LOGIN_FLAG >=", value, "needLoginFlag");
            return (Criteria) this;
        }

        public Criteria andNeedLoginFlagLessThan(Byte value) {
            addCriterion("NEED_LOGIN_FLAG <", value, "needLoginFlag");
            return (Criteria) this;
        }

        public Criteria andNeedLoginFlagLessThanOrEqualTo(Byte value) {
            addCriterion("NEED_LOGIN_FLAG <=", value, "needLoginFlag");
            return (Criteria) this;
        }

        public Criteria andNeedLoginFlagIn(List<Byte> values) {
            addCriterion("NEED_LOGIN_FLAG in", values, "needLoginFlag");
            return (Criteria) this;
        }

        public Criteria andNeedLoginFlagNotIn(List<Byte> values) {
            addCriterion("NEED_LOGIN_FLAG not in", values, "needLoginFlag");
            return (Criteria) this;
        }

        public Criteria andNeedLoginFlagBetween(Byte value1, Byte value2) {
            addCriterion("NEED_LOGIN_FLAG between", value1, value2, "needLoginFlag");
            return (Criteria) this;
        }

        public Criteria andNeedLoginFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("NEED_LOGIN_FLAG not between", value1, value2, "needLoginFlag");
            return (Criteria) this;
        }

        public Criteria andInMaintainFlagIsNull() {
            addCriterion("IN_MAINTAIN_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andInMaintainFlagIsNotNull() {
            addCriterion("IN_MAINTAIN_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andInMaintainFlagEqualTo(Byte value) {
            addCriterion("IN_MAINTAIN_FLAG =", value, "inMaintainFlag");
            return (Criteria) this;
        }

        public Criteria andInMaintainFlagNotEqualTo(Byte value) {
            addCriterion("IN_MAINTAIN_FLAG <>", value, "inMaintainFlag");
            return (Criteria) this;
        }

        public Criteria andInMaintainFlagGreaterThan(Byte value) {
            addCriterion("IN_MAINTAIN_FLAG >", value, "inMaintainFlag");
            return (Criteria) this;
        }

        public Criteria andInMaintainFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("IN_MAINTAIN_FLAG >=", value, "inMaintainFlag");
            return (Criteria) this;
        }

        public Criteria andInMaintainFlagLessThan(Byte value) {
            addCriterion("IN_MAINTAIN_FLAG <", value, "inMaintainFlag");
            return (Criteria) this;
        }

        public Criteria andInMaintainFlagLessThanOrEqualTo(Byte value) {
            addCriterion("IN_MAINTAIN_FLAG <=", value, "inMaintainFlag");
            return (Criteria) this;
        }

        public Criteria andInMaintainFlagIn(List<Byte> values) {
            addCriterion("IN_MAINTAIN_FLAG in", values, "inMaintainFlag");
            return (Criteria) this;
        }

        public Criteria andInMaintainFlagNotIn(List<Byte> values) {
            addCriterion("IN_MAINTAIN_FLAG not in", values, "inMaintainFlag");
            return (Criteria) this;
        }

        public Criteria andInMaintainFlagBetween(Byte value1, Byte value2) {
            addCriterion("IN_MAINTAIN_FLAG between", value1, value2, "inMaintainFlag");
            return (Criteria) this;
        }

        public Criteria andInMaintainFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("IN_MAINTAIN_FLAG not between", value1, value2, "inMaintainFlag");
            return (Criteria) this;
        }

        public Criteria andMaintainMsgIsNull() {
            addCriterion("MAINTAIN_MSG is null");
            return (Criteria) this;
        }

        public Criteria andMaintainMsgIsNotNull() {
            addCriterion("MAINTAIN_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainMsgEqualTo(String value) {
            addCriterion("MAINTAIN_MSG =", value, "maintainMsg");
            return (Criteria) this;
        }

        public Criteria andMaintainMsgNotEqualTo(String value) {
            addCriterion("MAINTAIN_MSG <>", value, "maintainMsg");
            return (Criteria) this;
        }

        public Criteria andMaintainMsgGreaterThan(String value) {
            addCriterion("MAINTAIN_MSG >", value, "maintainMsg");
            return (Criteria) this;
        }

        public Criteria andMaintainMsgGreaterThanOrEqualTo(String value) {
            addCriterion("MAINTAIN_MSG >=", value, "maintainMsg");
            return (Criteria) this;
        }

        public Criteria andMaintainMsgLessThan(String value) {
            addCriterion("MAINTAIN_MSG <", value, "maintainMsg");
            return (Criteria) this;
        }

        public Criteria andMaintainMsgLessThanOrEqualTo(String value) {
            addCriterion("MAINTAIN_MSG <=", value, "maintainMsg");
            return (Criteria) this;
        }

        public Criteria andMaintainMsgLike(String value) {
            addCriterion("MAINTAIN_MSG like", value, "maintainMsg");
            return (Criteria) this;
        }

        public Criteria andMaintainMsgNotLike(String value) {
            addCriterion("MAINTAIN_MSG not like", value, "maintainMsg");
            return (Criteria) this;
        }

        public Criteria andMaintainMsgIn(List<String> values) {
            addCriterion("MAINTAIN_MSG in", values, "maintainMsg");
            return (Criteria) this;
        }

        public Criteria andMaintainMsgNotIn(List<String> values) {
            addCriterion("MAINTAIN_MSG not in", values, "maintainMsg");
            return (Criteria) this;
        }

        public Criteria andMaintainMsgBetween(String value1, String value2) {
            addCriterion("MAINTAIN_MSG between", value1, value2, "maintainMsg");
            return (Criteria) this;
        }

        public Criteria andMaintainMsgNotBetween(String value1, String value2) {
            addCriterion("MAINTAIN_MSG not between", value1, value2, "maintainMsg");
            return (Criteria) this;
        }

        public Criteria andValidFlagIsNull() {
            addCriterion("VALID_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andValidFlagIsNotNull() {
            addCriterion("VALID_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andValidFlagEqualTo(Byte value) {
            addCriterion("VALID_FLAG =", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagNotEqualTo(Byte value) {
            addCriterion("VALID_FLAG <>", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagGreaterThan(Byte value) {
            addCriterion("VALID_FLAG >", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("VALID_FLAG >=", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagLessThan(Byte value) {
            addCriterion("VALID_FLAG <", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagLessThanOrEqualTo(Byte value) {
            addCriterion("VALID_FLAG <=", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagIn(List<Byte> values) {
            addCriterion("VALID_FLAG in", values, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagNotIn(List<Byte> values) {
            addCriterion("VALID_FLAG not in", values, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagBetween(Byte value1, Byte value2) {
            addCriterion("VALID_FLAG between", value1, value2, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("VALID_FLAG not between", value1, value2, "validFlag");
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