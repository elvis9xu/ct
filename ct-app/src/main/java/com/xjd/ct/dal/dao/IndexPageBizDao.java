package com.xjd.ct.dal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dos.BannerModel;
import com.xjd.ct.dal.dos.BannerModelExample;
import com.xjd.ct.dal.dos.RecommendModel;
import com.xjd.ct.dal.dos.RecommendModelExample;
import com.xjd.ct.dal.map.BannerModelMapper;
import com.xjd.ct.dal.map.RecommendModelMapper;

/**
 * @author elvis.xu
 * @since 2015-03-31 23:04
 */
@Repository
@Transactional
public class IndexPageBizDao {
	@Autowired
	BannerModelMapper bannerModelMapper;
	@Autowired
	RecommendModelMapper recommendModelMapper;

	public List<BannerModel> selectBannerModel() {
		return bannerModelMapper.selectByExample(new BannerModelExample());
	}

	public List<RecommendModel> selectRecommendModel() {
		return recommendModelMapper.selectByExample(new RecommendModelExample());
	}
}
