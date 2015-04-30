package com.xjd.ct.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dos.ObjectResourceModel;
import com.xjd.ct.dal.dos.ObjectResourceModelExample;
import com.xjd.ct.dal.map.ObjectResourceModelMapper;

/**
 * @author elvis.xu
 * @since 2015-04-21 00:41
 */
@Repository
@Transactional
public class ObjectResourceDao {
	@Autowired
	ObjectResourceModelMapper objectResourceModelMapper;

	public int deleteByObjectTypeAndObjectRefId(byte objectType, Long objectRefId) {
		ObjectResourceModelExample example = new ObjectResourceModelExample();
		example.or().andObjectTypeEqualTo(objectType).andObjectRefIdEqualTo(objectRefId);

		return objectResourceModelMapper.deleteByExample(example);
	}

	public int insert(ObjectResourceModel objectResourceModel) {
		return objectResourceModelMapper.insert(objectResourceModel);
	}
}
