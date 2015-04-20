package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.ServiceLogModel;
import com.xjd.ct.dal.dos.ServiceLogModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceLogModelMapper {
    int countByExample(ServiceLogModelExample example);

    int deleteByExample(ServiceLogModelExample example);

    int deleteByPrimaryKey(Long logId);

    int insert(ServiceLogModel record);

    int insertSelective(ServiceLogModel record);

    List<ServiceLogModel> selectByExample(ServiceLogModelExample example);

    ServiceLogModel selectByPrimaryKey(Long logId);

    int updateByExampleSelective(@Param("record") ServiceLogModel record, @Param("example") ServiceLogModelExample example);

    int updateByExample(@Param("record") ServiceLogModel record, @Param("example") ServiceLogModelExample example);

    int updateByPrimaryKeySelective(ServiceLogModel record);

    int updateByPrimaryKey(ServiceLogModel record);
}