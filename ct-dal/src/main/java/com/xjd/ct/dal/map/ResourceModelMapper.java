package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.ResourceModel;
import com.xjd.ct.dal.dos.ResourceModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResourceModelMapper {
    int countByExample(ResourceModelExample example);

    int deleteByExample(ResourceModelExample example);

    int deleteByPrimaryKey(String resId);

    int insert(ResourceModel record);

    int insertSelective(ResourceModel record);

    List<ResourceModel> selectByExample(ResourceModelExample example);

    ResourceModel selectByPrimaryKey(String resId);

    int updateByExampleSelective(@Param("record") ResourceModel record, @Param("example") ResourceModelExample example);

    int updateByExample(@Param("record") ResourceModel record, @Param("example") ResourceModelExample example);

    int updateByPrimaryKeySelective(ResourceModel record);

    int updateByPrimaryKey(ResourceModel record);
}