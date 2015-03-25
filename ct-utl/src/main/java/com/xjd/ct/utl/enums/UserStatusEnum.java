package com.xjd.ct.utl.enums;

/**
 * 用户状态
 * 
 * @author elvis.xu
 * @since 2014-9-18
 */
public enum UserStatusEnum {

	NORMAL((byte) 0, "正常"), LOCKED((byte) 1, "锁定"), NON_ACTIVE((byte) 2, "未激活");

	byte code;
	String desc;

	UserStatusEnum(byte code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public byte getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	public String toString() {
		return UserStatusEnum.class.getSimpleName() + "[code=" + code + ", desc=" + desc + "]";
	}

	public static UserStatusEnum valueOfCode(Byte code) {
		if (code == null) {
			return null;
		}
		for (UserStatusEnum e : UserStatusEnum.values()) {
			if (e.getCode() == code.byteValue()) {
				return e;
			}
		}
		return null;
	}

	public static boolean validCode(Byte code) {
		if (valueOfCode(code) == null) {
			return false;
		}
		return true;
	}

}
