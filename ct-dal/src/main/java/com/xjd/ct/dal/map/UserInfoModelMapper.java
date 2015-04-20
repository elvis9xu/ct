package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.UserInfoModel;
import com.xjd.ct.dal.dos.UserInfoModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfoModelMapper {
    int countByExample(UserInfoModelExample example);

    int deleteByExample(UserInfoModelExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(UserInfoModel record);

    int insertSelective(UserInfoModel record);

    List<UserInfoModel> selectByExample(UserInfoModelExample example);

    UserInfoModel selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") UserInfoModel record, @Param("example") UserInfoModelExample example);

    int updateByExample(@Param("record") UserInfoModel record, @Param("example") UserInfoModelExample example);

    int updateByPrimaryKeySelective(UserInfoModel record);

    int updateByPrimaryKey(UserInfoModel record);
}