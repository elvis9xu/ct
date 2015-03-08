package com.xjd.ct.dal.model;

import java.util.Date;

public class ServiceDo extends BaseDo {
	private String serviceName;

	private String serviceVersion;

	private String loginFlag;

	private String maintainFlag;

	private String maintainMsg;

	private String validFlag;

	private Date addTime;

	private Date updTime;

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceVersion() {
		return serviceVersion;
	}

	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
	}

	public String getLoginFlag() {
		return loginFlag;
	}

	public void setLoginFlag(String loginFlag) {
		this.loginFlag = loginFlag;
	}

	public String getMaintainFlag() {
		return maintainFlag;
	}

	public void setMaintainFlag(String maintainFlag) {
		this.maintainFlag = maintainFlag;
	}

	public String getMaintainMsg() {
		return maintainMsg;
	}

	public void setMaintainMsg(String maintainMsg) {
		this.maintainMsg = maintainMsg;
	}

	public String getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(String validFlag) {
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