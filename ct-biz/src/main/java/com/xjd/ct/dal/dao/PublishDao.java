package com.xjd.ct.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dos.PublishModel;
import com.xjd.ct.dal.map.PublishModelMapper;

@Repository
@Transactional
public class PublishDao {
	@Autowired
	PublishModelMapper publishModelMapper;

	public int insert(PublishModel publishModel) {
		return publishModelMapper.insert(publishModel);
	}

}
