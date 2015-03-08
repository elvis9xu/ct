package com.xjd.ct.biz.service;

import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Log管理
 * @author elvis.xu
 * @since 2015-02-25 15:06
 */
@Service
public class LogService {

	/**
	 * 服务请求日志记录
	 * @param userIp
	 * @param userId
	 * @param serviceName
	 * @param serviceVersion
	 * @param requestTimestamp
	 */
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void serviceLog(String userIp, String userId, String serviceName, String serviceVersion, Date requestTimestamp) {

	}
}
