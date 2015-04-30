package com.xjd.ct.dal.dos;

import java.util.Date;

public class ObjectResourceModel extends ObjectResourceModelKey {
    private String forSubclass;

    private Byte finishProcess;

    private Date addTime;

    private Date updTime;

    public String getForSubclass() {
        return forSubclass;
    }

    public void setForSubclass(String forSubclass) {
        this.forSubclass = forSubclass;
    }

    public Byte getFinishProcess() {
        return finishProcess;
    }

    public void setFinishProcess(Byte finishProcess) {
        this.finishProcess = finishProcess;
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