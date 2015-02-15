package com.xjd.mol.util;

import org.apache.commons.lang3.StringUtils;

public abstract class HydraUtil {

	/**
	 * <pre>
	 * 是否为密码项
	 * </pre>
	 * 
	 * @param name
	 * @return
	 */
	public static boolean isPwdField(String name) {
//		if (!AppContext.isEnvProduct()) { // 非生产环境打印密码
//			return false;
//		}
		
		name = StringUtils.trimToNull(name);

		if (name != null && (name.endsWith("pwd") || name.endsWith("Pwd") || name.endsWith("password") || name.endsWith("Password"))) {
			return true;
		}
		return false;
	}

	/**
	 * <pre>
	 * 密码项的Mask
	 * </pre>
	 * 
	 * @return
	 */
	public static String getPwdMask() {
		return "[******]";
	}
}
