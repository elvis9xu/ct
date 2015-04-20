package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.ObjectModel;
import com.xjd.ct.dal.dos.ObjectModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObjectModelMapper {
    int countByExample(ObjectModelExample example);

    int deleteByExample(ObjectModelExample example);

    int deleteByPrimaryKey(Long objectId);

    int insert(ObjectModel record);

    int insertSelective(ObjectModel record);

    List<ObjectModel> selectByExample(ObjectModelExample example);

    ObjectModel selectByPrimaryKey(Long objectId);

    int updateByExampleSelective(@Param("record") ObjectModel record, @Param("example") ObjectModelExample example);

    int updateByExample(@Param("record") ObjectModel record, @Param("example") ObjectModelExample example);

    int updateByPrimaryKeySelective(ObjectModel record);

    int updateByPrimaryKey(ObjectModel record);
}