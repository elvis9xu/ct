package com.xjd.ct.biz.bo;

import java.util.Date;

public class ResourceBo extends BaseBo {
	private String resId;

	private String resContentType;

	private String resFormat;

	private Byte resForm;

	private String resPath;

	private String resMd5;

	private Date addTime;

	private Date updTime;

	/** @return the resId */
	public String getResId() {
		return resId;
	}

	/** @param resId the resId to set */
	public void setResId(String resId) {
		this.resId = resId;
	}

	/** @return the resContentType */
	public String getResContentType() {
		return resContentType;
	}

	/** @param resContentType the resContentType to set */
	public void setResContentType(String resContentType) {
		this.resContentType = resContentType;
	}

	/** @return the resFormat */
	public String getResFormat() {
		return resFormat;
	}

	/** @param resFormat the resFormat to set */
	public void setResFormat(String resFormat) {
		this.resFormat = resFormat;
	}

	/** @return the resForm */
	public Byte getResForm() {
		return resForm;
	}

	/** @param resForm the resForm to set */
	public void setResForm(Byte resForm) {
		this.resForm = resForm;
	}

	/** @return the resPath */
	public String getResPath() {
		return resPath;
	}

	/** @param resPath the resPath to set */
	public void setResPath(String resPath) {
		this.resPath = resPath;
	}

	/** @return the resMd5 */
	public String getResMd5() {
		return resMd5;
	}

	/** @param resMd5 the resMd5 to set */
	public void setResMd5(String resMd5) {
		this.resMd5 = resMd5;
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
