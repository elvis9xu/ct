package com.xjd.ct.dal.dos;

import java.util.Date;

public class RecommendModel extends BaseDo {
    private Long recommendId;

    private Byte objectType;

    private Long objectRefId;

    private Date recommendTime;

    private Short recommendOrder;

    private Date addTime;

    private Date updTime;

    public Long getRecommendId() {
        return recommendId;
    }

    public void setRecommendId(Long recommendId) {
        this.recommendId = recommendId;
    }

    public Byte getObjectType() {
        return objectType;
    }

    public void setObjectType(Byte objectType) {
        this.objectType = objectType;
    }

    public Long getObjectRefId() {
        return objectRefId;
    }

    public void setObjectRefId(Long objectRefId) {
        this.objectRefId = objectRefId;
    }

    public Date getRecommendTime() {
        return recommendTime;
    }

    public void setRecommendTime(Date recommendTime) {
        this.recommendTime = recommendTime;
    }

    public Short getRecommendOrder() {
        return recommendOrder;
    }

    public void setRecommendOrder(Short recommendOrder) {
        this.recommendOrder = recommendOrder;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdTime() {
        return updTime;
    }

    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }
}