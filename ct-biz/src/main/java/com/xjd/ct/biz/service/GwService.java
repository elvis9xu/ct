package com.xjd.ct.biz.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.biz.bo.ServiceBo;
import com.xjd.ct.biz.util.BeanTansferUtil;
import com.xjd.ct.dal.dao.ServiceDao;
import com.xjd.ct.dal.dos.ServiceModel;

/**
 * <pre>
 * 网关相关管理
 * 1. 网关接口控制
 * 2. 网关接口日志
 * 3. APP版本控制
 * </pre>
 * 
 * @author elvis.xu
 * @since 2015-3-26 下午12:06:34
 */
@Service
public class GwService {
	@Autowired
	ServiceDao serviceDao;

	/**
	 * 根据name和version查询Service配置
	 * 
	 * @param serviceName
	 * @param serviceVersion
	 * @return
	 */
	@Transactional(readOnly = true)
	public ServiceBo queryServiceByNameAndVersion(String serviceName, String serviceVersion) {
		ServiceModel serviceDo = serviceDao.selectByNameAndVersion(serviceName, serviceVersion);
		return BeanTansferUtil.transferServiceDoToServiceBo(serviceDo);
	}

	/**
	 * 服务请求日志记录
	 * 
	 * @param userIp
	 * @param userId
	 * @param token
	 * @param serviceName
	 * @param serviceVersion
	 * @param requestTimestamp
	 */
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void serviceLog(String userIp, Long userId, String token, String serviceName, String serviceVersion,
			Date requestTimestamp) {
		serviceDao.serviceLog(userIp, userId, token, serviceName, serviceVersion, requestTimestamp);
	}

}
