package com.xjd.ct.app.biz;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjd.ct.app.view.vo.AgeBracketVo;
import com.xjd.ct.app.view.vo.SubscribeVo;
import com.xjd.ct.dal.dao.SubscribeBizDao;
import com.xjd.ct.dal.dos.AgeBracketModel;
import com.xjd.ct.dal.dos.SubscribeModel;

/**
 * 网关特有与订阅相关的业务
 *
 * @author elvis.xu
 * @since 2015-03-30 23:06
 */
@Service
public class SubscribeBiz {
	@Autowired
	SubscribeBizDao subscribeBizDao;

	public List<SubscribeVo> listSubscriptions() {
		List<SubscribeModel> subscribeModelList = subscribeBizDao.selectSubscribeModel();

		List<SubscribeVo> subscribeVoList = new ArrayList<SubscribeVo>(subscribeModelList.size());
		for (SubscribeModel subscribeModel : subscribeModelList) {
			SubscribeVo vo = new SubscribeVo();
			BeanUtils.copyProperties(subscribeModel, vo);
			subscribeVoList.add(vo);
		}
		return subscribeVoList;
	}

	public List<AgeBracketVo> listAgeBrackets() {
		List<AgeBracketModel> ageBracketModelList = subscribeBizDao.selectAgeBracketModel();

		List<AgeBracketVo> ageBracketVoList = new ArrayList<AgeBracketVo>(ageBracketModelList.size());
		for (AgeBracketModel ageBracketModel : ageBracketModelList) {
			AgeBracketVo vo = new AgeBracketVo();
			BeanUtils.copyProperties(ageBracketModel, vo);
			ageBracketVoList.add(vo);
		}
		return ageBracketVoList;
	}

	public List<SubscribeVo> listSubscriptionsOfUser(Long userId) {
		List<SubscribeModel> subscribeModelList = subscribeBizDao.selectSubscribeModelOfUser(userId);

		List<SubscribeVo> subscribeVoList = new ArrayList<SubscribeVo>(subscribeModelList.size());
		for (SubscribeModel subscribeModel : subscribeModelList) {
			SubscribeVo vo = new SubscribeVo();
			BeanUtils.copyProperties(subscribeModel, vo);
			subscribeVoList.add(vo);
		}
		return subscribeVoList;
	}

	public List<AgeBracketVo> listAgeBracketsOfUser(Long userId) {
		List<AgeBracketModel> ageBracketModelList = subscribeBizDao.selectAgeBracketModelOfUser(userId);

		List<AgeBracketVo> ageBracketVoList = new ArrayList<AgeBracketVo>(ageBracketModelList.size());
		for (AgeBracketModel ageBracketModel : ageBracketModelList) {
			AgeBracketVo vo = new AgeBracketVo();
			BeanUtils.copyProperties(ageBracketModel, vo);
			ageBracketVoList.add(vo);
		}
		return ageBracketVoList;
	}
}
