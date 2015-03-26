package com.xjd.ct.dal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dos.UserIdolModel;
import com.xjd.ct.dal.dos.UserIdolModelExample;
import com.xjd.ct.dal.dos.UserIdolModelKey;
import com.xjd.ct.dal.map.UserIdolModelMapper;

/**
 * 关注Dao
 * 
 * @author elvis.xu
 * @since 2015-3-26 下午2:19:50
 */
@Repository
@Transactional
public class IdolDao {
	@Autowired
	UserIdolModelMapper userIdolModelMapper;

	/**
	 * 查询关注信息
	 * 
	 * @param userId
	 * @param idolUserId
	 * @return
	 */
	public UserIdolModel selectUserIdolByUserIdAndIdolUserId(Long userId, Long idolUserId) {
		UserIdolModelKey key = new UserIdolModelKey();
		key.setUserId(userId);
		key.setIdolUserId(idolUserId);

		return userIdolModelMapper.selectByPrimaryKey(key);
	}

	/**
	 * 插入一条关注信息
	 * 
	 * @param userIdolModel
	 * @return
	 */
	public int insertUserIdol(UserIdolModel userIdolModel) {
		return userIdolModelMapper.insert(userIdolModel);
	}

	/**
	 * 删除一条关注信息
	 * 
	 * @param userId
	 * @param idolUserId
	 * @return
	 */
	public int deleteUserIdolByUserIdAndIdolUserId(Long userId, Long idolUserId) {
		UserIdolModelKey key = new UserIdolModelKey();
		key.setUserId(userId);
		key.setIdolUserId(idolUserId);
		return userIdolModelMapper.deleteByPrimaryKey(key);
	}

	/**
	 * 查询用户的所有关注信息
	 * 
	 * @param userId
	 * @return
	 */
	public List<UserIdolModel> selectUserIdolByUserId(Long userId) {
		UserIdolModelExample example = new UserIdolModelExample();
		example.or().andUserIdEqualTo(userId);

		return userIdolModelMapper.selectByExample(example);
	}
}
