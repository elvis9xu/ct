package com.xjd.ct.dal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dos.ResourceModel;
import com.xjd.ct.dal.dos.ResourceModelExample;
import com.xjd.ct.dal.dos.UserResourceRsModel;
import com.xjd.ct.dal.dos.UserResourceRsModelKey;
import com.xjd.ct.dal.map.ResourceModelMapper;
import com.xjd.ct.dal.map.UserResourceRsModelMapper;
import com.xjd.ct.utl.QueryResultUtil;

/**
 * 资源DAO
 * 
 * @author elvis.xu
 * @since 2015-4-8 下午1:28:44
 */
@Repository
@Transactional
public class ResourceDao {
	@Autowired
	ResourceModelMapper resourceModelMapper;
	@Autowired
	UserResourceRsModelMapper userResourceRsModelMapper;

	public ResourceModel selectResourceByMd5AndFormat(String md5, String format) {
		ResourceModelExample example = new ResourceModelExample();
		example.or().andResMd5EqualTo(md5).andResFormatEqualTo(format);

		List<ResourceModel> list = resourceModelMapper.selectByExample(example);
		QueryResultUtil.assertReturn0Or1(list, md5, format);

		return list.isEmpty() ? null : list.get(0);
	}

	public int insertResource(ResourceModel resourceModel) {
		return resourceModelMapper.insert(resourceModel);
	}

	public UserResourceRsModel selectUserResourceRsByUserIdAndResId(Long userId, String resId) {
		UserResourceRsModelKey key = new UserResourceRsModelKey();
		key.setUserId(userId);
		key.setResId(resId);
		return userResourceRsModelMapper.selectByPrimaryKey(key);
	}

	public int insertUserResourceRs(UserResourceRsModel userResourceRsModel) {
		return userResourceRsModelMapper.insert(userResourceRsModel);
	}

	public ResourceModel selectResourceByResId(String resId) {
		return resourceModelMapper.selectByPrimaryKey(resId);
	}
}
