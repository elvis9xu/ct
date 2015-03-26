package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.UserSubscribeModel;
import com.xjd.ct.dal.dos.UserSubscribeModelExample;
import com.xjd.ct.dal.dos.UserSubscribeModelKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSubscribeModelMapper {
    int countByExample(UserSubscribeModelExample example);

    int deleteByExample(UserSubscribeModelExample example);

    int deleteByPrimaryKey(UserSubscribeModelKey key);

    int insert(UserSubscribeModel record);

    int insertSelective(UserSubscribeModel record);

    List<UserSubscribeModel> selectByExample(UserSubscribeModelExample example);

    UserSubscribeModel selectByPrimaryKey(UserSubscribeModelKey key);

    int updateByExampleSelective(@Param("record") UserSubscribeModel record, @Param("example") UserSubscribeModelExample example);

    int updateByExample(@Param("record") UserSubscribeModel record, @Param("example") UserSubscribeModelExample example);

    int updateByPrimaryKeySelective(UserSubscribeModel record);

    int updateByPrimaryKey(UserSubscribeModel record);
}