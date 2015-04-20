package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.UserBabyModel;
import com.xjd.ct.dal.dos.UserBabyModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBabyModelMapper {
    int countByExample(UserBabyModelExample example);

    int deleteByExample(UserBabyModelExample example);

    int deleteByPrimaryKey(Long babyId);

    int insert(UserBabyModel record);

    int insertSelective(UserBabyModel record);

    List<UserBabyModel> selectByExample(UserBabyModelExample example);

    UserBabyModel selectByPrimaryKey(Long babyId);

    int updateByExampleSelective(@Param("record") UserBabyModel record, @Param("example") UserBabyModelExample example);

    int updateByExample(@Param("record") UserBabyModel record, @Param("example") UserBabyModelExample example);

    int updateByPrimaryKeySelective(UserBabyModel record);

    int updateByPrimaryKey(UserBabyModel record);
}