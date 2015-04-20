package com.xjd.ct.app.view.vo;

import java.util.Date;

/**
 * @author elvis.xu
 * @since 2015-04-20 23:53
 */
public class ObjectResourceVo extends ResourceVo {
	private Byte objectType;

	private Long objectRefId;

	private Byte forClass;

	private String forSubclass;

	private Date addTime;

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

	public Byte getForClass() {
		return forClass;
	}

	public void setForClass(Byte forClass) {
		this.forClass = forClass;
	}

	public String getForSubclass() {
		return forSubclass;
	}

	public void setForSubclass(String forSubclass) {
		this.forSubclass = forSubclass;
	}

	@Override
	public Date getAddTime() {
		return addTime;
	}

	@Override
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
}
