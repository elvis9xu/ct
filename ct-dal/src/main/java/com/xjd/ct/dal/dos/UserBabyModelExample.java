package com.xjd.ct.dal.dos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserBabyModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserBabyModelExample() {
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

        public Criteria andBabyIdIsNull() {
            addCriterion("BABY_ID is null");
            return (Criteria) this;
        }

        public Criteria andBabyIdIsNotNull() {
            addCriterion("BABY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBabyIdEqualTo(Long value) {
            addCriterion("BABY_ID =", value, "babyId");
            return (Criteria) this;
        }

        public Criteria andBabyIdNotEqualTo(Long value) {
            addCriterion("BABY_ID <>", value, "babyId");
            return (Criteria) this;
        }

        public Criteria andBabyIdGreaterThan(Long value) {
            addCriterion("BABY_ID >", value, "babyId");
            return (Criteria) this;
        }

        public Criteria andBabyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BABY_ID >=", value, "babyId");
            return (Criteria) this;
        }

        public Criteria andBabyIdLessThan(Long value) {
            addCriterion("BABY_ID <", value, "babyId");
            return (Criteria) this;
        }

        public Criteria andBabyIdLessThanOrEqualTo(Long value) {
            addCriterion("BABY_ID <=", value, "babyId");
            return (Criteria) this;
        }

        public Criteria andBabyIdIn(List<Long> values) {
            addCriterion("BABY_ID in", values, "babyId");
            return (Criteria) this;
        }

        public Criteria andBabyIdNotIn(List<Long> values) {
            addCriterion("BABY_ID not in", values, "babyId");
            return (Criteria) this;
        }

        public Criteria andBabyIdBetween(Long value1, Long value2) {
            addCriterion("BABY_ID between", value1, value2, "babyId");
            return (Criteria) this;
        }

        public Criteria andBabyIdNotBetween(Long value1, Long value2) {
            addCriterion("BABY_ID not between", value1, value2, "babyId");
            return (Criteria) this;
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

        public Criteria andBabyNicknameIsNull() {
            addCriterion("BABY_NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andBabyNicknameIsNotNull() {
            addCriterion("BABY_NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBabyNicknameEqualTo(String value) {
            addCriterion("BABY_NICKNAME =", value, "babyNickname");
            return (Criteria) this;
        }

        public Criteria andBabyNicknameNotEqualTo(String value) {
            addCriterion("BABY_NICKNAME <>", value, "babyNickname");
            return (Criteria) this;
        }

        public Criteria andBabyNicknameGreaterThan(String value) {
            addCriterion("BABY_NICKNAME >", value, "babyNickname");
            return (Criteria) this;
        }

        public Criteria andBabyNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("BABY_NICKNAME >=", value, "babyNickname");
            return (Criteria) this;
        }

        public Criteria andBabyNicknameLessThan(String value) {
            addCriterion("BABY_NICKNAME <", value, "babyNickname");
            return (Criteria) this;
        }

        public Criteria andBabyNicknameLessThanOrEqualTo(String value) {
            addCriterion("BABY_NICKNAME <=", value, "babyNickname");
            return (Criteria) this;
        }

        public Criteria andBabyNicknameLike(String value) {
            addCriterion("BABY_NICKNAME like", value, "babyNickname");
            return (Criteria) this;
        }

        public Criteria andBabyNicknameNotLike(String value) {
            addCriterion("BABY_NICKNAME not like", value, "babyNickname");
            return (Criteria) this;
        }

        public Criteria andBabyNicknameIn(List<String> values) {
            addCriterion("BABY_NICKNAME in", values, "babyNickname");
            return (Criteria) this;
        }

        public Criteria andBabyNicknameNotIn(List<String> values) {
            addCriterion("BABY_NICKNAME not in", values, "babyNickname");
            return (Criteria) this;
        }

        public Criteria andBabyNicknameBetween(String value1, String value2) {
            addCriterion("BABY_NICKNAME between", value1, value2, "babyNickname");
            return (Criteria) this;
        }

        public Criteria andBabyNicknameNotBetween(String value1, String value2) {
            addCriterion("BABY_NICKNAME not between", value1, value2, "babyNickname");
            return (Criteria) this;
        }

        public Criteria andBabySexIsNull() {
            addCriterion("BABY_SEX is null");
            return (Criteria) this;
        }

        public Criteria andBabySexIsNotNull() {
            addCriterion("BABY_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andBabySexEqualTo(Byte value) {
            addCriterion("BABY_SEX =", value, "babySex");
            return (Criteria) this;
        }

        public Criteria andBabySexNotEqualTo(Byte value) {
            addCriterion("BABY_SEX <>", value, "babySex");
            return (Criteria) this;
        }

        public Criteria andBabySexGreaterThan(Byte value) {
            addCriterion("BABY_SEX >", value, "babySex");
            return (Criteria) this;
        }

        public Criteria andBabySexGreaterThanOrEqualTo(Byte value) {
            addCriterion("BABY_SEX >=", value, "babySex");
            return (Criteria) this;
        }

        public Criteria andBabySexLessThan(Byte value) {
            addCriterion("BABY_SEX <", value, "babySex");
            return (Criteria) this;
        }

        public Criteria andBabySexLessThanOrEqualTo(Byte value) {
            addCriterion("BABY_SEX <=", value, "babySex");
            return (Criteria) this;
        }

        public Criteria andBabySexIn(List<Byte> values) {
            addCriterion("BABY_SEX in", values, "babySex");
            return (Criteria) this;
        }

        public Criteria andBabySexNotIn(List<Byte> values) {
            addCriterion("BABY_SEX not in", values, "babySex");
            return (Criteria) this;
        }

        public Criteria andBabySexBetween(Byte value1, Byte value2) {
            addCriterion("BABY_SEX between", value1, value2, "babySex");
            return (Criteria) this;
        }

        public Criteria andBabySexNotBetween(Byte value1, Byte value2) {
            addCriterion("BABY_SEX not between", value1, value2, "babySex");
            return (Criteria) this;
        }

        public Criteria andBabyBirthIsNull() {
            addCriterion("BABY_BIRTH is null");
            return (Criteria) this;
        }

        public Criteria andBabyBirthIsNotNull() {
            addCriterion("BABY_BIRTH is not null");
            return (Criteria) this;
        }

        public Criteria andBabyBirthEqualTo(Date value) {
            addCriterion("BABY_BIRTH =", value, "babyBirth");
            return (Criteria) this;
        }

        public Criteria andBabyBirthNotEqualTo(Date value) {
            addCriterion("BABY_BIRTH <>", value, "babyBirth");
            return (Criteria) this;
        }

        public Criteria andBabyBirthGreaterThan(Date value) {
            addCriterion("BABY_BIRTH >", value, "babyBirth");
            return (Criteria) this;
        }

        public Criteria andBabyBirthGreaterThanOrEqualTo(Date value) {
            addCriterion("BABY_BIRTH >=", value, "babyBirth");
            return (Criteria) this;
        }

        public Criteria andBabyBirthLessThan(Date value) {
            addCriterion("BABY_BIRTH <", value, "babyBirth");
            return (Criteria) this;
        }

        public Criteria andBabyBirthLessThanOrEqualTo(Date value) {
            addCriterion("BABY_BIRTH <=", value, "babyBirth");
            return (Criteria) this;
        }

        public Criteria andBabyBirthIn(List<Date> values) {
            addCriterion("BABY_BIRTH in", values, "babyBirth");
            return (Criteria) this;
        }

        public Criteria andBabyBirthNotIn(List<Date> values) {
            addCriterion("BABY_BIRTH not in", values, "babyBirth");
            return (Criteria) this;
        }

        public Criteria andBabyBirthBetween(Date value1, Date value2) {
            addCriterion("BABY_BIRTH between", value1, value2, "babyBirth");
            return (Criteria) this;
        }

        public Criteria andBabyBirthNotBetween(Date value1, Date value2) {
            addCriterion("BABY_BIRTH not between", value1, value2, "babyBirth");
            return (Criteria) this;
        }

        public Criteria andBabyRealnameIsNull() {
            addCriterion("BABY_REALNAME is null");
            return (Criteria) this;
        }

        public Criteria andBabyRealnameIsNotNull() {
            addCriterion("BABY_REALNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBabyRealnameEqualTo(String value) {
            addCriterion("BABY_REALNAME =", value, "babyRealname");
            return (Criteria) this;
        }

        public Criteria andBabyRealnameNotEqualTo(String value) {
            addCriterion("BABY_REALNAME <>", value, "babyRealname");
            return (Criteria) this;
        }

        public Criteria andBabyRealnameGreaterThan(String value) {
            addCriterion("BABY_REALNAME >", value, "babyRealname");
            return (Criteria) this;
        }

        public Criteria andBabyRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("BABY_REALNAME >=", value, "babyRealname");
            return (Criteria) this;
        }

        public Criteria andBabyRealnameLessThan(String value) {
            addCriterion("BABY_REALNAME <", value, "babyRealname");
            return (Criteria) this;
        }

        public Criteria andBabyRealnameLessThanOrEqualTo(String value) {
            addCriterion("BABY_REALNAME <=", value, "babyRealname");
            return (Criteria) this;
        }

        public Criteria andBabyRealnameLike(String value) {
            addCriterion("BABY_REALNAME like", value, "babyRealname");
            return (Criteria) this;
        }

        public Criteria andBabyRealnameNotLike(String value) {
            addCriterion("BABY_REALNAME not like", value, "babyRealname");
            return (Criteria) this;
        }

        public Criteria andBabyRealnameIn(List<String> values) {
            addCriterion("BABY_REALNAME in", values, "babyRealname");
            return (Criteria) this;
        }

        public Criteria andBabyRealnameNotIn(List<String> values) {
            addCriterion("BABY_REALNAME not in", values, "babyRealname");
            return (Criteria) this;
        }

        public Criteria andBabyRealnameBetween(String value1, String value2) {
            addCriterion("BABY_REALNAME between", value1, value2, "babyRealname");
            return (Criteria) this;
        }

        public Criteria andBabyRealnameNotBetween(String value1, String value2) {
            addCriterion("BABY_REALNAME not between", value1, value2, "babyRealname");
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