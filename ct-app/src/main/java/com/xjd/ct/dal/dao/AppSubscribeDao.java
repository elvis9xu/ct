package com.xjd.ct.dal.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
 * @since 2015-03-30 23:29
 */
@Repository
@Transactional
public class AppSubscribeDao {
	@Autowired
	SubscribeModelMapper subscribeModelMapper;
	@Autowired
	AgeBracketModelMapper ageBracketModelMapper;
	@Autowired
	UserSubscribeModelMapper userSubscribeModelMapper;
	@Autowired
	UserAgeBracketResModelMapper userAgeBracketResModelMapper;

	public List<SubscribeModel> selectSubscribeModel() {
		return subscribeModelMapper.selectByExample(new SubscribeModelExample());
	}

	public List<AgeBracketModel> selectAgeBracketModel() {
		return ageBracketModelMapper.selectByExample(new AgeBracketModelExample());
	}

	public List<SubscribeModel> selectSubscribeModelOfUser(Long userId) {
		UserSubscribeModelExample example = new UserSubscribeModelExample();
		example.or().andUserIdEqualTo(userId);
		List<UserSubscribeModel> userSubscribeModelList = userSubscribeModelMapper.selectByExample(example);

		if (userSubscribeModelList.isEmpty()) {
			return Collections.emptyList();
		}

		List<Long> idList = new ArrayList<Long>(userSubscribeModelList.size());
		for (UserSubscribeModel userSubscribeModel : userSubscribeModelList) {
			idList.add(userSubscribeModel.getSubscribeId());
		}

		SubscribeModelExample subscribeModelExample = new SubscribeModelExample();
		subscribeModelExample.or().andSubscribeIdIn(idList);
		return subscribeModelMapper.selectByExample(subscribeModelExample);
	}

	public List<AgeBracketModel> selectAgeBracketModelOfUser(Long userId) {
		UserAgeBracketResModelExample example = new UserAgeBracketResModelExample();
		example.or().andUserIdEqualTo(userId);
		List<UserAgeBracketResModel> userAgeBracketResModelList = userAgeBracketResModelMapper.selectByExample(example);

		if (userAgeBracketResModelList.isEmpty()) {
			return Collections.emptyList();
		}

		List<Long> idList = new ArrayList<Long>(userAgeBracketResModelList.size());
		for (UserAgeBracketResModel userAgeBracketResModel : userAgeBracketResModelList) {
			idList.add(userAgeBracketResModel.getAgeBracketId());
		}

		AgeBracketModelExample ageBracketModelExample = new AgeBracketModelExample();
		ageBracketModelExample.or().andAgeBracketIdIn(idList);
		return ageBracketModelMapper.selectByExample(ageBracketModelExample);
	}
}
