package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.ObjectVoteModel;
import com.xjd.ct.dal.dos.ObjectVoteModelExample;
import com.xjd.ct.dal.dos.ObjectVoteModelKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObjectVoteModelMapper {
    int countByExample(ObjectVoteModelExample example);

    int deleteByExample(ObjectVoteModelExample example);

    int deleteByPrimaryKey(ObjectVoteModelKey key);

    int insert(ObjectVoteModel record);

    int insertSelective(ObjectVoteModel record);

    List<ObjectVoteModel> selectByExample(ObjectVoteModelExample example);

    ObjectVoteModel selectByPrimaryKey(ObjectVoteModelKey key);

    int updateByExampleSelective(@Param("record") ObjectVoteModel record, @Param("example") ObjectVoteModelExample example);

    int updateByExample(@Param("record") ObjectVoteModel record, @Param("example") ObjectVoteModelExample example);

    int updateByPrimaryKeySelective(ObjectVoteModel record);

    int updateByPrimaryKey(ObjectVoteModel record);
}