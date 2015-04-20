package com.xjd.ct.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dos.ResourceModel;
import com.xjd.ct.dal.map.ResourceModelMapper;

/**
 * 网关特有与资源相关的DAO
 * @author elvis.xu
 * @since 2015-03-26 23:19
 */
@Repository
@Transactional
public class AppResourceDao {
	@Autowired
	ResourceModelMapper resourceModelMapper;

	public ResourceModel selectResourceModelByResId(String resId) {
		return resourceModelMapper.selectByPrimaryKey(resId);
	}
}
