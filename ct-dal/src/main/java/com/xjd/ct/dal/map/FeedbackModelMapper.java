package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.FeedbackModel;
import com.xjd.ct.dal.dos.FeedbackModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeedbackModelMapper {
    int countByExample(FeedbackModelExample example);

    int deleteByExample(FeedbackModelExample example);

    int deleteByPrimaryKey(Long feedbackId);

    int insert(FeedbackModel record);

    int insertSelective(FeedbackModel record);

    List<FeedbackModel> selectByExample(FeedbackModelExample example);

    FeedbackModel selectByPrimaryKey(Long feedbackId);

    int updateByExampleSelective(@Param("record") FeedbackModel record, @Param("example") FeedbackModelExample example);

    int updateByExample(@Param("record") FeedbackModel record, @Param("example") FeedbackModelExample example);

    int updateByPrimaryKeySelective(FeedbackModel record);

    int updateByPrimaryKey(FeedbackModel record);
}