package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.SubscribeModel;
import com.xjd.ct.dal.dos.SubscribeModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubscribeModelMapper {
    int countByExample(SubscribeModelExample example);

    int deleteByExample(SubscribeModelExample example);

    int deleteByPrimaryKey(Long subscribeId);

    int insert(SubscribeModel record);

    int insertSelective(SubscribeModel record);

    List<SubscribeModel> selectByExample(SubscribeModelExample example);

    SubscribeModel selectByPrimaryKey(Long subscribeId);

    int updateByExampleSelective(@Param("record") SubscribeModel record, @Param("example") SubscribeModelExample example);

    int updateByExample(@Param("record") SubscribeModel record, @Param("example") SubscribeModelExample example);

    int updateByPrimaryKeySelective(SubscribeModel record);

    int updateByPrimaryKey(SubscribeModel record);
}