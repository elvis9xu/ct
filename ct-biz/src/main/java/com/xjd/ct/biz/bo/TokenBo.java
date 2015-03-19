package com.xjd.ct.biz.bo;

import java.util.Date;

public class TokenBo extends BaseBo {
	private String token;

	private String salt;

	private String userIp;

	private Long userId;

	private Date addTime;

	private Date updTime;

	/** @return the token */
	public String getToken() {
		return token;
	}

	/** @param token the token to set */
	public void setToken(String token) {
		this.token = token;
	}

	/** @return the salt */
	public String getSalt() {
		return salt;
	}

	/** @param salt the salt to set */
	public void setSalt(String salt) {
		this.salt = salt;
	}

	/** @return the userIp */
	public String getUserIp() {
		return userIp;
	}

	/** @param userIp the userIp to set */
	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}

	/** @return the userId */
	public Long getUserId() {
		return userId;
	}

	/** @param userId the userId to set */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/** @return the addTime */
	public Date getAddTime() {
		return addTime;
	}

	/** @param addTime the addTime to set */
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	/** @return the updTime */
	public Date getUpdTime() {
		return updTime;
	}

	/** @param updTime the updTime to set */
	public void setUpdTime(Date updTime) {
		this.updTime = updTime;
	}

}