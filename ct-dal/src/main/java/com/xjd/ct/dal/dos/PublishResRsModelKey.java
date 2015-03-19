package com.xjd.ct.dal.dos;

public class PublishResRsModelKey extends BaseDo {
    private Long publishId;

    private String resId;

    public Long getPublishId() {
        return publishId;
    }

    public void setPublishId(Long publishId) {
        this.publishId = publishId;
    }

    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId;
    }
}