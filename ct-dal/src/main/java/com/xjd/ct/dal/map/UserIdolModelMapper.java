package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.UserIdolModel;
import com.xjd.ct.dal.dos.UserIdolModelExample;
import com.xjd.ct.dal.dos.UserIdolModelKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserIdolModelMapper {
    int countByExample(UserIdolModelExample example);

    int deleteByExample(UserIdolModelExample example);

    int deleteByPrimaryKey(UserIdolModelKey key);

    int insert(UserIdolModel record);

    int insertSelective(UserIdolModel record);

    List<UserIdolModel> selectByExample(UserIdolModelExample example);

    UserIdolModel selectByPrimaryKey(UserIdolModelKey key);

    int updateByExampleSelective(@Param("record") UserIdolModel record, @Param("example") UserIdolModelExample example);

    int updateByExample(@Param("record") UserIdolModel record, @Param("example") UserIdolModelExample example);

    int updateByPrimaryKeySelective(UserIdolModel record);

    int updateByPrimaryKey(UserIdolModel record);
}