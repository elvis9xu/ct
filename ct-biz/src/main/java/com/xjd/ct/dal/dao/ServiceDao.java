package com.xjd.ct.dal.dao;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dos.ServiceLogModel;
import com.xjd.ct.dal.dos.ServiceModel;
import com.xjd.ct.dal.dos.ServiceModelKey;
import com.xjd.ct.dal.map.ServiceLogModelMapper;
import com.xjd.ct.dal.map.ServiceModelMapper;

/**
 * 接口数据Dao
 * 
 * @author elvis.xu
 * @since 2015-03-20 14:52
 */
@Repository
@Transactional
public class ServiceDao {
	@Autowired
	SequenceDao sequenceDao;
	@Autowired
	ServiceLogModelMapper serviceLogModelMapper;
	@Autowired
	ServiceModelMapper serviceModelMapper;

	/**
	 * 根据Name和Version查询接口信息
	 * 
	 * @param name
	 * @param version
	 * @return
	 */
	public ServiceModel selectByNameAndVersion(String name, String version) {
		ServiceModelKey key = new ServiceModelKey();
		key.setName(name);
		key.setVersion(version);

		return serviceModelMapper.selectByPrimaryKey(key);
	}

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
