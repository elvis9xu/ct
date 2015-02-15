package com.xjd.mol.biz.context;

import java.util.HashMap;
import java.util.Map;

/**
 * 请求上下文
 * 
 * @author elvis.xu
 * @since 2014-12-1
 */
public class RequestContext {

	private static final String KEY_CLIENT_IP = RequestContext.class.getName() + ".client.ip";
	private static final String KEY_SERVICE_CLASS = RequestContext.class.getName() + ".service.class";
	private static final String KEY_SERVICE_METHOD = RequestContext.class.getName() + ".service.method";
	private static final String KEY_USER = RequestContext.class.getName() + ".user";

	protected static ThreadLocal<Map<String, Object>> requestThreadLocal = new ThreadLocal<Map<String, Object>>();

	private RequestContext() {
	}

	public static Map<String, Object> get() {
		Map<String, Object> map = requestThreadLocal.get();
		if (map == null) {
			map = new HashMap<String, Object>();
			requestThreadLocal.set(map);
		}
		return map;
	}

	public static void put(String key, Object val) {
		get().put(key, val);
	}

	public static Object get(String key) {
		return get().get(key);
	}

	public static String getAsString(String key) {
		return (String) get().get(key);
	}

	public static void putUser(Object userObj) {
		put(KEY_USER, userObj);
	}

	public static Object getUser() {
		return get(KEY_USER);
	}

	public static void putClientIp(String clientIp) {
		put(KEY_CLIENT_IP, clientIp);
	}

	public static String getClientIp() {
		return getAsString(KEY_CLIENT_IP);
	}

	public static void putServiceClass(String clazz) {
		put(KEY_SERVICE_CLASS, clazz);
	}

	public static String getServiceClass() {
		return getAsString(KEY_SERVICE_CLASS);
	}

	public static void putServiceMethod(String method) {
		put(KEY_SERVICE_METHOD, method);
	}

	public static String getServiceMethod() {
		return getAsString(KEY_SERVICE_METHOD);
	}

}
