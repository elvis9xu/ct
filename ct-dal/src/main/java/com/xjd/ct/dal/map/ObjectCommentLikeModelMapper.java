package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.ObjectCommentLikeModel;
import com.xjd.ct.dal.dos.ObjectCommentLikeModelExample;
import com.xjd.ct.dal.dos.ObjectCommentLikeModelKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObjectCommentLikeModelMapper {
    int countByExample(ObjectCommentLikeModelExample example);

    int deleteByExample(ObjectCommentLikeModelExample example);

    int deleteByPrimaryKey(ObjectCommentLikeModelKey key);

    int insert(ObjectCommentLikeModel record);

    int insertSelective(ObjectCommentLikeModel record);

    List<ObjectCommentLikeModel> selectByExample(ObjectCommentLikeModelExample example);

    ObjectCommentLikeModel selectByPrimaryKey(ObjectCommentLikeModelKey key);

    int updateByExampleSelective(@Param("record") ObjectCommentLikeModel record, @Param("example") ObjectCommentLikeModelExample example);

    int updateByExample(@Param("record") ObjectCommentLikeModel record, @Param("example") ObjectCommentLikeModelExample example);

    int updateByPrimaryKeySelective(ObjectCommentLikeModel record);

    int updateByPrimaryKey(ObjectCommentLikeModel record);
}