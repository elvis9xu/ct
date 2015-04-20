package com.xjd.ct.dal.dos;

import java.util.Date;

public class ObjectLikeModel extends ObjectLikeModelKey {
    private Byte yesNo;

    private Date addTime;

    private Date updTime;

    public Byte getYesNo() {
        return yesNo;
    }

    public void setYesNo(Byte yesNo) {
        this.yesNo = yesNo;
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