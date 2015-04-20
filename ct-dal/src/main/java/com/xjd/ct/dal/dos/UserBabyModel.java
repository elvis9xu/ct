package com.xjd.ct.dal.dos;

import java.util.Date;

public class UserBabyModel extends BaseDo {
    private Long babyId;

    private Long userId;

    private String babyNickname;

    private Byte babySex;

    private Date babyBirth;

    private String babyRealname;

    private Date addTime;

    private Date updTime;

    public Long getBabyId() {
        return babyId;
    }

    public void setBabyId(Long babyId) {
        this.babyId = babyId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getBabyNickname() {
        return babyNickname;
    }

    public void setBabyNickname(String babyNickname) {
        this.babyNickname = babyNickname;
    }

    public Byte getBabySex() {
        return babySex;
    }

    public void setBabySex(Byte babySex) {
        this.babySex = babySex;
    }

    public Date getBabyBirth() {
        return babyBirth;
    }

    public void setBabyBirth(Date babyBirth) {
        this.babyBirth = babyBirth;
    }

    public String getBabyRealname() {
        return babyRealname;
    }

    public void setBabyRealname(String babyRealname) {
        this.babyRealname = babyRealname;
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