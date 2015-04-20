package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.ObjectLikeModel;
import com.xjd.ct.dal.dos.ObjectLikeModelExample;
import com.xjd.ct.dal.dos.ObjectLikeModelKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObjectLikeModelMapper {
    int countByExample(ObjectLikeModelExample example);

    int deleteByExample(ObjectLikeModelExample example);

    int deleteByPrimaryKey(ObjectLikeModelKey key);

    int insert(ObjectLikeModel record);

    int insertSelective(ObjectLikeModel record);

    List<ObjectLikeModel> selectByExample(ObjectLikeModelExample example);

    ObjectLikeModel selectByPrimaryKey(ObjectLikeModelKey key);

    int updateByExampleSelective(@Param("record") ObjectLikeModel record, @Param("example") ObjectLikeModelExample example);

    int updateByExample(@Param("record") ObjectLikeModel record, @Param("example") ObjectLikeModelExample example);

    int updateByPrimaryKeySelective(ObjectLikeModel record);

    int updateByPrimaryKey(ObjectLikeModel record);
}