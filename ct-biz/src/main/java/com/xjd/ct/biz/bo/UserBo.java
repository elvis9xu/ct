package com.xjd.ct.biz.bo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户基本信息
 */
public class UserBo extends BaseBo {
	private Long userId;

	private String mobile;

	private Byte mobileVerifyFlag;

	private String email;

	private Byte emailVerifyFlag;

	private Byte qqBindFlag;

	private Byte weixinBindFlag;

	private Byte sinaWeiboBindFlag;

	private Byte tecentWeiboFlag;

	private String realName;

	private Byte certType;

	private String certNo;

	private Short failTimes;

	private String lastIp;

	private Date lastTime;

	private BigDecimal longitude;

	private BigDecimal latitude;

	private String address;

	private Byte userStatus;

	private Date addTime;

	private Date updTime;

	/** @return the userId */
	public Long getUserId() {
		return userId;
	}

	/** @param userId the userId to set */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/** @return the mobile */
	public String getMobile() {
		return mobile;
	}

	/** @param mobile the mobile to set */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/** @return the mobileVerifyFlag */
	public Byte getMobileVerifyFlag() {
		return mobileVerifyFlag;
	}

	/** @param mobileVerifyFlag the mobileVerifyFlag to set */
	public void setMobileVerifyFlag(Byte mobileVerifyFlag) {
		this.mobileVerifyFlag = mobileVerifyFlag;
	}

	/** @return the email */
	public String getEmail() {
		return email;
	}

	/** @param email the email to set */
	public void setEmail(String email) {
		this.email = email;
	}

	/** @return the emailVerifyFlag */
	public Byte getEmailVerifyFlag() {
		return emailVerifyFlag;
	}

	/** @param emailVerifyFlag the emailVerifyFlag to set */
	public void setEmailVerifyFlag(Byte emailVerifyFlag) {
		this.emailVerifyFlag = emailVerifyFlag;
	}

	/** @return the qqBindFlag */
	public Byte getQqBindFlag() {
		return qqBindFlag;
	}

	/** @param qqBindFlag the qqBindFlag to set */
	public void setQqBindFlag(Byte qqBindFlag) {
		this.qqBindFlag = qqBindFlag;
	}

	/** @return the weixinBindFlag */
	public Byte getWeixinBindFlag() {
		return weixinBindFlag;
	}

	/** @param weixinBindFlag the weixinBindFlag to set */
	public void setWeixinBindFlag(Byte weixinBindFlag) {
		this.weixinBindFlag = weixinBindFlag;
	}

	/** @return the sinaWeiboBindFlag */
	public Byte getSinaWeiboBindFlag() {
		return sinaWeiboBindFlag;
	}

	/** @param sinaWeiboBindFlag the sinaWeiboBindFlag to set */
	public void setSinaWeiboBindFlag(Byte sinaWeiboBindFlag) {
		this.sinaWeiboBindFlag = sinaWeiboBindFlag;
	}

	/** @return the tecentWeiboFlag */
	public Byte getTecentWeiboFlag() {
		return tecentWeiboFlag;
	}

	/** @param tecentWeiboFlag the tecentWeiboFlag to set */
	public void setTecentWeiboFlag(Byte tecentWeiboFlag) {
		this.tecentWeiboFlag = tecentWeiboFlag;
	}

	/** @return the realName */
	public String getRealName() {
		return realName;
	}

	/** @param realName the realName to set */
	public void setRealName(String realName) {
		this.realName = realName;
	}

	/** @return the certType */
	public Byte getCertType() {
		return certType;
	}

	/** @param certType the certType to set */
	public void setCertType(Byte certType) {
		this.certType = certType;
	}

	/** @return the certNo */
	public String getCertNo() {
		return certNo;
	}

	/** @param certNo the certNo to set */
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	/** @return the failTimes */
	public Short getFailTimes() {
		return failTimes;
	}

	/** @param failTimes the failTimes to set */
	public void setFailTimes(Short failTimes) {
		this.failTimes = failTimes;
	}

	/** @return the lastIp */
	public String getLastIp() {
		return lastIp;
	}

	/** @param lastIp the lastIp to set */
	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}

	/** @return the lastTime */
	public Date getLastTime() {
		return lastTime;
	}

	/** @param lastTime the lastTime to set */
	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	/** @return the longitude */
	public BigDecimal getLongitude() {
		return longitude;
	}

	/** @param longitude the longitude to set */
	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	/** @return the latitude */
	public BigDecimal getLatitude() {
		return latitude;
	}

	/** @param latitude the latitude to set */
	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	/** @return the address */
	public String getAddress() {
		return address;
	}

	/** @param address the address to set */
	public void setAddress(String address) {
		this.address = address;
	}

	/** @return the userStatus */
	public Byte getUserStatus() {
		return userStatus;
	}

	/** @param userStatus the userStatus to set */
	public void setUserStatus(Byte userStatus) {
		this.userStatus = userStatus;
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