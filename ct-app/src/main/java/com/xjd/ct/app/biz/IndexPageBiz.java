package com.xjd.ct.app.biz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjd.ct.app.view.vo.BannerVo;
import com.xjd.ct.app.view.vo.ObjectVo;
import com.xjd.ct.app.view.vo.ResourceVo;
import com.xjd.ct.dal.dao.IndexPageBizDao;
import com.xjd.ct.dal.dao.ResourceBizDao;
import com.xjd.ct.dal.dos.BannerModel;
import com.xjd.ct.dal.dos.RecommendModel;
import com.xjd.ct.dal.dos.ResourceModel;

/**
 * @author elvis.xu
 * @since 2015-03-31 22:57
 */
@Service
public class IndexPageBiz {
	@Autowired
	ObjectBiz objectBiz;
	@Autowired
	IndexPageBizDao indexPageBizDao;
	@Autowired
	ResourceBizDao resourceBizDao;

	public List<BannerVo> listBanners() {
		List<BannerModel> bannerModelList = indexPageBizDao.selectBannerModel();

		List<BannerVo> list = new ArrayList<BannerVo>(bannerModelList.size());
		for (BannerModel bannerModel : bannerModelList) {
			BannerVo vo = new BannerVo();
			BeanUtils.copyProperties(bannerModel, vo);

			ResourceModel resourceModel = resourceBizDao.selectResourceModelByResId(bannerModel.getBannerRes());
			ResourceVo resourceVo = new ResourceVo();
			BeanUtils.copyProperties(resourceModel, resourceVo);
			vo.setResource(resourceVo);

			list.add(vo);
		}
		return list;
	}

	public List<ObjectVo> listRecommendObjects() {
		List<RecommendModel> recommendModelList = indexPageBizDao.selectRecommendModel();

		List<ObjectVo> list = new ArrayList<ObjectVo>(recommendModelList.size());
		for (RecommendModel recommendModel : recommendModelList) {
			ObjectVo vo = objectBiz.assemble(recommendModel.getObjectType(), recommendModel.getRecommendRefId());
			list.add(vo);
		}

		return list;
	}

	public List<ObjectVo> listObjectsOfSubscription(Long userId, Long subscribeId, Byte orderBy, Long offset,
			Integer count) {
		// FIXME 根据专题进行查询
		return Collections.emptyList();
	}
}
