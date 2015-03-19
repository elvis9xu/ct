package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.ObjectTagModel;
import com.xjd.ct.dal.dos.ObjectTagModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObjectTagModelMapper {
    int countByExample(ObjectTagModelExample example);

    int deleteByExample(ObjectTagModelExample example);

    int deleteByPrimaryKey(Long tagId);

    int insert(ObjectTagModel record);

    int insertSelective(ObjectTagModel record);

    List<ObjectTagModel> selectByExample(ObjectTagModelExample example);

    ObjectTagModel selectByPrimaryKey(Long tagId);

    int updateByExampleSelective(@Param("record") ObjectTagModel record, @Param("example") ObjectTagModelExample example);

    int updateByExample(@Param("record") ObjectTagModel record, @Param("example") ObjectTagModelExample example);

    int updateByPrimaryKeySelective(ObjectTagModel record);

    int updateByPrimaryKey(ObjectTagModel record);
}