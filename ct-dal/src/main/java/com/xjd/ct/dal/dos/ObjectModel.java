package com.xjd.ct.dal.dos;

import java.util.Date;

public class ObjectModel extends BaseDo {
    private Long objectId;

    private Byte objectType;

    private Long objectRefId;

    private Byte voteFlag;

    private Byte voteMultiFlag;

    private Byte likeYesFlag;

    private Byte likeNoFlag;

    private Byte commentFlag;

    private Byte favorFlag;

    private Date addTime;

    private Date updTime;

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
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

    public Byte getVoteFlag() {
        return voteFlag;
    }

    public void setVoteFlag(Byte voteFlag) {
        this.voteFlag = voteFlag;
    }

    public Byte getVoteMultiFlag() {
        return voteMultiFlag;
    }

    public void setVoteMultiFlag(Byte voteMultiFlag) {
        this.voteMultiFlag = voteMultiFlag;
    }

    public Byte getLikeYesFlag() {
        return likeYesFlag;
    }

    public void setLikeYesFlag(Byte likeYesFlag) {
        this.likeYesFlag = likeYesFlag;
    }

    public Byte getLikeNoFlag() {
        return likeNoFlag;
    }

    public void setLikeNoFlag(Byte likeNoFlag) {
        this.likeNoFlag = likeNoFlag;
    }

    public Byte getCommentFlag() {
        return commentFlag;
    }

    public void setCommentFlag(Byte commentFlag) {
        this.commentFlag = commentFlag;
    }

    public Byte getFavorFlag() {
        return favorFlag;
    }

    public void setFavorFlag(Byte favorFlag) {
        this.favorFlag = favorFlag;
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