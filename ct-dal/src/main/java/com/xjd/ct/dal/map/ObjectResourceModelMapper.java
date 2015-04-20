package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.ObjectResourceModel;
import com.xjd.ct.dal.dos.ObjectResourceModelExample;
import com.xjd.ct.dal.dos.ObjectResourceModelKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObjectResourceModelMapper {
    int countByExample(ObjectResourceModelExample example);

    int deleteByExample(ObjectResourceModelExample example);

    int deleteByPrimaryKey(ObjectResourceModelKey key);

    int insert(ObjectResourceModel record);

    int insertSelective(ObjectResourceModel record);

    List<ObjectResourceModel> selectByExample(ObjectResourceModelExample example);

    ObjectResourceModel selectByPrimaryKey(ObjectResourceModelKey key);

    int updateByExampleSelective(@Param("record") ObjectResourceModel record, @Param("example") ObjectResourceModelExample example);

    int updateByExample(@Param("record") ObjectResourceModel record, @Param("example") ObjectResourceModelExample example);

    int updateByPrimaryKeySelective(ObjectResourceModel record);

    int updateByPrimaryKey(ObjectResourceModel record);
}