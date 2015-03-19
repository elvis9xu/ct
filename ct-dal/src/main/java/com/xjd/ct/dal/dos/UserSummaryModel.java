package com.xjd.ct.dal.dos;

import java.util.Date;

public class UserSummaryModel extends BaseDo {
    private Long userId;

    private Integer informCount;

    private Integer favorCount;

    private Integer publishCount;

    private Integer idolCount;

    private Integer fansCount;

    private Date addTime;

    private Date updTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getInformCount() {
        return informCount;
    }

    public void setInformCount(Integer informCount) {
        this.informCount = informCount;
    }

    public Integer getFavorCount() {
        return favorCount;
    }

    public void setFavorCount(Integer favorCount) {
        this.favorCount = favorCount;
    }

    public Integer getPublishCount() {
        return publishCount;
    }

    public void setPublishCount(Integer publishCount) {
        this.publishCount = publishCount;
    }

    public Integer getIdolCount() {
        return idolCount;
    }

    public void setIdolCount(Integer idolCount) {
        this.idolCount = idolCount;
    }

    public Integer getFansCount() {
        return fansCount;
    }

    public void setFansCount(Integer fansCount) {
        this.fansCount = fansCount;
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