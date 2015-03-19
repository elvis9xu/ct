package com.xjd.ct.biz.bo;

import java.util.Date;

public class ServiceBo extends BaseBo {
	private String serviceName;

	private String serviceVersion;

	private boolean loginFlag;

	private boolean maintainFlag;

	private String maintainMsg;

	private boolean validFlag;

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

	public boolean isLoginFlag() {
		return loginFlag;
	}

	public void setLoginFlag(boolean loginFlag) {
		this.loginFlag = loginFlag;
	}

	public boolean isMaintainFlag() {
		return maintainFlag;
	}

	public void setMaintainFlag(boolean maintainFlag) {
		this.maintainFlag = maintainFlag;
	}

	public String getMaintainMsg() {
		return maintainMsg;
	}

	public void setMaintainMsg(String maintainMsg) {
		this.maintainMsg = maintainMsg;
	}

	public boolean isValidFlag() {
		return validFlag;
	}

	public void setValidFlag(boolean validFlag) {
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