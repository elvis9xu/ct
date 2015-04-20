package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.UserSummaryModel;
import com.xjd.ct.dal.dos.UserSummaryModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSummaryModelMapper {
    int countByExample(UserSummaryModelExample example);

    int deleteByExample(UserSummaryModelExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(UserSummaryModel record);

    int insertSelective(UserSummaryModel record);

    List<UserSummaryModel> selectByExample(UserSummaryModelExample example);

    UserSummaryModel selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") UserSummaryModel record, @Param("example") UserSummaryModelExample example);

    int updateByExample(@Param("record") UserSummaryModel record, @Param("example") UserSummaryModelExample example);

    int updateByPrimaryKeySelective(UserSummaryModel record);

    int updateByPrimaryKey(UserSummaryModel record);
}