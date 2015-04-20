package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.AppVersionModel;
import com.xjd.ct.dal.dos.AppVersionModelExample;
import com.xjd.ct.dal.dos.AppVersionModelKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppVersionModelMapper {
    int countByExample(AppVersionModelExample example);

    int deleteByExample(AppVersionModelExample example);

    int deleteByPrimaryKey(AppVersionModelKey key);

    int insert(AppVersionModel record);

    int insertSelective(AppVersionModel record);

    List<AppVersionModel> selectByExample(AppVersionModelExample example);

    AppVersionModel selectByPrimaryKey(AppVersionModelKey key);

    int updateByExampleSelective(@Param("record") AppVersionModel record, @Param("example") AppVersionModelExample example);

    int updateByExample(@Param("record") AppVersionModel record, @Param("example") AppVersionModelExample example);

    int updateByPrimaryKeySelective(AppVersionModel record);

    int updateByPrimaryKey(AppVersionModel record);
}