package com.xjd.ct.app.biz;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.app.view.vo.MsgInformVo;
import com.xjd.ct.dal.dao.AppMsgDao;
import com.xjd.ct.dal.dos.MsgInformModel;

/**
 * 网关特有与消息相关的业务
 *
 * @author elvis.xu
 * @since 2015-03-26 21:41
 */
@Service
public class MsgBiz {
	@Autowired
	AppMsgDao appMsgDao;

	@Transactional(readOnly = true)
	public List<MsgInformVo> listMsgs(Long userId, long offset, int limit) {
		List<MsgInformModel> msgInformModelList = appMsgDao.selectMsgInformByUserIdAndPage(userId, offset, limit);

		List<MsgInformVo> msgInformVoList = new ArrayList<MsgInformVo>(msgInformModelList.size());
		for (MsgInformModel msgInformModel : msgInformModelList) {
			MsgInformVo msgInformVo = new MsgInformVo();
			BeanUtils.copyProperties(msgInformModel, msgInformVo);
			msgInformVoList.add(msgInformVo);
		}

		return msgInformVoList;
	}
}
