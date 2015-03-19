package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.SequenceModel;
import com.xjd.ct.dal.dos.SequenceModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SequenceModelMapper {
    int countByExample(SequenceModelExample example);

    int deleteByExample(SequenceModelExample example);

    int deleteByPrimaryKey(String seqName);

    int insert(SequenceModel record);

    int insertSelective(SequenceModel record);

    List<SequenceModel> selectByExample(SequenceModelExample example);

    SequenceModel selectByPrimaryKey(String seqName);

    int updateByExampleSelective(@Param("record") SequenceModel record, @Param("example") SequenceModelExample example);

    int updateByExample(@Param("record") SequenceModel record, @Param("example") SequenceModelExample example);

    int updateByPrimaryKeySelective(SequenceModel record);

    int updateByPrimaryKey(SequenceModel record);
}