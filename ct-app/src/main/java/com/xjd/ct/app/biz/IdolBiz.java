package com.xjd.ct.app.biz;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjd.ct.app.view.vo.UserForOtherVo;
import com.xjd.ct.dal.dao.IdolBizDao;
import com.xjd.ct.dal.dos.UserIdolModel;

/**
 * 网关特有与关注相关的业务
 * 
 * @author elvis.xu
 * @since 2015-3-26 下午3:09:08
 */
@Service
public class IdolBiz {
	@Autowired
	IdolBizDao idolBizDao;
	@Autowired
	UserBiz userBiz;

	/**
	 * 分页拉取关注的用户信息
	 * 
	 * @param userId
	 * @param offset
	 * @param limit
	 * @return
	 */
	public List<UserForOtherVo> listIdols(Long userId, int offset, int limit) {
		List<UserIdolModel> userIdolModelList = idolBizDao.selectUserIdolByUserIdAndPage(userId, offset, limit);

		List<UserForOtherVo> userForOtherVoList = new ArrayList<UserForOtherVo>(userIdolModelList.size());
		for (UserIdolModel userIdolModel : userIdolModelList) {
			UserForOtherVo userForOtherVo = userBiz.getUserInfoForOther(userIdolModel.getIdolUserId());
			userForOtherVoList.add(userForOtherVo);
		}

		return userForOtherVoList;
	}
}
