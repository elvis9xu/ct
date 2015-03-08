package com.xjd.ct.utl.respcode;

/**
 * <pre>
 * 返回码
 * 0000       	成功
 * 0001 ~ 0100	基础公用
 * 0101 ~ 0200	用户相关
 * 0201 ~ 0300	XXXXXXXXXX
 * 0301 ~ 0400	XXXXXXXXXX
 * 0401 ~ 0500	XXXXXXXXXX
 * 9901 ~ 9999	系统错误
 * </pre>
 * 
 * @author elvis.xu
 * @since 2014-12-18
 */
public interface RespCode {

	/** 成功 */
	String RESP_0000 = "0000";

	// ==== 0001 ~ 0100	基础公用  ==== //
	/** 参数({0})不能为空 */
	String RESP_0001 = "0001";
	
	/** 参数({0})格式错误: {1} */
	String RESP_0002 = "0002";
	
	/** 参数({0})必须为有效的枚举值 : {1}*/
	String RESP_0003 = "0003";

	/** 请求必须签名 */
	String RESP_0010 = "0010";

	/** 请求签名有误 */
	String RESP_0011 = "0011";

	// ==== 0101 ~ 0200	用户相关  ==== //
	/** 无效的TOKEN */
	String RESP_0101 = "0101";
	/** 用户不存在 */
	String RESP_0110 = "0110";
	/** 您尚未登录 */
	String RESP_0111 = "0111";

	// ==== 9901 ~ 9999	系统错误  ==== //

	/** 无此服务 */
	String RESP_9980 = "9980";
	/** 服务不可用 */
	String RESP_9981 = "9981";
	/** 服务维护中: 显示维护消息 */
	String RESP_9982 = "9982";

	/** 内部错误,请稍后再试或联系管理员 */
	String RESP_9999 = "9999";
}
