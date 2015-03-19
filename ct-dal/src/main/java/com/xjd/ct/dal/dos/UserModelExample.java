package com.xjd.ct.dal.dos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserModelExample() {
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

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileVerifyFlagIsNull() {
            addCriterion("MOBILE_VERIFY_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andMobileVerifyFlagIsNotNull() {
            addCriterion("MOBILE_VERIFY_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andMobileVerifyFlagEqualTo(Byte value) {
            addCriterion("MOBILE_VERIFY_FLAG =", value, "mobileVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andMobileVerifyFlagNotEqualTo(Byte value) {
            addCriterion("MOBILE_VERIFY_FLAG <>", value, "mobileVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andMobileVerifyFlagGreaterThan(Byte value) {
            addCriterion("MOBILE_VERIFY_FLAG >", value, "mobileVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andMobileVerifyFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("MOBILE_VERIFY_FLAG >=", value, "mobileVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andMobileVerifyFlagLessThan(Byte value) {
            addCriterion("MOBILE_VERIFY_FLAG <", value, "mobileVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andMobileVerifyFlagLessThanOrEqualTo(Byte value) {
            addCriterion("MOBILE_VERIFY_FLAG <=", value, "mobileVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andMobileVerifyFlagIn(List<Byte> values) {
            addCriterion("MOBILE_VERIFY_FLAG in", values, "mobileVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andMobileVerifyFlagNotIn(List<Byte> values) {
            addCriterion("MOBILE_VERIFY_FLAG not in", values, "mobileVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andMobileVerifyFlagBetween(Byte value1, Byte value2) {
            addCriterion("MOBILE_VERIFY_FLAG between", value1, value2, "mobileVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andMobileVerifyFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("MOBILE_VERIFY_FLAG not between", value1, value2, "mobileVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailVerifyFlagIsNull() {
            addCriterion("EMAIL_VERIFY_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andEmailVerifyFlagIsNotNull() {
            addCriterion("EMAIL_VERIFY_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andEmailVerifyFlagEqualTo(Byte value) {
            addCriterion("EMAIL_VERIFY_FLAG =", value, "emailVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andEmailVerifyFlagNotEqualTo(Byte value) {
            addCriterion("EMAIL_VERIFY_FLAG <>", value, "emailVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andEmailVerifyFlagGreaterThan(Byte value) {
            addCriterion("EMAIL_VERIFY_FLAG >", value, "emailVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andEmailVerifyFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("EMAIL_VERIFY_FLAG >=", value, "emailVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andEmailVerifyFlagLessThan(Byte value) {
            addCriterion("EMAIL_VERIFY_FLAG <", value, "emailVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andEmailVerifyFlagLessThanOrEqualTo(Byte value) {
            addCriterion("EMAIL_VERIFY_FLAG <=", value, "emailVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andEmailVerifyFlagIn(List<Byte> values) {
            addCriterion("EMAIL_VERIFY_FLAG in", values, "emailVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andEmailVerifyFlagNotIn(List<Byte> values) {
            addCriterion("EMAIL_VERIFY_FLAG not in", values, "emailVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andEmailVerifyFlagBetween(Byte value1, Byte value2) {
            addCriterion("EMAIL_VERIFY_FLAG between", value1, value2, "emailVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andEmailVerifyFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("EMAIL_VERIFY_FLAG not between", value1, value2, "emailVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andQqBindFlagIsNull() {
            addCriterion("QQ_BIND_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andQqBindFlagIsNotNull() {
            addCriterion("QQ_BIND_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andQqBindFlagEqualTo(Byte value) {
            addCriterion("QQ_BIND_FLAG =", value, "qqBindFlag");
            return (Criteria) this;
        }

        public Criteria andQqBindFlagNotEqualTo(Byte value) {
            addCriterion("QQ_BIND_FLAG <>", value, "qqBindFlag");
            return (Criteria) this;
        }

        public Criteria andQqBindFlagGreaterThan(Byte value) {
            addCriterion("QQ_BIND_FLAG >", value, "qqBindFlag");
            return (Criteria) this;
        }

        public Criteria andQqBindFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("QQ_BIND_FLAG >=", value, "qqBindFlag");
            return (Criteria) this;
        }

        public Criteria andQqBindFlagLessThan(Byte value) {
            addCriterion("QQ_BIND_FLAG <", value, "qqBindFlag");
            return (Criteria) this;
        }

        public Criteria andQqBindFlagLessThanOrEqualTo(Byte value) {
            addCriterion("QQ_BIND_FLAG <=", value, "qqBindFlag");
            return (Criteria) this;
        }

        public Criteria andQqBindFlagIn(List<Byte> values) {
            addCriterion("QQ_BIND_FLAG in", values, "qqBindFlag");
            return (Criteria) this;
        }

        public Criteria andQqBindFlagNotIn(List<Byte> values) {
            addCriterion("QQ_BIND_FLAG not in", values, "qqBindFlag");
            return (Criteria) this;
        }

        public Criteria andQqBindFlagBetween(Byte value1, Byte value2) {
            addCriterion("QQ_BIND_FLAG between", value1, value2, "qqBindFlag");
            return (Criteria) this;
        }

        public Criteria andQqBindFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("QQ_BIND_FLAG not between", value1, value2, "qqBindFlag");
            return (Criteria) this;
        }

        public Criteria andWeixinBindFlagIsNull() {
            addCriterion("WEIXIN_BIND_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andWeixinBindFlagIsNotNull() {
            addCriterion("WEIXIN_BIND_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinBindFlagEqualTo(Byte value) {
            addCriterion("WEIXIN_BIND_FLAG =", value, "weixinBindFlag");
            return (Criteria) this;
        }

        public Criteria andWeixinBindFlagNotEqualTo(Byte value) {
            addCriterion("WEIXIN_BIND_FLAG <>", value, "weixinBindFlag");
            return (Criteria) this;
        }

        public Criteria andWeixinBindFlagGreaterThan(Byte value) {
            addCriterion("WEIXIN_BIND_FLAG >", value, "weixinBindFlag");
            return (Criteria) this;
        }

        public Criteria andWeixinBindFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("WEIXIN_BIND_FLAG >=", value, "weixinBindFlag");
            return (Criteria) this;
        }

        public Criteria andWeixinBindFlagLessThan(Byte value) {
            addCriterion("WEIXIN_BIND_FLAG <", value, "weixinBindFlag");
            return (Criteria) this;
        }

        public Criteria andWeixinBindFlagLessThanOrEqualTo(Byte value) {
            addCriterion("WEIXIN_BIND_FLAG <=", value, "weixinBindFlag");
            return (Criteria) this;
        }

        public Criteria andWeixinBindFlagIn(List<Byte> values) {
            addCriterion("WEIXIN_BIND_FLAG in", values, "weixinBindFlag");
            return (Criteria) this;
        }

        public Criteria andWeixinBindFlagNotIn(List<Byte> values) {
            addCriterion("WEIXIN_BIND_FLAG not in", values, "weixinBindFlag");
            return (Criteria) this;
        }

        public Criteria andWeixinBindFlagBetween(Byte value1, Byte value2) {
            addCriterion("WEIXIN_BIND_FLAG between", value1, value2, "weixinBindFlag");
            return (Criteria) this;
        }

        public Criteria andWeixinBindFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("WEIXIN_BIND_FLAG not between", value1, value2, "weixinBindFlag");
            return (Criteria) this;
        }

        public Criteria andSinaWeiboBindFlagIsNull() {
            addCriterion("SINA_WEIBO_BIND_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andSinaWeiboBindFlagIsNotNull() {
            addCriterion("SINA_WEIBO_BIND_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSinaWeiboBindFlagEqualTo(Byte value) {
            addCriterion("SINA_WEIBO_BIND_FLAG =", value, "sinaWeiboBindFlag");
            return (Criteria) this;
        }

        public Criteria andSinaWeiboBindFlagNotEqualTo(Byte value) {
            addCriterion("SINA_WEIBO_BIND_FLAG <>", value, "sinaWeiboBindFlag");
            return (Criteria) this;
        }

        public Criteria andSinaWeiboBindFlagGreaterThan(Byte value) {
            addCriterion("SINA_WEIBO_BIND_FLAG >", value, "sinaWeiboBindFlag");
            return (Criteria) this;
        }

        public Criteria andSinaWeiboBindFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("SINA_WEIBO_BIND_FLAG >=", value, "sinaWeiboBindFlag");
            return (Criteria) this;
        }

        public Criteria andSinaWeiboBindFlagLessThan(Byte value) {
            addCriterion("SINA_WEIBO_BIND_FLAG <", value, "sinaWeiboBindFlag");
            return (Criteria) this;
        }

        public Criteria andSinaWeiboBindFlagLessThanOrEqualTo(Byte value) {
            addCriterion("SINA_WEIBO_BIND_FLAG <=", value, "sinaWeiboBindFlag");
            return (Criteria) this;
        }

        public Criteria andSinaWeiboBindFlagIn(List<Byte> values) {
            addCriterion("SINA_WEIBO_BIND_FLAG in", values, "sinaWeiboBindFlag");
            return (Criteria) this;
        }

        public Criteria andSinaWeiboBindFlagNotIn(List<Byte> values) {
            addCriterion("SINA_WEIBO_BIND_FLAG not in", values, "sinaWeiboBindFlag");
            return (Criteria) this;
        }

        public Criteria andSinaWeiboBindFlagBetween(Byte value1, Byte value2) {
            addCriterion("SINA_WEIBO_BIND_FLAG between", value1, value2, "sinaWeiboBindFlag");
            return (Criteria) this;
        }

        public Criteria andSinaWeiboBindFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("SINA_WEIBO_BIND_FLAG not between", value1, value2, "sinaWeiboBindFlag");
            return (Criteria) this;
        }

        public Criteria andTecentWeiboFlagIsNull() {
            addCriterion("TECENT_WEIBO_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andTecentWeiboFlagIsNotNull() {
            addCriterion("TECENT_WEIBO_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andTecentWeiboFlagEqualTo(Byte value) {
            addCriterion("TECENT_WEIBO_FLAG =", value, "tecentWeiboFlag");
            return (Criteria) this;
        }

        public Criteria andTecentWeiboFlagNotEqualTo(Byte value) {
            addCriterion("TECENT_WEIBO_FLAG <>", value, "tecentWeiboFlag");
            return (Criteria) this;
        }

        public Criteria andTecentWeiboFlagGreaterThan(Byte value) {
            addCriterion("TECENT_WEIBO_FLAG >", value, "tecentWeiboFlag");
            return (Criteria) this;
        }

        public Criteria andTecentWeiboFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("TECENT_WEIBO_FLAG >=", value, "tecentWeiboFlag");
            return (Criteria) this;
        }

        public Criteria andTecentWeiboFlagLessThan(Byte value) {
            addCriterion("TECENT_WEIBO_FLAG <", value, "tecentWeiboFlag");
            return (Criteria) this;
        }

        public Criteria andTecentWeiboFlagLessThanOrEqualTo(Byte value) {
            addCriterion("TECENT_WEIBO_FLAG <=", value, "tecentWeiboFlag");
            return (Criteria) this;
        }

        public Criteria andTecentWeiboFlagIn(List<Byte> values) {
            addCriterion("TECENT_WEIBO_FLAG in", values, "tecentWeiboFlag");
            return (Criteria) this;
        }

        public Criteria andTecentWeiboFlagNotIn(List<Byte> values) {
            addCriterion("TECENT_WEIBO_FLAG not in", values, "tecentWeiboFlag");
            return (Criteria) this;
        }

        public Criteria andTecentWeiboFlagBetween(Byte value1, Byte value2) {
            addCriterion("TECENT_WEIBO_FLAG between", value1, value2, "tecentWeiboFlag");
            return (Criteria) this;
        }

        public Criteria andTecentWeiboFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("TECENT_WEIBO_FLAG not between", value1, value2, "tecentWeiboFlag");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("REAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("REAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("REAL_NAME =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("REAL_NAME <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("REAL_NAME >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("REAL_NAME >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("REAL_NAME <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("REAL_NAME <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("REAL_NAME like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("REAL_NAME not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("REAL_NAME in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("REAL_NAME not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("REAL_NAME between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("REAL_NAME not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNull() {
            addCriterion("CERT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNotNull() {
            addCriterion("CERT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCertTypeEqualTo(Byte value) {
            addCriterion("CERT_TYPE =", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotEqualTo(Byte value) {
            addCriterion("CERT_TYPE <>", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThan(Byte value) {
            addCriterion("CERT_TYPE >", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("CERT_TYPE >=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThan(Byte value) {
            addCriterion("CERT_TYPE <", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThanOrEqualTo(Byte value) {
            addCriterion("CERT_TYPE <=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeIn(List<Byte> values) {
            addCriterion("CERT_TYPE in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotIn(List<Byte> values) {
            addCriterion("CERT_TYPE not in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeBetween(Byte value1, Byte value2) {
            addCriterion("CERT_TYPE between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("CERT_TYPE not between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertNoIsNull() {
            addCriterion("CERT_NO is null");
            return (Criteria) this;
        }

        public Criteria andCertNoIsNotNull() {
            addCriterion("CERT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCertNoEqualTo(String value) {
            addCriterion("CERT_NO =", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotEqualTo(String value) {
            addCriterion("CERT_NO <>", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoGreaterThan(String value) {
            addCriterion("CERT_NO >", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoGreaterThanOrEqualTo(String value) {
            addCriterion("CERT_NO >=", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLessThan(String value) {
            addCriterion("CERT_NO <", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLessThanOrEqualTo(String value) {
            addCriterion("CERT_NO <=", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLike(String value) {
            addCriterion("CERT_NO like", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotLike(String value) {
            addCriterion("CERT_NO not like", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoIn(List<String> values) {
            addCriterion("CERT_NO in", values, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotIn(List<String> values) {
            addCriterion("CERT_NO not in", values, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoBetween(String value1, String value2) {
            addCriterion("CERT_NO between", value1, value2, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotBetween(String value1, String value2) {
            addCriterion("CERT_NO not between", value1, value2, "certNo");
            return (Criteria) this;
        }

        public Criteria andFailTimesIsNull() {
            addCriterion("FAIL_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andFailTimesIsNotNull() {
            addCriterion("FAIL_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andFailTimesEqualTo(Short value) {
            addCriterion("FAIL_TIMES =", value, "failTimes");
            return (Criteria) this;
        }

        public Criteria andFailTimesNotEqualTo(Short value) {
            addCriterion("FAIL_TIMES <>", value, "failTimes");
            return (Criteria) this;
        }

        public Criteria andFailTimesGreaterThan(Short value) {
            addCriterion("FAIL_TIMES >", value, "failTimes");
            return (Criteria) this;
        }

        public Criteria andFailTimesGreaterThanOrEqualTo(Short value) {
            addCriterion("FAIL_TIMES >=", value, "failTimes");
            return (Criteria) this;
        }

        public Criteria andFailTimesLessThan(Short value) {
            addCriterion("FAIL_TIMES <", value, "failTimes");
            return (Criteria) this;
        }

        public Criteria andFailTimesLessThanOrEqualTo(Short value) {
            addCriterion("FAIL_TIMES <=", value, "failTimes");
            return (Criteria) this;
        }

        public Criteria andFailTimesIn(List<Short> values) {
            addCriterion("FAIL_TIMES in", values, "failTimes");
            return (Criteria) this;
        }

        public Criteria andFailTimesNotIn(List<Short> values) {
            addCriterion("FAIL_TIMES not in", values, "failTimes");
            return (Criteria) this;
        }

        public Criteria andFailTimesBetween(Short value1, Short value2) {
            addCriterion("FAIL_TIMES between", value1, value2, "failTimes");
            return (Criteria) this;
        }

        public Criteria andFailTimesNotBetween(Short value1, Short value2) {
            addCriterion("FAIL_TIMES not between", value1, value2, "failTimes");
            return (Criteria) this;
        }

        public Criteria andLastIpIsNull() {
            addCriterion("LAST_IP is null");
            return (Criteria) this;
        }

        public Criteria andLastIpIsNotNull() {
            addCriterion("LAST_IP is not null");
            return (Criteria) this;
        }

        public Criteria andLastIpEqualTo(String value) {
            addCriterion("LAST_IP =", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotEqualTo(String value) {
            addCriterion("LAST_IP <>", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpGreaterThan(String value) {
            addCriterion("LAST_IP >", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_IP >=", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpLessThan(String value) {
            addCriterion("LAST_IP <", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpLessThanOrEqualTo(String value) {
            addCriterion("LAST_IP <=", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpLike(String value) {
            addCriterion("LAST_IP like", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotLike(String value) {
            addCriterion("LAST_IP not like", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpIn(List<String> values) {
            addCriterion("LAST_IP in", values, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotIn(List<String> values) {
            addCriterion("LAST_IP not in", values, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpBetween(String value1, String value2) {
            addCriterion("LAST_IP between", value1, value2, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotBetween(String value1, String value2) {
            addCriterion("LAST_IP not between", value1, value2, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNull() {
            addCriterion("LAST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNotNull() {
            addCriterion("LAST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastTimeEqualTo(Date value) {
            addCriterion("LAST_TIME =", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotEqualTo(Date value) {
            addCriterion("LAST_TIME <>", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThan(Date value) {
            addCriterion("LAST_TIME >", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_TIME >=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThan(Date value) {
            addCriterion("LAST_TIME <", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_TIME <=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIn(List<Date> values) {
            addCriterion("LAST_TIME in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotIn(List<Date> values) {
            addCriterion("LAST_TIME not in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_TIME between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_TIME not between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("LONGITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("LONGITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(BigDecimal value) {
            addCriterion("LONGITUDE =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("LONGITUDE <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(BigDecimal value) {
            addCriterion("LONGITUDE >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LONGITUDE >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(BigDecimal value) {
            addCriterion("LONGITUDE <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LONGITUDE <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<BigDecimal> values) {
            addCriterion("LONGITUDE in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("LONGITUDE not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LONGITUDE between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LONGITUDE not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("LATITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("LATITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(BigDecimal value) {
            addCriterion("LATITUDE =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("LATITUDE <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(BigDecimal value) {
            addCriterion("LATITUDE >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LATITUDE >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(BigDecimal value) {
            addCriterion("LATITUDE <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LATITUDE <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<BigDecimal> values) {
            addCriterion("LATITUDE in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("LATITUDE not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LATITUDE between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LATITUDE not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
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