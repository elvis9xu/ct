package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.ObjectTagRsModel;
import com.xjd.ct.dal.dos.ObjectTagRsModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObjectTagRsModelMapper {
    int countByExample(ObjectTagRsModelExample example);

    int deleteByExample(ObjectTagRsModelExample example);

    int insert(ObjectTagRsModel record);

    int insertSelective(ObjectTagRsModel record);

    List<ObjectTagRsModel> selectByExample(ObjectTagRsModelExample example);

    int updateByExampleSelective(@Param("record") ObjectTagRsModel record, @Param("example") ObjectTagRsModelExample example);

    int updateByExample(@Param("record") ObjectTagRsModel record, @Param("example") ObjectTagRsModelExample example);
}