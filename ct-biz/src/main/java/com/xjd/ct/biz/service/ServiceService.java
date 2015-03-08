package com.xjd.ct.biz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjd.ct.biz.model.ServiceBo;
import com.xjd.ct.dal.mapper.ServiceMapper;
import com.xjd.ct.dal.model.ServiceDo;
import com.xjd.ct.utl.enums.BoolEnum;

/**
 * Service的管理
 * 
 * @author elvis.xu
 * @since 2015-03-02 19:50
 */
@Service
public class ServiceService {

	@Autowired
	ServiceMapper serviceMapper;

	/**
	 * 根据name和version查询Service配置
	 * 
	 * @param serviceName
	 * @param serviceVersion
	 * @return
	 */
	public ServiceBo queryServiceByNameAndVersion(String serviceName, String serviceVersion) {
		ServiceDo serviceDo = serviceMapper.selectByServiceNameAndVersion(serviceName, serviceVersion);

		return transferServiceDoToServiceBo(serviceDo);
	}

	/**
	 * DO -> BO
	 * 
	 * @param serviceDo
	 * @return
	 */
	public static ServiceBo transferServiceDoToServiceBo(ServiceDo serviceDo) {
		if (serviceDo == null) {
			return null;
		}

		ServiceBo serviceBo = new ServiceBo();
		serviceBo.setServiceName(serviceDo.getServiceName());
		serviceBo.setServiceVersion(serviceDo.getServiceVersion());
		serviceBo.setAddTime(serviceDo.getAddTime());
		serviceBo.setUpdTime(serviceDo.getUpdTime());
		serviceBo.setLoginFlag(BoolEnum.parseCode(serviceDo.getLoginFlag()));
		serviceBo.setMaintainFlag(BoolEnum.parseCode(serviceDo.getMaintainFlag()));
		serviceBo.setMaintainMsg(serviceDo.getMaintainMsg());
		serviceBo.setValidFlag(BoolEnum.parseCode(serviceDo.getValidFlag()));
		return serviceBo;
	}
}
