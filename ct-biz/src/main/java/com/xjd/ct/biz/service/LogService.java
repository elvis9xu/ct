package com.xjd.ct.biz.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dao.LogDao;

/**
 * Log管理
 * @author elvis.xu
 * @since 2015-02-25 15:06
 */
@Service
public class LogService {

	@Autowired
	LogDao logDao;

	/**
	 * 服务请求日志记录
	 * @param userIp
	 * @param userId
	 * @param token
	 * @param serviceName
	 * @param serviceVersion
	 * @param requestTimestamp
	 */
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void serviceLog(String userIp, Long userId, String token, String serviceName, String serviceVersion, Date requestTimestamp) {
		logDao.serviceLog(userIp, userId, token, serviceName, serviceVersion, requestTimestamp);
	}
}
