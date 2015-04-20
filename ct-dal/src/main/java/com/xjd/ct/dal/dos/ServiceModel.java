package com.xjd.ct.dal.dos;

import java.util.Date;

public class ServiceModel extends ServiceModelKey {
    private Byte needLoginFlag;

    private Byte inMaintainFlag;

    private String maintainMsg;

    private Byte validFlag;

    private Date addTime;

    private Date updTime;

    public Byte getNeedLoginFlag() {
        return needLoginFlag;
    }

    public void setNeedLoginFlag(Byte needLoginFlag) {
        this.needLoginFlag = needLoginFlag;
    }

    public Byte getInMaintainFlag() {
        return inMaintainFlag;
    }

    public void setInMaintainFlag(Byte inMaintainFlag) {
        this.inMaintainFlag = inMaintainFlag;
    }

    public String getMaintainMsg() {
        return maintainMsg;
    }

    public void setMaintainMsg(String maintainMsg) {
        this.maintainMsg = maintainMsg;
    }

    public Byte getValidFlag() {
        return validFlag;
    }

    public void setValidFlag(Byte validFlag) {
        this.validFlag = validFlag;
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