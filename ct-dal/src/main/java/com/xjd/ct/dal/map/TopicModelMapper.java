package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.TopicModel;
import com.xjd.ct.dal.dos.TopicModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TopicModelMapper {
    int countByExample(TopicModelExample example);

    int deleteByExample(TopicModelExample example);

    int deleteByPrimaryKey(Long topicId);

    int insert(TopicModel record);

    int insertSelective(TopicModel record);

    List<TopicModel> selectByExample(TopicModelExample example);

    TopicModel selectByPrimaryKey(Long topicId);

    int updateByExampleSelective(@Param("record") TopicModel record, @Param("example") TopicModelExample example);

    int updateByExample(@Param("record") TopicModel record, @Param("example") TopicModelExample example);

    int updateByPrimaryKeySelective(TopicModel record);

    int updateByPrimaryKey(TopicModel record);
}