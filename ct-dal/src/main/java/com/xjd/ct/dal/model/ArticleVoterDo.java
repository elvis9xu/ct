package com.xjd.ct.dal.model;

import java.util.Date;

public class ArticleVoterDo extends BaseDo {
	private String articleId;

	private String voteCode;

	private String userId;

	private String attitude;

	private Date addTime;

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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAttitude() {
		return attitude;
	}

	public void setAttitude(String attitude) {
		this.attitude = attitude;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
}