package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.ObjectTypeModel;
import com.xjd.ct.dal.dos.ObjectTypeModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObjectTypeModelMapper {
    int countByExample(ObjectTypeModelExample example);

    int deleteByExample(ObjectTypeModelExample example);

    int deleteByPrimaryKey(Byte typeId);

    int insert(ObjectTypeModel record);

    int insertSelective(ObjectTypeModel record);

    List<ObjectTypeModel> selectByExample(ObjectTypeModelExample example);

    ObjectTypeModel selectByPrimaryKey(Byte typeId);

    int updateByExampleSelective(@Param("record") ObjectTypeModel record, @Param("example") ObjectTypeModelExample example);

    int updateByExample(@Param("record") ObjectTypeModel record, @Param("example") ObjectTypeModelExample example);

    int updateByPrimaryKeySelective(ObjectTypeModel record);

    int updateByPrimaryKey(ObjectTypeModel record);
}