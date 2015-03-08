package com.xjd.ct.dal.model;

import java.util.Date;

public class ArticleVoteDo extends BaseDo {
    private String articleId;

    private String voteCode;

    private String voteDesc;

    private String likeFlag;

    private Long likeCount;

    private String disdainFlag;

    private Long disdainCount;

    private Date addTime;

    private Date updTime;

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getVoteCode() {
        return voteCode;
    }

    public void setVoteCode(String voteCode) {
        this.voteCode = voteCode;
    }

    public String getVoteDesc() {
        return voteDesc;
    }

    public void setVoteDesc(String voteDesc) {
        this.voteDesc = voteDesc;
    }

    public String getLikeFlag() {
        return likeFlag;
    }

    public void setLikeFlag(String likeFlag) {
        this.likeFlag = likeFlag;
    }

    public Long getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
    }

    public String getDisdainFlag() {
        return disdainFlag;
    }

    public void setDisdainFlag(String disdainFlag) {
        this.disdainFlag = disdainFlag;
    }

    public Long getDisdainCount() {
        return disdainCount;
    }

    public void setDisdainCount(Long disdainCount) {
        this.disdainCount = disdainCount;
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