package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.ObjectCommentModel;
import com.xjd.ct.dal.dos.ObjectCommentModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObjectCommentModelMapper {
    int countByExample(ObjectCommentModelExample example);

    int deleteByExample(ObjectCommentModelExample example);

    int deleteByPrimaryKey(Long commentId);

    int insert(ObjectCommentModel record);

    int insertSelective(ObjectCommentModel record);

    List<ObjectCommentModel> selectByExample(ObjectCommentModelExample example);

    ObjectCommentModel selectByPrimaryKey(Long commentId);

    int updateByExampleSelective(@Param("record") ObjectCommentModel record, @Param("example") ObjectCommentModelExample example);

    int updateByExample(@Param("record") ObjectCommentModel record, @Param("example") ObjectCommentModelExample example);

    int updateByPrimaryKeySelective(ObjectCommentModel record);

    int updateByPrimaryKey(ObjectCommentModel record);
}