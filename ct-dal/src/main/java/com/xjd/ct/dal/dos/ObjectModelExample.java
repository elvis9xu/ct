package com.xjd.ct.dal.dos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ObjectModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ObjectModelExample() {
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

        public Criteria andObjectIdIsNull() {
            addCriterion("OBJECT_ID is null");
            return (Criteria) this;
        }

        public Criteria andObjectIdIsNotNull() {
            addCriterion("OBJECT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andObjectIdEqualTo(Long value) {
            addCriterion("OBJECT_ID =", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdNotEqualTo(Long value) {
            addCriterion("OBJECT_ID <>", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdGreaterThan(Long value) {
            addCriterion("OBJECT_ID >", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OBJECT_ID >=", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdLessThan(Long value) {
            addCriterion("OBJECT_ID <", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdLessThanOrEqualTo(Long value) {
            addCriterion("OBJECT_ID <=", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdIn(List<Long> values) {
            addCriterion("OBJECT_ID in", values, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdNotIn(List<Long> values) {
            addCriterion("OBJECT_ID not in", values, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdBetween(Long value1, Long value2) {
            addCriterion("OBJECT_ID between", value1, value2, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdNotBetween(Long value1, Long value2) {
            addCriterion("OBJECT_ID not between", value1, value2, "objectId");
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

        public Criteria andVoteFlagIsNull() {
            addCriterion("VOTE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andVoteFlagIsNotNull() {
            addCriterion("VOTE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andVoteFlagEqualTo(Byte value) {
            addCriterion("VOTE_FLAG =", value, "voteFlag");
            return (Criteria) this;
        }

        public Criteria andVoteFlagNotEqualTo(Byte value) {
            addCriterion("VOTE_FLAG <>", value, "voteFlag");
            return (Criteria) this;
        }

        public Criteria andVoteFlagGreaterThan(Byte value) {
            addCriterion("VOTE_FLAG >", value, "voteFlag");
            return (Criteria) this;
        }

        public Criteria andVoteFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("VOTE_FLAG >=", value, "voteFlag");
            return (Criteria) this;
        }

        public Criteria andVoteFlagLessThan(Byte value) {
            addCriterion("VOTE_FLAG <", value, "voteFlag");
            return (Criteria) this;
        }

        public Criteria andVoteFlagLessThanOrEqualTo(Byte value) {
            addCriterion("VOTE_FLAG <=", value, "voteFlag");
            return (Criteria) this;
        }

        public Criteria andVoteFlagIn(List<Byte> values) {
            addCriterion("VOTE_FLAG in", values, "voteFlag");
            return (Criteria) this;
        }

        public Criteria andVoteFlagNotIn(List<Byte> values) {
            addCriterion("VOTE_FLAG not in", values, "voteFlag");
            return (Criteria) this;
        }

        public Criteria andVoteFlagBetween(Byte value1, Byte value2) {
            addCriterion("VOTE_FLAG between", value1, value2, "voteFlag");
            return (Criteria) this;
        }

        public Criteria andVoteFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("VOTE_FLAG not between", value1, value2, "voteFlag");
            return (Criteria) this;
        }

        public Criteria andVoteMultiFlagIsNull() {
            addCriterion("VOTE_MULTI_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andVoteMultiFlagIsNotNull() {
            addCriterion("VOTE_MULTI_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andVoteMultiFlagEqualTo(Byte value) {
            addCriterion("VOTE_MULTI_FLAG =", value, "voteMultiFlag");
            return (Criteria) this;
        }

        public Criteria andVoteMultiFlagNotEqualTo(Byte value) {
            addCriterion("VOTE_MULTI_FLAG <>", value, "voteMultiFlag");
            return (Criteria) this;
        }

        public Criteria andVoteMultiFlagGreaterThan(Byte value) {
            addCriterion("VOTE_MULTI_FLAG >", value, "voteMultiFlag");
            return (Criteria) this;
        }

        public Criteria andVoteMultiFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("VOTE_MULTI_FLAG >=", value, "voteMultiFlag");
            return (Criteria) this;
        }

        public Criteria andVoteMultiFlagLessThan(Byte value) {
            addCriterion("VOTE_MULTI_FLAG <", value, "voteMultiFlag");
            return (Criteria) this;
        }

        public Criteria andVoteMultiFlagLessThanOrEqualTo(Byte value) {
            addCriterion("VOTE_MULTI_FLAG <=", value, "voteMultiFlag");
            return (Criteria) this;
        }

        public Criteria andVoteMultiFlagIn(List<Byte> values) {
            addCriterion("VOTE_MULTI_FLAG in", values, "voteMultiFlag");
            return (Criteria) this;
        }

        public Criteria andVoteMultiFlagNotIn(List<Byte> values) {
            addCriterion("VOTE_MULTI_FLAG not in", values, "voteMultiFlag");
            return (Criteria) this;
        }

        public Criteria andVoteMultiFlagBetween(Byte value1, Byte value2) {
            addCriterion("VOTE_MULTI_FLAG between", value1, value2, "voteMultiFlag");
            return (Criteria) this;
        }

        public Criteria andVoteMultiFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("VOTE_MULTI_FLAG not between", value1, value2, "voteMultiFlag");
            return (Criteria) this;
        }

        public Criteria andLikeYesFlagIsNull() {
            addCriterion("LIKE_YES_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andLikeYesFlagIsNotNull() {
            addCriterion("LIKE_YES_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andLikeYesFlagEqualTo(Byte value) {
            addCriterion("LIKE_YES_FLAG =", value, "likeYesFlag");
            return (Criteria) this;
        }

        public Criteria andLikeYesFlagNotEqualTo(Byte value) {
            addCriterion("LIKE_YES_FLAG <>", value, "likeYesFlag");
            return (Criteria) this;
        }

        public Criteria andLikeYesFlagGreaterThan(Byte value) {
            addCriterion("LIKE_YES_FLAG >", value, "likeYesFlag");
            return (Criteria) this;
        }

        public Criteria andLikeYesFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("LIKE_YES_FLAG >=", value, "likeYesFlag");
            return (Criteria) this;
        }

        public Criteria andLikeYesFlagLessThan(Byte value) {
            addCriterion("LIKE_YES_FLAG <", value, "likeYesFlag");
            return (Criteria) this;
        }

        public Criteria andLikeYesFlagLessThanOrEqualTo(Byte value) {
            addCriterion("LIKE_YES_FLAG <=", value, "likeYesFlag");
            return (Criteria) this;
        }

        public Criteria andLikeYesFlagIn(List<Byte> values) {
            addCriterion("LIKE_YES_FLAG in", values, "likeYesFlag");
            return (Criteria) this;
        }

        public Criteria andLikeYesFlagNotIn(List<Byte> values) {
            addCriterion("LIKE_YES_FLAG not in", values, "likeYesFlag");
            return (Criteria) this;
        }

        public Criteria andLikeYesFlagBetween(Byte value1, Byte value2) {
            addCriterion("LIKE_YES_FLAG between", value1, value2, "likeYesFlag");
            return (Criteria) this;
        }

        public Criteria andLikeYesFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("LIKE_YES_FLAG not between", value1, value2, "likeYesFlag");
            return (Criteria) this;
        }

        public Criteria andLikeNoFlagIsNull() {
            addCriterion("LIKE_NO_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andLikeNoFlagIsNotNull() {
            addCriterion("LIKE_NO_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andLikeNoFlagEqualTo(Byte value) {
            addCriterion("LIKE_NO_FLAG =", value, "likeNoFlag");
            return (Criteria) this;
        }

        public Criteria andLikeNoFlagNotEqualTo(Byte value) {
            addCriterion("LIKE_NO_FLAG <>", value, "likeNoFlag");
            return (Criteria) this;
        }

        public Criteria andLikeNoFlagGreaterThan(Byte value) {
            addCriterion("LIKE_NO_FLAG >", value, "likeNoFlag");
            return (Criteria) this;
        }

        public Criteria andLikeNoFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("LIKE_NO_FLAG >=", value, "likeNoFlag");
            return (Criteria) this;
        }

        public Criteria andLikeNoFlagLessThan(Byte value) {
            addCriterion("LIKE_NO_FLAG <", value, "likeNoFlag");
            return (Criteria) this;
        }

        public Criteria andLikeNoFlagLessThanOrEqualTo(Byte value) {
            addCriterion("LIKE_NO_FLAG <=", value, "likeNoFlag");
            return (Criteria) this;
        }

        public Criteria andLikeNoFlagIn(List<Byte> values) {
            addCriterion("LIKE_NO_FLAG in", values, "likeNoFlag");
            return (Criteria) this;
        }

        public Criteria andLikeNoFlagNotIn(List<Byte> values) {
            addCriterion("LIKE_NO_FLAG not in", values, "likeNoFlag");
            return (Criteria) this;
        }

        public Criteria andLikeNoFlagBetween(Byte value1, Byte value2) {
            addCriterion("LIKE_NO_FLAG between", value1, value2, "likeNoFlag");
            return (Criteria) this;
        }

        public Criteria andLikeNoFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("LIKE_NO_FLAG not between", value1, value2, "likeNoFlag");
            return (Criteria) this;
        }

        public Criteria andCommentFlagIsNull() {
            addCriterion("COMMENT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCommentFlagIsNotNull() {
            addCriterion("COMMENT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCommentFlagEqualTo(Byte value) {
            addCriterion("COMMENT_FLAG =", value, "commentFlag");
            return (Criteria) this;
        }

        public Criteria andCommentFlagNotEqualTo(Byte value) {
            addCriterion("COMMENT_FLAG <>", value, "commentFlag");
            return (Criteria) this;
        }

        public Criteria andCommentFlagGreaterThan(Byte value) {
            addCriterion("COMMENT_FLAG >", value, "commentFlag");
            return (Criteria) this;
        }

        public Criteria andCommentFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("COMMENT_FLAG >=", value, "commentFlag");
            return (Criteria) this;
        }

        public Criteria andCommentFlagLessThan(Byte value) {
            addCriterion("COMMENT_FLAG <", value, "commentFlag");
            return (Criteria) this;
        }

        public Criteria andCommentFlagLessThanOrEqualTo(Byte value) {
            addCriterion("COMMENT_FLAG <=", value, "commentFlag");
            return (Criteria) this;
        }

        public Criteria andCommentFlagIn(List<Byte> values) {
            addCriterion("COMMENT_FLAG in", values, "commentFlag");
            return (Criteria) this;
        }

        public Criteria andCommentFlagNotIn(List<Byte> values) {
            addCriterion("COMMENT_FLAG not in", values, "commentFlag");
            return (Criteria) this;
        }

        public Criteria andCommentFlagBetween(Byte value1, Byte value2) {
            addCriterion("COMMENT_FLAG between", value1, value2, "commentFlag");
            return (Criteria) this;
        }

        public Criteria andCommentFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("COMMENT_FLAG not between", value1, value2, "commentFlag");
            return (Criteria) this;
        }

        public Criteria andFavorFlagIsNull() {
            addCriterion("FAVOR_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFavorFlagIsNotNull() {
            addCriterion("FAVOR_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFavorFlagEqualTo(Byte value) {
            addCriterion("FAVOR_FLAG =", value, "favorFlag");
            return (Criteria) this;
        }

        public Criteria andFavorFlagNotEqualTo(Byte value) {
            addCriterion("FAVOR_FLAG <>", value, "favorFlag");
            return (Criteria) this;
        }

        public Criteria andFavorFlagGreaterThan(Byte value) {
            addCriterion("FAVOR_FLAG >", value, "favorFlag");
            return (Criteria) this;
        }

        public Criteria andFavorFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("FAVOR_FLAG >=", value, "favorFlag");
            return (Criteria) this;
        }

        public Criteria andFavorFlagLessThan(Byte value) {
            addCriterion("FAVOR_FLAG <", value, "favorFlag");
            return (Criteria) this;
        }

        public Criteria andFavorFlagLessThanOrEqualTo(Byte value) {
            addCriterion("FAVOR_FLAG <=", value, "favorFlag");
            return (Criteria) this;
        }

        public Criteria andFavorFlagIn(List<Byte> values) {
            addCriterion("FAVOR_FLAG in", values, "favorFlag");
            return (Criteria) this;
        }

        public Criteria andFavorFlagNotIn(List<Byte> values) {
            addCriterion("FAVOR_FLAG not in", values, "favorFlag");
            return (Criteria) this;
        }

        public Criteria andFavorFlagBetween(Byte value1, Byte value2) {
            addCriterion("FAVOR_FLAG between", value1, value2, "favorFlag");
            return (Criteria) this;
        }

        public Criteria andFavorFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("FAVOR_FLAG not between", value1, value2, "favorFlag");
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