package com.xjd.ct.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dos.*;
import com.xjd.ct.dal.map.AgeBracketModelMapper;
import com.xjd.ct.dal.map.SubscribeModelMapper;
import com.xjd.ct.dal.map.UserAgeBracketResModelMapper;
import com.xjd.ct.dal.map.UserSubscribeModelMapper;

/**
 * @author elvis.xu
 * @since 2015-03-30 23:47
 */
@Repository
@Transactional
public class SubscribeDao {
	@Autowired
	SubscribeModelMapper subscribeModelMapper;
	@Autowired
	UserSubscribeModelMapper userSubscribeModelMapper;
	@Autowired
	AgeBracketModelMapper ageBracketModelMapper;
	@Autowired
	UserAgeBracketResModelMapper userAgeBracketResModelMapper;

	public SubscribeModel selectSubscribeModelBySubscribeId(Long subscribeId) {
		return subscribeModelMapper.selectByPrimaryKey(subscribeId);
	}

	public UserSubscribeModel selectUserSubscribeModelByUserIdAndSubscribeId(Long userId, Long subscribeId) {
		UserSubscribeModelKey key = new UserSubscribeModelKey();
		key.setUserId(userId);
		key.setSubscribeId(subscribeId);
		return userSubscribeModelMapper.selectByPrimaryKey(key);
	}

	public int insertUserSubscribeModel(UserSubscribeModel userSubscribeModel) {
		return userSubscribeModelMapper.insert(userSubscribeModel);
	}

	public int deleteUserSubscribeModelByUserIdAndSubscribeId(Long userId, Long subscribeId) {
		UserSubscribeModelKey key = new UserSubscribeModelKey();
		key.setUserId(userId);
		key.setSubscribeId(subscribeId);
		return userSubscribeModelMapper.deleteByPrimaryKey(key);
	}

	public AgeBracketModel selectAgeBracketModelByAgeBracketId(Long ageBracketId) {
		return ageBracketModelMapper.selectByPrimaryKey(ageBracketId);
	}

	public UserAgeBracketResModel selectUserAgeBracketResModelByUserIdAndAgeBracketId(Long userId, Long ageBracketId) {
		UserAgeBracketResModelKey key = new UserAgeBracketResModelKey();
		key.setUserId(userId);
		key.setAgeBracketId(ageBracketId);
		return userAgeBracketResModelMapper.selectByPrimaryKey(key);
	}

	public int insertUserAgeBracketResModel(UserAgeBracketResModel userAgeBracketResModel) {
		return userAgeBracketResModelMapper.insert(userAgeBracketResModel);
	}

	public int deleteUserAgeBracketResModelByUserIdAndAgeBracketId(Long userId, Long ageBracketId) {
		UserAgeBracketResModelKey key = new UserAgeBracketResModelKey();
		key.setUserId(userId);
		key.setAgeBracketId(ageBracketId);
		return userAgeBracketResModelMapper.deleteByPrimaryKey(key);
	}
}
