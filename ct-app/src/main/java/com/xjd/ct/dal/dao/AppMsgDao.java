package com.xjd.ct.dal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dos.MsgInformModel;
import com.xjd.ct.dal.dos.MsgInformModelExample;
import com.xjd.ct.dal.map.MsgInformModelMapper;

/**
 * 网关特有与消息相关的Dao
 * @author elvis.xu
 * @since 2015-03-26 21:43
 */
@Repository
@Transactional
public class AppMsgDao {
	@Autowired
	MsgInformModelMapper msgInformModelMapper;

	public List<MsgInformModel> selectMsgInformByUserIdAndPage(Long userId, long offset, int limit) {
		MsgInformModelExample example = new MsgInformModelExample();
		example.or().andUserIdEqualTo(userId);
		example.setOrderByClause("inform_id desc");
		example.setOffsetAndLimit(offset - 1, limit); // mysql的offset从0开始

		return msgInformModelMapper.selectByExample(example);
	}
}
