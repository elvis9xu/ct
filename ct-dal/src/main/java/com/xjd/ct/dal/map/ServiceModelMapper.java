package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.ServiceModel;
import com.xjd.ct.dal.dos.ServiceModelExample;
import com.xjd.ct.dal.dos.ServiceModelKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceModelMapper {
    int countByExample(ServiceModelExample example);

    int deleteByExample(ServiceModelExample example);

    int deleteByPrimaryKey(ServiceModelKey key);

    int insert(ServiceModel record);

    int insertSelective(ServiceModel record);

    List<ServiceModel> selectByExample(ServiceModelExample example);

    ServiceModel selectByPrimaryKey(ServiceModelKey key);

    int updateByExampleSelective(@Param("record") ServiceModel record, @Param("example") ServiceModelExample example);

    int updateByExample(@Param("record") ServiceModel record, @Param("example") ServiceModelExample example);

    int updateByPrimaryKeySelective(ServiceModel record);

    int updateByPrimaryKey(ServiceModel record);
}