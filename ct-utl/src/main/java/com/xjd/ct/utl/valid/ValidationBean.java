package com.xjd.ct.utl.valid;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

import com.xjd.ct.utl.enums.IdolOperEnum;
import com.xjd.ct.utl.enums.UserSexEnum;
import com.xjd.ct.utl.respcode.RespCode;
import com.xjd.ct.utl.valid.constraints.Date;
import com.xjd.ct.utl.valid.constraints.Date.DatePattern;

public class ValidationBean {

	@NotBlank(message = RespCode.RESP_0001)
	@Date(pattern = DatePattern.yyyyMMddHHmmssSSS)
	private String timestamp;

	@NotBlank(message = RespCode.RESP_0001)
	@Date(pattern = DatePattern.yyyyMMdd)
	private String babyBirth;

	@NotBlank(message = RespCode.RESP_0001)
	@Pattern(regexp = "^((13[0-9])|(14[5,7])|(15[^4,\\D])|(170)|(18[^4,\\D]))\\d{8}$", message = RespCode.RESP_0002)
	private String mobile;

	@NotBlank(message = RespCode.RESP_0001)
	@Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$", message = RespCode.RESP_0002)
	private String email;

	@NotBlank(message = RespCode.RESP_0001)
	@Pattern(regexp = "(^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$)|(^((13[0-9])|(14[5,7])|(15[^4,\\D])|(170)|(18[^4,\\D]))\\d{8}$)", message = RespCode.RESP_0120)
	private String username;

	@NotBlank(message = RespCode.RESP_0001)
	private String password;

	@NotBlank(message = RespCode.RESP_0001)
	@Digits(integer = 18, fraction = 0, message = RespCode.RESP_0002)
	private String userId;

	@NotBlank(message = RespCode.RESP_0001)
	@com.xjd.ct.utl.valid.constraints.Enum(enumClass = UserSexEnum.class)
	private String sex;

	@NotBlank(message = RespCode.RESP_0001)
	@com.xjd.ct.utl.valid.constraints.Enum(enumClass = UserSexEnum.class)
	private String babySex;

	@NotBlank(message = RespCode.RESP_0001)
	@com.xjd.ct.utl.valid.constraints.Enum(enumClass = IdolOperEnum.class)
	private String idolOper;

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBabyBirth() {
		return babyBirth;
	}

	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBabySex() {
		return babySex;
	}

	public void setBabySex(String babySex) {
		this.babySex = babySex;
	}

	public String getIdolOper() {
		return idolOper;
	}

	public void setIdolOper(String idolOper) {
		this.idolOper = idolOper;
	}
}
