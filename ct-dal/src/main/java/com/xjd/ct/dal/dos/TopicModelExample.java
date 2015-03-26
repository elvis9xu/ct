package com.xjd.ct.dal.dos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TopicModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public TopicModelExample() {
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

        public Criteria andTopicIdIsNull() {
            addCriterion("TOPIC_ID is null");
            return (Criteria) this;
        }

        public Criteria andTopicIdIsNotNull() {
            addCriterion("TOPIC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTopicIdEqualTo(Long value) {
            addCriterion("TOPIC_ID =", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotEqualTo(Long value) {
            addCriterion("TOPIC_ID <>", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThan(Long value) {
            addCriterion("TOPIC_ID >", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TOPIC_ID >=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThan(Long value) {
            addCriterion("TOPIC_ID <", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThanOrEqualTo(Long value) {
            addCriterion("TOPIC_ID <=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdIn(List<Long> values) {
            addCriterion("TOPIC_ID in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotIn(List<Long> values) {
            addCriterion("TOPIC_ID not in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdBetween(Long value1, Long value2) {
            addCriterion("TOPIC_ID between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotBetween(Long value1, Long value2) {
            addCriterion("TOPIC_ID not between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicTitleIsNull() {
            addCriterion("TOPIC_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTopicTitleIsNotNull() {
            addCriterion("TOPIC_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTopicTitleEqualTo(String value) {
            addCriterion("TOPIC_TITLE =", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleNotEqualTo(String value) {
            addCriterion("TOPIC_TITLE <>", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleGreaterThan(String value) {
            addCriterion("TOPIC_TITLE >", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TOPIC_TITLE >=", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleLessThan(String value) {
            addCriterion("TOPIC_TITLE <", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleLessThanOrEqualTo(String value) {
            addCriterion("TOPIC_TITLE <=", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleLike(String value) {
            addCriterion("TOPIC_TITLE like", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleNotLike(String value) {
            addCriterion("TOPIC_TITLE not like", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleIn(List<String> values) {
            addCriterion("TOPIC_TITLE in", values, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleNotIn(List<String> values) {
            addCriterion("TOPIC_TITLE not in", values, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleBetween(String value1, String value2) {
            addCriterion("TOPIC_TITLE between", value1, value2, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleNotBetween(String value1, String value2) {
            addCriterion("TOPIC_TITLE not between", value1, value2, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicImgResIsNull() {
            addCriterion("TOPIC_IMG_RES is null");
            return (Criteria) this;
        }

        public Criteria andTopicImgResIsNotNull() {
            addCriterion("TOPIC_IMG_RES is not null");
            return (Criteria) this;
        }

        public Criteria andTopicImgResEqualTo(String value) {
            addCriterion("TOPIC_IMG_RES =", value, "topicImgRes");
            return (Criteria) this;
        }

        public Criteria andTopicImgResNotEqualTo(String value) {
            addCriterion("TOPIC_IMG_RES <>", value, "topicImgRes");
            return (Criteria) this;
        }

        public Criteria andTopicImgResGreaterThan(String value) {
            addCriterion("TOPIC_IMG_RES >", value, "topicImgRes");
            return (Criteria) this;
        }

        public Criteria andTopicImgResGreaterThanOrEqualTo(String value) {
            addCriterion("TOPIC_IMG_RES >=", value, "topicImgRes");
            return (Criteria) this;
        }

        public Criteria andTopicImgResLessThan(String value) {
            addCriterion("TOPIC_IMG_RES <", value, "topicImgRes");
            return (Criteria) this;
        }

        public Criteria andTopicImgResLessThanOrEqualTo(String value) {
            addCriterion("TOPIC_IMG_RES <=", value, "topicImgRes");
            return (Criteria) this;
        }

        public Criteria andTopicImgResLike(String value) {
            addCriterion("TOPIC_IMG_RES like", value, "topicImgRes");
            return (Criteria) this;
        }

        public Criteria andTopicImgResNotLike(String value) {
            addCriterion("TOPIC_IMG_RES not like", value, "topicImgRes");
            return (Criteria) this;
        }

        public Criteria andTopicImgResIn(List<String> values) {
            addCriterion("TOPIC_IMG_RES in", values, "topicImgRes");
            return (Criteria) this;
        }

        public Criteria andTopicImgResNotIn(List<String> values) {
            addCriterion("TOPIC_IMG_RES not in", values, "topicImgRes");
            return (Criteria) this;
        }

        public Criteria andTopicImgResBetween(String value1, String value2) {
            addCriterion("TOPIC_IMG_RES between", value1, value2, "topicImgRes");
            return (Criteria) this;
        }

        public Criteria andTopicImgResNotBetween(String value1, String value2) {
            addCriterion("TOPIC_IMG_RES not between", value1, value2, "topicImgRes");
            return (Criteria) this;
        }

        public Criteria andTopicDescIsNull() {
            addCriterion("TOPIC_DESC is null");
            return (Criteria) this;
        }

        public Criteria andTopicDescIsNotNull() {
            addCriterion("TOPIC_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andTopicDescEqualTo(String value) {
            addCriterion("TOPIC_DESC =", value, "topicDesc");
            return (Criteria) this;
        }

        public Criteria andTopicDescNotEqualTo(String value) {
            addCriterion("TOPIC_DESC <>", value, "topicDesc");
            return (Criteria) this;
        }

        public Criteria andTopicDescGreaterThan(String value) {
            addCriterion("TOPIC_DESC >", value, "topicDesc");
            return (Criteria) this;
        }

        public Criteria andTopicDescGreaterThanOrEqualTo(String value) {
            addCriterion("TOPIC_DESC >=", value, "topicDesc");
            return (Criteria) this;
        }

        public Criteria andTopicDescLessThan(String value) {
            addCriterion("TOPIC_DESC <", value, "topicDesc");
            return (Criteria) this;
        }

        public Criteria andTopicDescLessThanOrEqualTo(String value) {
            addCriterion("TOPIC_DESC <=", value, "topicDesc");
            return (Criteria) this;
        }

        public Criteria andTopicDescLike(String value) {
            addCriterion("TOPIC_DESC like", value, "topicDesc");
            return (Criteria) this;
        }

        public Criteria andTopicDescNotLike(String value) {
            addCriterion("TOPIC_DESC not like", value, "topicDesc");
            return (Criteria) this;
        }

        public Criteria andTopicDescIn(List<String> values) {
            addCriterion("TOPIC_DESC in", values, "topicDesc");
            return (Criteria) this;
        }

        public Criteria andTopicDescNotIn(List<String> values) {
            addCriterion("TOPIC_DESC not in", values, "topicDesc");
            return (Criteria) this;
        }

        public Criteria andTopicDescBetween(String value1, String value2) {
            addCriterion("TOPIC_DESC between", value1, value2, "topicDesc");
            return (Criteria) this;
        }

        public Criteria andTopicDescNotBetween(String value1, String value2) {
            addCriterion("TOPIC_DESC not between", value1, value2, "topicDesc");
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