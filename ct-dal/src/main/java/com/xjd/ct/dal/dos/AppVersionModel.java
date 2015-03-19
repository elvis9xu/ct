package com.xjd.ct.dal.dos;

import java.util.Date;

public class AppVersionModel extends AppVersionModelKey {
    private String verName;

    private String verDesc;

    private String verRes;

    private String downLink;

    private Byte status;

    private Byte supportFlag;

    private Date addTime;

    private Date updTime;

    public String getVerName() {
        return verName;
    }

    public void setVerName(String verName) {
        this.verName = verName;
    }

    public String getVerDesc() {
        return verDesc;
    }

    public void setVerDesc(String verDesc) {
        this.verDesc = verDesc;
    }

    public String getVerRes() {
        return verRes;
    }

    public void setVerRes(String verRes) {
        this.verRes = verRes;
    }

    public String getDownLink() {
        return downLink;
    }

    public void setDownLink(String downLink) {
        this.downLink = downLink;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getSupportFlag() {
        return supportFlag;
    }

    public void setSupportFlag(Byte supportFlag) {
        this.supportFlag = supportFlag;
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