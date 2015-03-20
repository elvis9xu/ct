package com.xjd.ct.dal.dao;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dos.ServiceLogModel;
import com.xjd.ct.dal.map.ServiceLogModelMapper;

/**
 * @author elvis.xu
 * @since 2015-03-20 18:04
 */
@Repository
@Transactional
public class LogDao {

	@Autowired
	ServiceLogModelMapper serviceLogModelMapper;
	@Autowired
	SequenceDao sequenceDao;

	/**
	 * 插入一条接口调用日志
	 *
	 * @param userIp
	 * @param userId
	 * @param token
	 * @param serviceName
	 * @param serviceVersion
	 * @param requestTimestamp @return
	 */
	public int serviceLog(String userIp, Long userId, String token, String serviceName, String serviceVersion,
			Date requestTimestamp) {
		ServiceLogModel serviceLogModel = new ServiceLogModel();
		serviceLogModel.setLogId(sequenceDao.getSequence(SequenceDao.SEQ_SERVICE_LOG_ID));
		serviceLogModel.setUserIp(userIp);
		serviceLogModel.setUserId(userId);
		serviceLogModel.setToken(token);
		serviceLogModel.setServiceName(serviceName);
		serviceLogModel.setServiceVersion(serviceVersion);
		serviceLogModel.setRequestTime(requestTimestamp);

		return serviceLogModelMapper.insert(serviceLogModel);
	}
}
