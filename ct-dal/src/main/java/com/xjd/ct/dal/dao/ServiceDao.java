package com.xjd.ct.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dos.ServiceModel;
import com.xjd.ct.dal.dos.ServiceModelExample;
import com.xjd.ct.dal.dos.ServiceModelKey;
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
}
