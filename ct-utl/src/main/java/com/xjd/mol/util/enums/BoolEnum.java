package com.xjd.mol.util.enums;

/**
 * 布尔枚举
 * 
 * @author elvis.xu
 * @since 2014-9-18
 */
public enum BoolEnum {

	FALSE("0", "否")
	, TRUE("1", "是");

	String code;
	String desc;

	BoolEnum(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	public String toString() {
		return BoolEnum.class.getSimpleName() + "[code=" + code + ", desc=" + desc + "]";
	}

	public static BoolEnum valueOfCode(String code) {
		for (BoolEnum e : BoolEnum.values()) {
			if (e.getCode().equals(code)) {
				return e;
			}
		}
		return null;
	}

	public static boolean validCode(String code) {
		if (valueOfCode(code) == null) {
			return false;
		}
		return true;
	}
}
