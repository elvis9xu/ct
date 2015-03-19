package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.PublishModel;
import com.xjd.ct.dal.dos.PublishModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublishModelMapper {
    int countByExample(PublishModelExample example);

    int deleteByExample(PublishModelExample example);

    int deleteByPrimaryKey(Long publishId);

    int insert(PublishModel record);

    int insertSelective(PublishModel record);

    List<PublishModel> selectByExample(PublishModelExample example);

    PublishModel selectByPrimaryKey(Long publishId);

    int updateByExampleSelective(@Param("record") PublishModel record, @Param("example") PublishModelExample example);

    int updateByExample(@Param("record") PublishModel record, @Param("example") PublishModelExample example);

    int updateByPrimaryKeySelective(PublishModel record);

    int updateByPrimaryKey(PublishModel record);
}