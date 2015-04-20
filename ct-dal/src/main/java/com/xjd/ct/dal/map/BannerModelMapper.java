package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.BannerModel;
import com.xjd.ct.dal.dos.BannerModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BannerModelMapper {
    int countByExample(BannerModelExample example);

    int deleteByExample(BannerModelExample example);

    int deleteByPrimaryKey(Long bannerId);

    int insert(BannerModel record);

    int insertSelective(BannerModel record);

    List<BannerModel> selectByExample(BannerModelExample example);

    BannerModel selectByPrimaryKey(Long bannerId);

    int updateByExampleSelective(@Param("record") BannerModel record, @Param("example") BannerModelExample example);

    int updateByExample(@Param("record") BannerModel record, @Param("example") BannerModelExample example);

    int updateByPrimaryKeySelective(BannerModel record);

    int updateByPrimaryKey(BannerModel record);
}