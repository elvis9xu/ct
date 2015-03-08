package com.xjd.ct.dal.mapper;

import com.xjd.ct.dal.model.ServiceDo;

public interface ServiceMapper {

    int insert(ServiceDo record);

    int insertSelective(ServiceDo record);

    ServiceDo selectByServiceNameAndVersion(String serviceName, String serviceVersion);
}