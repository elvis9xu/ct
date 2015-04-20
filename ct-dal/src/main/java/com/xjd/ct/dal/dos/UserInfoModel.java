package com.xjd.ct.dal.dos;

import java.util.Date;

public class UserInfoModel extends BaseDo {
    private Long userId;

    private Byte userType;

    private Integer gradeExp;

    private Byte gradeLevel;

    private Integer point;

    private String nickname;

    private Byte sex;

    private Date birth;

    private String moodWords;

    private Date moodWordsTime;

    private Date addTime;

    private Date updTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Byte getUserType() {
        return userType;
    }

    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    public Integer getGradeExp() {
        return gradeExp;
    }

    public void setGradeExp(Integer gradeExp) {
        this.gradeExp = gradeExp;
    }

    public Byte getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(Byte gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getMoodWords() {
        return moodWords;
    }

    public void setMoodWords(String moodWords) {
        this.moodWords = moodWords;
    }

    public Date getMoodWordsTime() {
        return moodWordsTime;
    }

    public void setMoodWordsTime(Date moodWordsTime) {
        this.moodWordsTime = moodWordsTime;
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