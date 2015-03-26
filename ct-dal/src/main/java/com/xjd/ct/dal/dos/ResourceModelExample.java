package com.xjd.ct.dal.dos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResourceModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public ResourceModelExample() {
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

        public Criteria andResIdIsNull() {
            addCriterion("RES_ID is null");
            return (Criteria) this;
        }

        public Criteria andResIdIsNotNull() {
            addCriterion("RES_ID is not null");
            return (Criteria) this;
        }

        public Criteria andResIdEqualTo(String value) {
            addCriterion("RES_ID =", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotEqualTo(String value) {
            addCriterion("RES_ID <>", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdGreaterThan(String value) {
            addCriterion("RES_ID >", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdGreaterThanOrEqualTo(String value) {
            addCriterion("RES_ID >=", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLessThan(String value) {
            addCriterion("RES_ID <", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLessThanOrEqualTo(String value) {
            addCriterion("RES_ID <=", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLike(String value) {
            addCriterion("RES_ID like", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotLike(String value) {
            addCriterion("RES_ID not like", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdIn(List<String> values) {
            addCriterion("RES_ID in", values, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotIn(List<String> values) {
            addCriterion("RES_ID not in", values, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdBetween(String value1, String value2) {
            addCriterion("RES_ID between", value1, value2, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotBetween(String value1, String value2) {
            addCriterion("RES_ID not between", value1, value2, "resId");
            return (Criteria) this;
        }

        public Criteria andResFormatIsNull() {
            addCriterion("RES_FORMAT is null");
            return (Criteria) this;
        }

        public Criteria andResFormatIsNotNull() {
            addCriterion("RES_FORMAT is not null");
            return (Criteria) this;
        }

        public Criteria andResFormatEqualTo(String value) {
            addCriterion("RES_FORMAT =", value, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatNotEqualTo(String value) {
            addCriterion("RES_FORMAT <>", value, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatGreaterThan(String value) {
            addCriterion("RES_FORMAT >", value, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatGreaterThanOrEqualTo(String value) {
            addCriterion("RES_FORMAT >=", value, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatLessThan(String value) {
            addCriterion("RES_FORMAT <", value, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatLessThanOrEqualTo(String value) {
            addCriterion("RES_FORMAT <=", value, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatLike(String value) {
            addCriterion("RES_FORMAT like", value, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatNotLike(String value) {
            addCriterion("RES_FORMAT not like", value, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatIn(List<String> values) {
            addCriterion("RES_FORMAT in", values, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatNotIn(List<String> values) {
            addCriterion("RES_FORMAT not in", values, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatBetween(String value1, String value2) {
            addCriterion("RES_FORMAT between", value1, value2, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatNotBetween(String value1, String value2) {
            addCriterion("RES_FORMAT not between", value1, value2, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormIsNull() {
            addCriterion("RES_FORM is null");
            return (Criteria) this;
        }

        public Criteria andResFormIsNotNull() {
            addCriterion("RES_FORM is not null");
            return (Criteria) this;
        }

        public Criteria andResFormEqualTo(Byte value) {
            addCriterion("RES_FORM =", value, "resForm");
            return (Criteria) this;
        }

        public Criteria andResFormNotEqualTo(Byte value) {
            addCriterion("RES_FORM <>", value, "resForm");
            return (Criteria) this;
        }

        public Criteria andResFormGreaterThan(Byte value) {
            addCriterion("RES_FORM >", value, "resForm");
            return (Criteria) this;
        }

        public Criteria andResFormGreaterThanOrEqualTo(Byte value) {
            addCriterion("RES_FORM >=", value, "resForm");
            return (Criteria) this;
        }

        public Criteria andResFormLessThan(Byte value) {
            addCriterion("RES_FORM <", value, "resForm");
            return (Criteria) this;
        }

        public Criteria andResFormLessThanOrEqualTo(Byte value) {
            addCriterion("RES_FORM <=", value, "resForm");
            return (Criteria) this;
        }

        public Criteria andResFormIn(List<Byte> values) {
            addCriterion("RES_FORM in", values, "resForm");
            return (Criteria) this;
        }

        public Criteria andResFormNotIn(List<Byte> values) {
            addCriterion("RES_FORM not in", values, "resForm");
            return (Criteria) this;
        }

        public Criteria andResFormBetween(Byte value1, Byte value2) {
            addCriterion("RES_FORM between", value1, value2, "resForm");
            return (Criteria) this;
        }

        public Criteria andResFormNotBetween(Byte value1, Byte value2) {
            addCriterion("RES_FORM not between", value1, value2, "resForm");
            return (Criteria) this;
        }

        public Criteria andResPathIsNull() {
            addCriterion("RES_PATH is null");
            return (Criteria) this;
        }

        public Criteria andResPathIsNotNull() {
            addCriterion("RES_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andResPathEqualTo(String value) {
            addCriterion("RES_PATH =", value, "resPath");
            return (Criteria) this;
        }

        public Criteria andResPathNotEqualTo(String value) {
            addCriterion("RES_PATH <>", value, "resPath");
            return (Criteria) this;
        }

        public Criteria andResPathGreaterThan(String value) {
            addCriterion("RES_PATH >", value, "resPath");
            return (Criteria) this;
        }

        public Criteria andResPathGreaterThanOrEqualTo(String value) {
            addCriterion("RES_PATH >=", value, "resPath");
            return (Criteria) this;
        }

        public Criteria andResPathLessThan(String value) {
            addCriterion("RES_PATH <", value, "resPath");
            return (Criteria) this;
        }

        public Criteria andResPathLessThanOrEqualTo(String value) {
            addCriterion("RES_PATH <=", value, "resPath");
            return (Criteria) this;
        }

        public Criteria andResPathLike(String value) {
            addCriterion("RES_PATH like", value, "resPath");
            return (Criteria) this;
        }

        public Criteria andResPathNotLike(String value) {
            addCriterion("RES_PATH not like", value, "resPath");
            return (Criteria) this;
        }

        public Criteria andResPathIn(List<String> values) {
            addCriterion("RES_PATH in", values, "resPath");
            return (Criteria) this;
        }

        public Criteria andResPathNotIn(List<String> values) {
            addCriterion("RES_PATH not in", values, "resPath");
            return (Criteria) this;
        }

        public Criteria andResPathBetween(String value1, String value2) {
            addCriterion("RES_PATH between", value1, value2, "resPath");
            return (Criteria) this;
        }

        public Criteria andResPathNotBetween(String value1, String value2) {
            addCriterion("RES_PATH not between", value1, value2, "resPath");
            return (Criteria) this;
        }

        public Criteria andResMd5IsNull() {
            addCriterion("RES_MD5 is null");
            return (Criteria) this;
        }

        public Criteria andResMd5IsNotNull() {
            addCriterion("RES_MD5 is not null");
            return (Criteria) this;
        }

        public Criteria andResMd5EqualTo(String value) {
            addCriterion("RES_MD5 =", value, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5NotEqualTo(String value) {
            addCriterion("RES_MD5 <>", value, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5GreaterThan(String value) {
            addCriterion("RES_MD5 >", value, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5GreaterThanOrEqualTo(String value) {
            addCriterion("RES_MD5 >=", value, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5LessThan(String value) {
            addCriterion("RES_MD5 <", value, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5LessThanOrEqualTo(String value) {
            addCriterion("RES_MD5 <=", value, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5Like(String value) {
            addCriterion("RES_MD5 like", value, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5NotLike(String value) {
            addCriterion("RES_MD5 not like", value, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5In(List<String> values) {
            addCriterion("RES_MD5 in", values, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5NotIn(List<String> values) {
            addCriterion("RES_MD5 not in", values, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5Between(String value1, String value2) {
            addCriterion("RES_MD5 between", value1, value2, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5NotBetween(String value1, String value2) {
            addCriterion("RES_MD5 not between", value1, value2, "resMd5");
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