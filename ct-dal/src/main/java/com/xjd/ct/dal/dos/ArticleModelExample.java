package com.xjd.ct.dal.dos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public ArticleModelExample() {
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

        public Criteria andArticleIdIsNull() {
            addCriterion("ARTICLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("ARTICLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(Long value) {
            addCriterion("ARTICLE_ID =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(Long value) {
            addCriterion("ARTICLE_ID <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(Long value) {
            addCriterion("ARTICLE_ID >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ARTICLE_ID >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(Long value) {
            addCriterion("ARTICLE_ID <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(Long value) {
            addCriterion("ARTICLE_ID <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<Long> values) {
            addCriterion("ARTICLE_ID in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<Long> values) {
            addCriterion("ARTICLE_ID not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(Long value1, Long value2) {
            addCriterion("ARTICLE_ID between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(Long value1, Long value2) {
            addCriterion("ARTICLE_ID not between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNull() {
            addCriterion("ARTICLE_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNotNull() {
            addCriterion("ARTICLE_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleEqualTo(String value) {
            addCriterion("ARTICLE_TITLE =", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotEqualTo(String value) {
            addCriterion("ARTICLE_TITLE <>", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThan(String value) {
            addCriterion("ARTICLE_TITLE >", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThanOrEqualTo(String value) {
            addCriterion("ARTICLE_TITLE >=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThan(String value) {
            addCriterion("ARTICLE_TITLE <", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThanOrEqualTo(String value) {
            addCriterion("ARTICLE_TITLE <=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLike(String value) {
            addCriterion("ARTICLE_TITLE like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotLike(String value) {
            addCriterion("ARTICLE_TITLE not like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIn(List<String> values) {
            addCriterion("ARTICLE_TITLE in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotIn(List<String> values) {
            addCriterion("ARTICLE_TITLE not in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleBetween(String value1, String value2) {
            addCriterion("ARTICLE_TITLE between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotBetween(String value1, String value2) {
            addCriterion("ARTICLE_TITLE not between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleImgResIsNull() {
            addCriterion("ARTICLE_IMG_RES is null");
            return (Criteria) this;
        }

        public Criteria andArticleImgResIsNotNull() {
            addCriterion("ARTICLE_IMG_RES is not null");
            return (Criteria) this;
        }

        public Criteria andArticleImgResEqualTo(String value) {
            addCriterion("ARTICLE_IMG_RES =", value, "articleImgRes");
            return (Criteria) this;
        }

        public Criteria andArticleImgResNotEqualTo(String value) {
            addCriterion("ARTICLE_IMG_RES <>", value, "articleImgRes");
            return (Criteria) this;
        }

        public Criteria andArticleImgResGreaterThan(String value) {
            addCriterion("ARTICLE_IMG_RES >", value, "articleImgRes");
            return (Criteria) this;
        }

        public Criteria andArticleImgResGreaterThanOrEqualTo(String value) {
            addCriterion("ARTICLE_IMG_RES >=", value, "articleImgRes");
            return (Criteria) this;
        }

        public Criteria andArticleImgResLessThan(String value) {
            addCriterion("ARTICLE_IMG_RES <", value, "articleImgRes");
            return (Criteria) this;
        }

        public Criteria andArticleImgResLessThanOrEqualTo(String value) {
            addCriterion("ARTICLE_IMG_RES <=", value, "articleImgRes");
            return (Criteria) this;
        }

        public Criteria andArticleImgResLike(String value) {
            addCriterion("ARTICLE_IMG_RES like", value, "articleImgRes");
            return (Criteria) this;
        }

        public Criteria andArticleImgResNotLike(String value) {
            addCriterion("ARTICLE_IMG_RES not like", value, "articleImgRes");
            return (Criteria) this;
        }

        public Criteria andArticleImgResIn(List<String> values) {
            addCriterion("ARTICLE_IMG_RES in", values, "articleImgRes");
            return (Criteria) this;
        }

        public Criteria andArticleImgResNotIn(List<String> values) {
            addCriterion("ARTICLE_IMG_RES not in", values, "articleImgRes");
            return (Criteria) this;
        }

        public Criteria andArticleImgResBetween(String value1, String value2) {
            addCriterion("ARTICLE_IMG_RES between", value1, value2, "articleImgRes");
            return (Criteria) this;
        }

        public Criteria andArticleImgResNotBetween(String value1, String value2) {
            addCriterion("ARTICLE_IMG_RES not between", value1, value2, "articleImgRes");
            return (Criteria) this;
        }

        public Criteria andArticleSummaryIsNull() {
            addCriterion("ARTICLE_SUMMARY is null");
            return (Criteria) this;
        }

        public Criteria andArticleSummaryIsNotNull() {
            addCriterion("ARTICLE_SUMMARY is not null");
            return (Criteria) this;
        }

        public Criteria andArticleSummaryEqualTo(String value) {
            addCriterion("ARTICLE_SUMMARY =", value, "articleSummary");
            return (Criteria) this;
        }

        public Criteria andArticleSummaryNotEqualTo(String value) {
            addCriterion("ARTICLE_SUMMARY <>", value, "articleSummary");
            return (Criteria) this;
        }

        public Criteria andArticleSummaryGreaterThan(String value) {
            addCriterion("ARTICLE_SUMMARY >", value, "articleSummary");
            return (Criteria) this;
        }

        public Criteria andArticleSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("ARTICLE_SUMMARY >=", value, "articleSummary");
            return (Criteria) this;
        }

        public Criteria andArticleSummaryLessThan(String value) {
            addCriterion("ARTICLE_SUMMARY <", value, "articleSummary");
            return (Criteria) this;
        }

        public Criteria andArticleSummaryLessThanOrEqualTo(String value) {
            addCriterion("ARTICLE_SUMMARY <=", value, "articleSummary");
            return (Criteria) this;
        }

        public Criteria andArticleSummaryLike(String value) {
            addCriterion("ARTICLE_SUMMARY like", value, "articleSummary");
            return (Criteria) this;
        }

        public Criteria andArticleSummaryNotLike(String value) {
            addCriterion("ARTICLE_SUMMARY not like", value, "articleSummary");
            return (Criteria) this;
        }

        public Criteria andArticleSummaryIn(List<String> values) {
            addCriterion("ARTICLE_SUMMARY in", values, "articleSummary");
            return (Criteria) this;
        }

        public Criteria andArticleSummaryNotIn(List<String> values) {
            addCriterion("ARTICLE_SUMMARY not in", values, "articleSummary");
            return (Criteria) this;
        }

        public Criteria andArticleSummaryBetween(String value1, String value2) {
            addCriterion("ARTICLE_SUMMARY between", value1, value2, "articleSummary");
            return (Criteria) this;
        }

        public Criteria andArticleSummaryNotBetween(String value1, String value2) {
            addCriterion("ARTICLE_SUMMARY not between", value1, value2, "articleSummary");
            return (Criteria) this;
        }

        public Criteria andArticleLinkIsNull() {
            addCriterion("ARTICLE_LINK is null");
            return (Criteria) this;
        }

        public Criteria andArticleLinkIsNotNull() {
            addCriterion("ARTICLE_LINK is not null");
            return (Criteria) this;
        }

        public Criteria andArticleLinkEqualTo(String value) {
            addCriterion("ARTICLE_LINK =", value, "articleLink");
            return (Criteria) this;
        }

        public Criteria andArticleLinkNotEqualTo(String value) {
            addCriterion("ARTICLE_LINK <>", value, "articleLink");
            return (Criteria) this;
        }

        public Criteria andArticleLinkGreaterThan(String value) {
            addCriterion("ARTICLE_LINK >", value, "articleLink");
            return (Criteria) this;
        }

        public Criteria andArticleLinkGreaterThanOrEqualTo(String value) {
            addCriterion("ARTICLE_LINK >=", value, "articleLink");
            return (Criteria) this;
        }

        public Criteria andArticleLinkLessThan(String value) {
            addCriterion("ARTICLE_LINK <", value, "articleLink");
            return (Criteria) this;
        }

        public Criteria andArticleLinkLessThanOrEqualTo(String value) {
            addCriterion("ARTICLE_LINK <=", value, "articleLink");
            return (Criteria) this;
        }

        public Criteria andArticleLinkLike(String value) {
            addCriterion("ARTICLE_LINK like", value, "articleLink");
            return (Criteria) this;
        }

        public Criteria andArticleLinkNotLike(String value) {
            addCriterion("ARTICLE_LINK not like", value, "articleLink");
            return (Criteria) this;
        }

        public Criteria andArticleLinkIn(List<String> values) {
            addCriterion("ARTICLE_LINK in", values, "articleLink");
            return (Criteria) this;
        }

        public Criteria andArticleLinkNotIn(List<String> values) {
            addCriterion("ARTICLE_LINK not in", values, "articleLink");
            return (Criteria) this;
        }

        public Criteria andArticleLinkBetween(String value1, String value2) {
            addCriterion("ARTICLE_LINK between", value1, value2, "articleLink");
            return (Criteria) this;
        }

        public Criteria andArticleLinkNotBetween(String value1, String value2) {
            addCriterion("ARTICLE_LINK not between", value1, value2, "articleLink");
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