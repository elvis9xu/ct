package com.xjd.ct.dal.dos;

import java.util.Date;

public class ObjectResourceModel extends ObjectResourceModelKey {
    private String forSubclass;

    private Date addTime;

    public String getForSubclass() {
        return forSubclass;
    }

    public void setForSubclass(String forSubclass) {
        this.forSubclass = forSubclass;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}