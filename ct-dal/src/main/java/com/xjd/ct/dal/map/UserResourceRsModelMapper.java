package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.UserResourceRsModel;
import com.xjd.ct.dal.dos.UserResourceRsModelExample;
import com.xjd.ct.dal.dos.UserResourceRsModelKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserResourceRsModelMapper {
    int countByExample(UserResourceRsModelExample example);

    int deleteByExample(UserResourceRsModelExample example);

    int deleteByPrimaryKey(UserResourceRsModelKey key);

    int insert(UserResourceRsModel record);

    int insertSelective(UserResourceRsModel record);

    List<UserResourceRsModel> selectByExample(UserResourceRsModelExample example);

    UserResourceRsModel selectByPrimaryKey(UserResourceRsModelKey key);

    int updateByExampleSelective(@Param("record") UserResourceRsModel record, @Param("example") UserResourceRsModelExample example);

    int updateByExample(@Param("record") UserResourceRsModel record, @Param("example") UserResourceRsModelExample example);

    int updateByPrimaryKeySelective(UserResourceRsModel record);

    int updateByPrimaryKey(UserResourceRsModel record);
}