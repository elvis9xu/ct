package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.MsgInformModel;
import com.xjd.ct.dal.dos.MsgInformModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsgInformModelMapper {
    int countByExample(MsgInformModelExample example);

    int deleteByExample(MsgInformModelExample example);

    int deleteByPrimaryKey(Long informId);

    int insert(MsgInformModel record);

    int insertSelective(MsgInformModel record);

    List<MsgInformModel> selectByExample(MsgInformModelExample example);

    MsgInformModel selectByPrimaryKey(Long informId);

    int updateByExampleSelective(@Param("record") MsgInformModel record, @Param("example") MsgInformModelExample example);

    int updateByExample(@Param("record") MsgInformModel record, @Param("example") MsgInformModelExample example);

    int updateByPrimaryKeySelective(MsgInformModel record);

    int updateByPrimaryKey(MsgInformModel record);
}