package com.xjd.ct.app.view.vo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 用户全量信息
 * 
 * @author elvis.xu
 * @since 2015-03-23 18:10
 */
public class UserVo {
	// User
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

	private Date addTime;

	// User Info
	private Byte userType;

	private Integer gradeExp;

	private Byte gradeLevel;

	private Integer point;

	private String nickname;

	private String headImgRes;

	private Byte sex;

	private Date birth;

	private String moodWords;

	private Date moodWordsTime;

	// User Summary
	private Integer informCount;

	private Integer favorCount;

	private Integer publishCount;

	private Integer idolCount;

	private Integer fansCount;

	// Babys
	private List<UserBabyVo> babyList;

	// BindAccounts
	private List<UserBindAccountVo> bindAccountList;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public String getHeadImgRes() {
		return headImgRes;
	}

	public void setHeadImgRes(String headImgRes) {
		this.headImgRes = headImgRes;
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

	public Integer getInformCount() {
		return informCount;
	}

	public void setInformCount(Integer informCount) {
		this.informCount = informCount;
	}

	public Integer getFavorCount() {
		return favorCount;
	}

	public void setFavorCount(Integer favorCount) {
		this.favorCount = favorCount;
	}

	public Integer getPublishCount() {
		return publishCount;
	}

	public void setPublishCount(Integer publishCount) {
		this.publishCount = publishCount;
	}

	public Integer getIdolCount() {
		return idolCount;
	}

	public void setIdolCount(Integer idolCount) {
		this.idolCount = idolCount;
	}

	public Integer getFansCount() {
		return fansCount;
	}

	public void setFansCount(Integer fansCount) {
		this.fansCount = fansCount;
	}

	public List<UserBabyVo> getBabyList() {
		return babyList;
	}

	public void setBabyList(List<UserBabyVo> babyList) {
		this.babyList = babyList;
	}

	public List<UserBindAccountVo> getBindAccountList() {
		return bindAccountList;
	}

	public void setBindAccountList(List<UserBindAccountVo> bindAccountList) {
		this.bindAccountList = bindAccountList;
	}
}
