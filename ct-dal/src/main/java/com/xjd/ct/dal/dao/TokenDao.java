package com.xjd.ct.dal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dos.TokenModel;
import com.xjd.ct.dal.dos.TokenModelExample;
import com.xjd.ct.dal.map.TokenModelMapper;
import com.xjd.ct.dal.util.QueryResultUtil;

@Repository
@Transactional
public class TokenDao {

	@Autowired
	TokenModelMapper tokenModelMapper;

	/**
	 * 
	 * @param userIp
	 * @param userId
	 * @return
	 */
	public TokenModel selectByUserIpAndUserId(String userIp, Long userId) {
		TokenModelExample example = new TokenModelExample();
		example.or().andUserIpEqualTo(userIp).andUserIdEqualTo(userId);
		List<TokenModel> list = tokenModelMapper.selectByExample(example);

		QueryResultUtil.assertReturn0Or1(list, userIp, userId);
		return list.size() == 0 ? null : list.get(0);
	}

	/**
	 * 
	 * @param userIp
	 * @param userId
	 */
	public int deleteByUserIpAndUserId(String userIp, Long userId) {
		TokenModelExample example = new TokenModelExample();
		example.or().andUserIpEqualTo(userIp).andUserIdEqualTo(userId);
		return tokenModelMapper.deleteByExample(example);
	}

	/**
	 * 插入新的TOKEN记录
	 * 
	 * @param tokenModel
	 * @return
	 */
	public int insert(TokenModel tokenModel) {
		return tokenModelMapper.insert(tokenModel);
	}

	/**
	 * 
	 * @param userId
	 * @return
	 */
	public Object selectByUserId(Long userId) {
		TokenModelExample example = new TokenModelExample();
		example.or().andUserIdEqualTo(userId);
		List<TokenModel> list = tokenModelMapper.selectByExample(example);

		QueryResultUtil.assertReturn0Or1(list, userId);
		return list.size() == 0 ? null : list.get(0);
	}

	/**
	 * 
	 * @param userId
	 * @return
	 */
	public int deleteByUserId(Long userId) {
		TokenModelExample example = new TokenModelExample();
		example.or().andUserIdEqualTo(userId);
		return tokenModelMapper.deleteByExample(example);
	}

	/**
	 * 
	 * @param token
	 * @return
	 */
	public TokenModel selectByToken(String token) {
		return tokenModelMapper.selectByPrimaryKey(token);
	}
}
