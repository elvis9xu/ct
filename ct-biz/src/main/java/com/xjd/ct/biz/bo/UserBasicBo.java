package com.xjd.ct.biz.bo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户授权相关信息
 * @author elvis.xu
 * @since 2015-03-23 17:53
 */
public class UserBasicBo {
	private Long userId;

	private String password;

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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Byte getMobileVerifyFlag() {
		return mobileVerifyFlag;
	}

	public void setMobileVerifyFlag(Byte mobileVerifyFlag) {
		this.mobileVerifyFlag = mobileVerifyFlag;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Byte getEmailVerifyFlag() {
		return emailVerifyFlag;
	}

	public void setEmailVerifyFlag(Byte emailVerifyFlag) {
		this.emailVerifyFlag = emailVerifyFlag;
	}

	public Byte getQqBindFlag() {
		return qqBindFlag;
	}

	public void setQqBindFlag(Byte qqBindFlag) {
		this.qqBindFlag = qqBindFlag;
	}

	public Byte getWeixinBindFlag() {
		return weixinBindFlag;
	}

	public void setWeixinBindFlag(Byte weixinBindFlag) {
		this.weixinBindFlag = weixinBindFlag;
	}

	public Byte getSinaWeiboBindFlag() {
		return sinaWeiboBindFlag;
	}

	public void setSinaWeiboBindFlag(Byte sinaWeiboBindFlag) {
		this.sinaWeiboBindFlag = sinaWeiboBindFlag;
	}

	public Byte getTecentWeiboFlag() {
		return tecentWeiboFlag;
	}

	public void setTecentWeiboFlag(Byte tecentWeiboFlag) {
		this.tecentWeiboFlag = tecentWeiboFlag;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Byte getCertType() {
		return certType;
	}

	public void setCertType(Byte certType) {
		this.certType = certType;
	}

	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public Short getFailTimes() {
		return failTimes;
	}

	public void setFailTimes(Short failTimes) {
		this.failTimes = failTimes;
	}

	public String getLastIp() {
		return lastIp;
	}

	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}

	public Date getLastTime() {
		return lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public Byte getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(Byte userStatus) {
		this.userStatus = userStatus;
	}
}
