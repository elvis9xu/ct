package com.xjd.ct.app.view.vo;

import java.util.Date;

/**
 * 资源对象
 * 
 * @author elvis.xu
 * @since 2015-03-26 22:54
 */
public class ResourceVo {
	private String resId;

	private String resContentType;

	private String resFormat;

	private Byte resForm;

	private String resPath;

	private String resMd5;

	private Long resSize;

	private String resCut1;

	private String resCut2;

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

	/** @return the resSize */
	public Long getResSize() {
		return resSize;
	}

	/** @param resSize the resSize to set */
	public void setResSize(Long resSize) {
		this.resSize = resSize;
	}

	/** @return the resCut1 */
	public String getResCut1() {
		return resCut1;
	}

	/** @param resCut1 the resCut1 to set */
	public void setResCut1(String resCut1) {
		this.resCut1 = resCut1;
	}

	/** @return the resCut2 */
	public String getResCut2() {
		return resCut2;
	}

	/** @param resCut2 the resCut2 to set */
	public void setResCut2(String resCut2) {
		this.resCut2 = resCut2;
	}

}
