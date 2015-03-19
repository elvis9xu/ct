package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.PublishResRsModel;
import com.xjd.ct.dal.dos.PublishResRsModelExample;
import com.xjd.ct.dal.dos.PublishResRsModelKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublishResRsModelMapper {
    int countByExample(PublishResRsModelExample example);

    int deleteByExample(PublishResRsModelExample example);

    int deleteByPrimaryKey(PublishResRsModelKey key);

    int insert(PublishResRsModel record);

    int insertSelective(PublishResRsModel record);

    List<PublishResRsModel> selectByExample(PublishResRsModelExample example);

    PublishResRsModel selectByPrimaryKey(PublishResRsModelKey key);

    int updateByExampleSelective(@Param("record") PublishResRsModel record, @Param("example") PublishResRsModelExample example);

    int updateByExample(@Param("record") PublishResRsModel record, @Param("example") PublishResRsModelExample example);

    int updateByPrimaryKeySelective(PublishResRsModel record);

    int updateByPrimaryKey(PublishResRsModel record);
}