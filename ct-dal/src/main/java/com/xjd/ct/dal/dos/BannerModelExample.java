package com.xjd.ct.dal.dos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BannerModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public BannerModelExample() {
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

        public Criteria andBannerIdIsNull() {
            addCriterion("BANNER_ID is null");
            return (Criteria) this;
        }

        public Criteria andBannerIdIsNotNull() {
            addCriterion("BANNER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBannerIdEqualTo(Long value) {
            addCriterion("BANNER_ID =", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdNotEqualTo(Long value) {
            addCriterion("BANNER_ID <>", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdGreaterThan(Long value) {
            addCriterion("BANNER_ID >", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BANNER_ID >=", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdLessThan(Long value) {
            addCriterion("BANNER_ID <", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdLessThanOrEqualTo(Long value) {
            addCriterion("BANNER_ID <=", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdIn(List<Long> values) {
            addCriterion("BANNER_ID in", values, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdNotIn(List<Long> values) {
            addCriterion("BANNER_ID not in", values, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdBetween(Long value1, Long value2) {
            addCriterion("BANNER_ID between", value1, value2, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdNotBetween(Long value1, Long value2) {
            addCriterion("BANNER_ID not between", value1, value2, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerResIsNull() {
            addCriterion("BANNER_RES is null");
            return (Criteria) this;
        }

        public Criteria andBannerResIsNotNull() {
            addCriterion("BANNER_RES is not null");
            return (Criteria) this;
        }

        public Criteria andBannerResEqualTo(String value) {
            addCriterion("BANNER_RES =", value, "bannerRes");
            return (Criteria) this;
        }

        public Criteria andBannerResNotEqualTo(String value) {
            addCriterion("BANNER_RES <>", value, "bannerRes");
            return (Criteria) this;
        }

        public Criteria andBannerResGreaterThan(String value) {
            addCriterion("BANNER_RES >", value, "bannerRes");
            return (Criteria) this;
        }

        public Criteria andBannerResGreaterThanOrEqualTo(String value) {
            addCriterion("BANNER_RES >=", value, "bannerRes");
            return (Criteria) this;
        }

        public Criteria andBannerResLessThan(String value) {
            addCriterion("BANNER_RES <", value, "bannerRes");
            return (Criteria) this;
        }

        public Criteria andBannerResLessThanOrEqualTo(String value) {
            addCriterion("BANNER_RES <=", value, "bannerRes");
            return (Criteria) this;
        }

        public Criteria andBannerResLike(String value) {
            addCriterion("BANNER_RES like", value, "bannerRes");
            return (Criteria) this;
        }

        public Criteria andBannerResNotLike(String value) {
            addCriterion("BANNER_RES not like", value, "bannerRes");
            return (Criteria) this;
        }

        public Criteria andBannerResIn(List<String> values) {
            addCriterion("BANNER_RES in", values, "bannerRes");
            return (Criteria) this;
        }

        public Criteria andBannerResNotIn(List<String> values) {
            addCriterion("BANNER_RES not in", values, "bannerRes");
            return (Criteria) this;
        }

        public Criteria andBannerResBetween(String value1, String value2) {
            addCriterion("BANNER_RES between", value1, value2, "bannerRes");
            return (Criteria) this;
        }

        public Criteria andBannerResNotBetween(String value1, String value2) {
            addCriterion("BANNER_RES not between", value1, value2, "bannerRes");
            return (Criteria) this;
        }

        public Criteria andBannerTypeIsNull() {
            addCriterion("BANNER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBannerTypeIsNotNull() {
            addCriterion("BANNER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBannerTypeEqualTo(Byte value) {
            addCriterion("BANNER_TYPE =", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeNotEqualTo(Byte value) {
            addCriterion("BANNER_TYPE <>", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeGreaterThan(Byte value) {
            addCriterion("BANNER_TYPE >", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("BANNER_TYPE >=", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeLessThan(Byte value) {
            addCriterion("BANNER_TYPE <", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeLessThanOrEqualTo(Byte value) {
            addCriterion("BANNER_TYPE <=", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeIn(List<Byte> values) {
            addCriterion("BANNER_TYPE in", values, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeNotIn(List<Byte> values) {
            addCriterion("BANNER_TYPE not in", values, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeBetween(Byte value1, Byte value2) {
            addCriterion("BANNER_TYPE between", value1, value2, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("BANNER_TYPE not between", value1, value2, "bannerType");
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

        public Criteria andObjectRefIdIsNull() {
            addCriterion("OBJECT_REF_ID is null");
            return (Criteria) this;
        }

        public Criteria andObjectRefIdIsNotNull() {
            addCriterion("OBJECT_REF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andObjectRefIdEqualTo(Long value) {
            addCriterion("OBJECT_REF_ID =", value, "objectRefId");
            return (Criteria) this;
        }

        public Criteria andObjectRefIdNotEqualTo(Long value) {
            addCriterion("OBJECT_REF_ID <>", value, "objectRefId");
            return (Criteria) this;
        }

        public Criteria andObjectRefIdGreaterThan(Long value) {
            addCriterion("OBJECT_REF_ID >", value, "objectRefId");
            return (Criteria) this;
        }

        public Criteria andObjectRefIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OBJECT_REF_ID >=", value, "objectRefId");
            return (Criteria) this;
        }

        public Criteria andObjectRefIdLessThan(Long value) {
            addCriterion("OBJECT_REF_ID <", value, "objectRefId");
            return (Criteria) this;
        }

        public Criteria andObjectRefIdLessThanOrEqualTo(Long value) {
            addCriterion("OBJECT_REF_ID <=", value, "objectRefId");
            return (Criteria) this;
        }

        public Criteria andObjectRefIdIn(List<Long> values) {
            addCriterion("OBJECT_REF_ID in", values, "objectRefId");
            return (Criteria) this;
        }

        public Criteria andObjectRefIdNotIn(List<Long> values) {
            addCriterion("OBJECT_REF_ID not in", values, "objectRefId");
            return (Criteria) this;
        }

        public Criteria andObjectRefIdBetween(Long value1, Long value2) {
            addCriterion("OBJECT_REF_ID between", value1, value2, "objectRefId");
            return (Criteria) this;
        }

        public Criteria andObjectRefIdNotBetween(Long value1, Long value2) {
            addCriterion("OBJECT_REF_ID not between", value1, value2, "objectRefId");
            return (Criteria) this;
        }

        public Criteria andBannerContentIsNull() {
            addCriterion("BANNER_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andBannerContentIsNotNull() {
            addCriterion("BANNER_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andBannerContentEqualTo(String value) {
            addCriterion("BANNER_CONTENT =", value, "bannerContent");
            return (Criteria) this;
        }

        public Criteria andBannerContentNotEqualTo(String value) {
            addCriterion("BANNER_CONTENT <>", value, "bannerContent");
            return (Criteria) this;
        }

        public Criteria andBannerContentGreaterThan(String value) {
            addCriterion("BANNER_CONTENT >", value, "bannerContent");
            return (Criteria) this;
        }

        public Criteria andBannerContentGreaterThanOrEqualTo(String value) {
            addCriterion("BANNER_CONTENT >=", value, "bannerContent");
            return (Criteria) this;
        }

        public Criteria andBannerContentLessThan(String value) {
            addCriterion("BANNER_CONTENT <", value, "bannerContent");
            return (Criteria) this;
        }

        public Criteria andBannerContentLessThanOrEqualTo(String value) {
            addCriterion("BANNER_CONTENT <=", value, "bannerContent");
            return (Criteria) this;
        }

        public Criteria andBannerContentLike(String value) {
            addCriterion("BANNER_CONTENT like", value, "bannerContent");
            return (Criteria) this;
        }

        public Criteria andBannerContentNotLike(String value) {
            addCriterion("BANNER_CONTENT not like", value, "bannerContent");
            return (Criteria) this;
        }

        public Criteria andBannerContentIn(List<String> values) {
            addCriterion("BANNER_CONTENT in", values, "bannerContent");
            return (Criteria) this;
        }

        public Criteria andBannerContentNotIn(List<String> values) {
            addCriterion("BANNER_CONTENT not in", values, "bannerContent");
            return (Criteria) this;
        }

        public Criteria andBannerContentBetween(String value1, String value2) {
            addCriterion("BANNER_CONTENT between", value1, value2, "bannerContent");
            return (Criteria) this;
        }

        public Criteria andBannerContentNotBetween(String value1, String value2) {
            addCriterion("BANNER_CONTENT not between", value1, value2, "bannerContent");
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