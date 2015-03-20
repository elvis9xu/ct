package com.xjd.ct.biz.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjd.ct.biz.bo.ServiceBo;
import com.xjd.ct.dal.dao.ServiceDao;
import com.xjd.ct.dal.dos.ServiceModel;

/**
 * Service的管理
 * 
 * @author elvis.xu
 * @since 2015-03-02 19:50
 */
@Service
public class ServiceService {

	@Autowired
	ServiceDao serviceDao;

	/**
	 * 根据name和version查询Service配置
	 * 
	 * @param serviceName
	 * @param serviceVersion
	 * @return
	 */
	public ServiceBo queryServiceByNameAndVersion(String serviceName, String serviceVersion) {
		ServiceModel serviceDo = serviceDao.selectByNameAndVersion(serviceName, serviceVersion);

		return transferServiceDoToServiceBo(serviceDo);
	}

	/**
	 * DO -> BO
	 * 
	 * @param serviceDo
	 * @return
	 */
	public static ServiceBo transferServiceDoToServiceBo(ServiceModel serviceDo) {
		if (serviceDo == null) {
			return null;
		}
		ServiceBo serviceBo = new ServiceBo();
		BeanUtils.copyProperties(serviceDo, serviceBo);
		return serviceBo;
	}
}
