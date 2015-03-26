package com.xjd.ct.dal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dos.UserIdolModel;
import com.xjd.ct.dal.dos.UserIdolModelExample;
import com.xjd.ct.dal.map.UserIdolModelMapper;

/**
 * 网关特有与关注相关的Dao
 * 
 * @author elvis.xu
 * @since 2015-3-26 下午4:42:03
 */
@Repository
@Transactional
public class IdolBizDao {
	@Autowired
	UserIdolModelMapper userIdolModelMapper;

	public List<UserIdolModel> selectUserIdolByUserIdAndPage(Long userId, long offset, int limit) {
		UserIdolModelExample example = new UserIdolModelExample();
		example.or().andUserIdEqualTo(userId);
		example.setOrderByClause("add_time desc");
		example.setOffsetAndLimit(offset - 1, limit); // mysql的offset从0开始

		return userIdolModelMapper.selectByExample(example);
	}
}
