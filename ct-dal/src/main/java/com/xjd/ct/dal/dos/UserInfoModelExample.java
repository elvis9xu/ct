package com.xjd.ct.dal.dos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfoModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public UserInfoModelExample() {
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

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public void setOffsetAndLimit(long offset, int limit) {
        Page page = new Page();
        page.setOffset(offset);
        page.setLimit(limit);
        this.setPage(page);
    }

    public void setBeginAndEnd(long begin, long end) {
        Page page = new Page();
        page.setOffset(begin);
        page.setEnd(end);
        this.setPage(page);
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

        public Criteria andUserTypeIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Byte value) {
            addCriterion("USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Byte value) {
            addCriterion("USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Byte value) {
            addCriterion("USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Byte value) {
            addCriterion("USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Byte value) {
            addCriterion("USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Byte> values) {
            addCriterion("USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Byte> values) {
            addCriterion("USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Byte value1, Byte value2) {
            addCriterion("USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("USER_TYPE not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andGradeExpIsNull() {
            addCriterion("GRADE_EXP is null");
            return (Criteria) this;
        }

        public Criteria andGradeExpIsNotNull() {
            addCriterion("GRADE_EXP is not null");
            return (Criteria) this;
        }

        public Criteria andGradeExpEqualTo(Integer value) {
            addCriterion("GRADE_EXP =", value, "gradeExp");
            return (Criteria) this;
        }

        public Criteria andGradeExpNotEqualTo(Integer value) {
            addCriterion("GRADE_EXP <>", value, "gradeExp");
            return (Criteria) this;
        }

        public Criteria andGradeExpGreaterThan(Integer value) {
            addCriterion("GRADE_EXP >", value, "gradeExp");
            return (Criteria) this;
        }

        public Criteria andGradeExpGreaterThanOrEqualTo(Integer value) {
            addCriterion("GRADE_EXP >=", value, "gradeExp");
            return (Criteria) this;
        }

        public Criteria andGradeExpLessThan(Integer value) {
            addCriterion("GRADE_EXP <", value, "gradeExp");
            return (Criteria) this;
        }

        public Criteria andGradeExpLessThanOrEqualTo(Integer value) {
            addCriterion("GRADE_EXP <=", value, "gradeExp");
            return (Criteria) this;
        }

        public Criteria andGradeExpIn(List<Integer> values) {
            addCriterion("GRADE_EXP in", values, "gradeExp");
            return (Criteria) this;
        }

        public Criteria andGradeExpNotIn(List<Integer> values) {
            addCriterion("GRADE_EXP not in", values, "gradeExp");
            return (Criteria) this;
        }

        public Criteria andGradeExpBetween(Integer value1, Integer value2) {
            addCriterion("GRADE_EXP between", value1, value2, "gradeExp");
            return (Criteria) this;
        }

        public Criteria andGradeExpNotBetween(Integer value1, Integer value2) {
            addCriterion("GRADE_EXP not between", value1, value2, "gradeExp");
            return (Criteria) this;
        }

        public Criteria andGradeLevelIsNull() {
            addCriterion("GRADE_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andGradeLevelIsNotNull() {
            addCriterion("GRADE_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andGradeLevelEqualTo(Byte value) {
            addCriterion("GRADE_LEVEL =", value, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelNotEqualTo(Byte value) {
            addCriterion("GRADE_LEVEL <>", value, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelGreaterThan(Byte value) {
            addCriterion("GRADE_LEVEL >", value, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("GRADE_LEVEL >=", value, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelLessThan(Byte value) {
            addCriterion("GRADE_LEVEL <", value, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelLessThanOrEqualTo(Byte value) {
            addCriterion("GRADE_LEVEL <=", value, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelIn(List<Byte> values) {
            addCriterion("GRADE_LEVEL in", values, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelNotIn(List<Byte> values) {
            addCriterion("GRADE_LEVEL not in", values, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelBetween(Byte value1, Byte value2) {
            addCriterion("GRADE_LEVEL between", value1, value2, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("GRADE_LEVEL not between", value1, value2, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andPointIsNull() {
            addCriterion("POINT is null");
            return (Criteria) this;
        }

        public Criteria andPointIsNotNull() {
            addCriterion("POINT is not null");
            return (Criteria) this;
        }

        public Criteria andPointEqualTo(Integer value) {
            addCriterion("POINT =", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotEqualTo(Integer value) {
            addCriterion("POINT <>", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThan(Integer value) {
            addCriterion("POINT >", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("POINT >=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThan(Integer value) {
            addCriterion("POINT <", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThanOrEqualTo(Integer value) {
            addCriterion("POINT <=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointIn(List<Integer> values) {
            addCriterion("POINT in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotIn(List<Integer> values) {
            addCriterion("POINT not in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointBetween(Integer value1, Integer value2) {
            addCriterion("POINT between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotBetween(Integer value1, Integer value2) {
            addCriterion("POINT not between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("NICKNAME =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("NICKNAME <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("NICKNAME >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("NICKNAME >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("NICKNAME <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("NICKNAME <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("NICKNAME like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("NICKNAME not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("NICKNAME in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("NICKNAME not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("NICKNAME between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("NICKNAME not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Byte value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Byte value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Byte value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Byte value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Byte value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Byte> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Byte> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Byte value1, Byte value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Byte value1, Byte value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthIsNull() {
            addCriterion("BIRTH is null");
            return (Criteria) this;
        }

        public Criteria andBirthIsNotNull() {
            addCriterion("BIRTH is not null");
            return (Criteria) this;
        }

        public Criteria andBirthEqualTo(Date value) {
            addCriterion("BIRTH =", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotEqualTo(Date value) {
            addCriterion("BIRTH <>", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThan(Date value) {
            addCriterion("BIRTH >", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThanOrEqualTo(Date value) {
            addCriterion("BIRTH >=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThan(Date value) {
            addCriterion("BIRTH <", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThanOrEqualTo(Date value) {
            addCriterion("BIRTH <=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthIn(List<Date> values) {
            addCriterion("BIRTH in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotIn(List<Date> values) {
            addCriterion("BIRTH not in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthBetween(Date value1, Date value2) {
            addCriterion("BIRTH between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotBetween(Date value1, Date value2) {
            addCriterion("BIRTH not between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andMoodWordsIsNull() {
            addCriterion("MOOD_WORDS is null");
            return (Criteria) this;
        }

        public Criteria andMoodWordsIsNotNull() {
            addCriterion("MOOD_WORDS is not null");
            return (Criteria) this;
        }

        public Criteria andMoodWordsEqualTo(String value) {
            addCriterion("MOOD_WORDS =", value, "moodWords");
            return (Criteria) this;
        }

        public Criteria andMoodWordsNotEqualTo(String value) {
            addCriterion("MOOD_WORDS <>", value, "moodWords");
            return (Criteria) this;
        }

        public Criteria andMoodWordsGreaterThan(String value) {
            addCriterion("MOOD_WORDS >", value, "moodWords");
            return (Criteria) this;
        }

        public Criteria andMoodWordsGreaterThanOrEqualTo(String value) {
            addCriterion("MOOD_WORDS >=", value, "moodWords");
            return (Criteria) this;
        }

        public Criteria andMoodWordsLessThan(String value) {
            addCriterion("MOOD_WORDS <", value, "moodWords");
            return (Criteria) this;
        }

        public Criteria andMoodWordsLessThanOrEqualTo(String value) {
            addCriterion("MOOD_WORDS <=", value, "moodWords");
            return (Criteria) this;
        }

        public Criteria andMoodWordsLike(String value) {
            addCriterion("MOOD_WORDS like", value, "moodWords");
            return (Criteria) this;
        }

        public Criteria andMoodWordsNotLike(String value) {
            addCriterion("MOOD_WORDS not like", value, "moodWords");
            return (Criteria) this;
        }

        public Criteria andMoodWordsIn(List<String> values) {
            addCriterion("MOOD_WORDS in", values, "moodWords");
            return (Criteria) this;
        }

        public Criteria andMoodWordsNotIn(List<String> values) {
            addCriterion("MOOD_WORDS not in", values, "moodWords");
            return (Criteria) this;
        }

        public Criteria andMoodWordsBetween(String value1, String value2) {
            addCriterion("MOOD_WORDS between", value1, value2, "moodWords");
            return (Criteria) this;
        }

        public Criteria andMoodWordsNotBetween(String value1, String value2) {
            addCriterion("MOOD_WORDS not between", value1, value2, "moodWords");
            return (Criteria) this;
        }

        public Criteria andMoodWordsTimeIsNull() {
            addCriterion("MOOD_WORDS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andMoodWordsTimeIsNotNull() {
            addCriterion("MOOD_WORDS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andMoodWordsTimeEqualTo(Date value) {
            addCriterion("MOOD_WORDS_TIME =", value, "moodWordsTime");
            return (Criteria) this;
        }

        public Criteria andMoodWordsTimeNotEqualTo(Date value) {
            addCriterion("MOOD_WORDS_TIME <>", value, "moodWordsTime");
            return (Criteria) this;
        }

        public Criteria andMoodWordsTimeGreaterThan(Date value) {
            addCriterion("MOOD_WORDS_TIME >", value, "moodWordsTime");
            return (Criteria) this;
        }

        public Criteria andMoodWordsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MOOD_WORDS_TIME >=", value, "moodWordsTime");
            return (Criteria) this;
        }

        public Criteria andMoodWordsTimeLessThan(Date value) {
            addCriterion("MOOD_WORDS_TIME <", value, "moodWordsTime");
            return (Criteria) this;
        }

        public Criteria andMoodWordsTimeLessThanOrEqualTo(Date value) {
            addCriterion("MOOD_WORDS_TIME <=", value, "moodWordsTime");
            return (Criteria) this;
        }

        public Criteria andMoodWordsTimeIn(List<Date> values) {
            addCriterion("MOOD_WORDS_TIME in", values, "moodWordsTime");
            return (Criteria) this;
        }

        public Criteria andMoodWordsTimeNotIn(List<Date> values) {
            addCriterion("MOOD_WORDS_TIME not in", values, "moodWordsTime");
            return (Criteria) this;
        }

        public Criteria andMoodWordsTimeBetween(Date value1, Date value2) {
            addCriterion("MOOD_WORDS_TIME between", value1, value2, "moodWordsTime");
            return (Criteria) this;
        }

        public Criteria andMoodWordsTimeNotBetween(Date value1, Date value2) {
            addCriterion("MOOD_WORDS_TIME not between", value1, value2, "moodWordsTime");
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

    public static class Page {
        protected long offset;

        protected int limit;

        protected long end;

        public long getOffset() {
            return offset;
        }

        public int getLimit() {
            return limit;
        }

        public long getEnd() {
            return end;
        }

        public void setOffset(long offset) {
            this.offset = offset;
            end = (offset + limit - 1);
        }

        public void setLimit(int limit) {
            this.limit = limit;
            end = (offset + limit - 1);
        }

        public void setEnd(long end) {
            this.end = end;
            limit = (int) (end - offset + 1);
        }
    }
}