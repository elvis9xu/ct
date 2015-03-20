package com.xjd.ct.biz.bo;

import java.util.Date;

/**
 * 接口信息
 */
public class ServiceBo extends BaseBo {
	private String name;

	private String version;

	private Byte needLoginFlag;

	private Byte inMaintainFlag;

	private String maintainMsg;

	private Byte validFlag;

	private Date addTime;

	private Date updTime;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Byte getNeedLoginFlag() {
		return needLoginFlag;
	}

	public void setNeedLoginFlag(Byte needLoginFlag) {
		this.needLoginFlag = needLoginFlag;
	}

	public Byte getInMaintainFlag() {
		return inMaintainFlag;
	}

	public void setInMaintainFlag(Byte inMaintainFlag) {
		this.inMaintainFlag = inMaintainFlag;
	}

	public String getMaintainMsg() {
		return maintainMsg;
	}

	public void setMaintainMsg(String maintainMsg) {
		this.maintainMsg = maintainMsg;
	}

	public Byte getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(Byte validFlag) {
		this.validFlag = validFlag;
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