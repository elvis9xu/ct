package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.RecommendModel;
import com.xjd.ct.dal.dos.RecommendModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecommendModelMapper {
    int countByExample(RecommendModelExample example);

    int deleteByExample(RecommendModelExample example);

    int deleteByPrimaryKey(Long recommendId);

    int insert(RecommendModel record);

    int insertSelective(RecommendModel record);

    List<RecommendModel> selectByExample(RecommendModelExample example);

    RecommendModel selectByPrimaryKey(Long recommendId);

    int updateByExampleSelective(@Param("record") RecommendModel record, @Param("example") RecommendModelExample example);

    int updateByExample(@Param("record") RecommendModel record, @Param("example") RecommendModelExample example);

    int updateByPrimaryKeySelective(RecommendModel record);

    int updateByPrimaryKey(RecommendModel record);
}