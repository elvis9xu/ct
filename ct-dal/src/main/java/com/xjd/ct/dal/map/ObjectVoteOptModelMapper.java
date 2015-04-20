package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.ObjectVoteOptModel;
import com.xjd.ct.dal.dos.ObjectVoteOptModelExample;
import com.xjd.ct.dal.dos.ObjectVoteOptModelKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObjectVoteOptModelMapper {
    int countByExample(ObjectVoteOptModelExample example);

    int deleteByExample(ObjectVoteOptModelExample example);

    int deleteByPrimaryKey(ObjectVoteOptModelKey key);

    int insert(ObjectVoteOptModel record);

    int insertSelective(ObjectVoteOptModel record);

    List<ObjectVoteOptModel> selectByExample(ObjectVoteOptModelExample example);

    ObjectVoteOptModel selectByPrimaryKey(ObjectVoteOptModelKey key);

    int updateByExampleSelective(@Param("record") ObjectVoteOptModel record, @Param("example") ObjectVoteOptModelExample example);

    int updateByExample(@Param("record") ObjectVoteOptModel record, @Param("example") ObjectVoteOptModelExample example);

    int updateByPrimaryKeySelective(ObjectVoteOptModel record);

    int updateByPrimaryKey(ObjectVoteOptModel record);
}