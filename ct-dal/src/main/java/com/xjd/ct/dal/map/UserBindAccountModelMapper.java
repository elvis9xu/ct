package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.UserBindAccountModel;
import com.xjd.ct.dal.dos.UserBindAccountModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBindAccountModelMapper {
    int countByExample(UserBindAccountModelExample example);

    int deleteByExample(UserBindAccountModelExample example);

    int deleteByPrimaryKey(Long accountId);

    int insert(UserBindAccountModel record);

    int insertSelective(UserBindAccountModel record);

    List<UserBindAccountModel> selectByExample(UserBindAccountModelExample example);

    UserBindAccountModel selectByPrimaryKey(Long accountId);

    int updateByExampleSelective(@Param("record") UserBindAccountModel record, @Param("example") UserBindAccountModelExample example);

    int updateByExample(@Param("record") UserBindAccountModel record, @Param("example") UserBindAccountModelExample example);

    int updateByPrimaryKeySelective(UserBindAccountModel record);

    int updateByPrimaryKey(UserBindAccountModel record);
}