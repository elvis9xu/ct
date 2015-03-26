package com.xjd.ct.dal.dos;

public class UserAgeBracketResModelKey extends BaseDo {
    private Long userId;

    private Long ageBracketId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getAgeBracketId() {
        return ageBracketId;
    }

    public void setAgeBracketId(Long ageBracketId) {
        this.ageBracketId = ageBracketId;
    }
}