package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.ReportModel;
import com.xjd.ct.dal.dos.ReportModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportModelMapper {
    int countByExample(ReportModelExample example);

    int deleteByExample(ReportModelExample example);

    int deleteByPrimaryKey(Long reportId);

    int insert(ReportModel record);

    int insertSelective(ReportModel record);

    List<ReportModel> selectByExample(ReportModelExample example);

    ReportModel selectByPrimaryKey(Long reportId);

    int updateByExampleSelective(@Param("record") ReportModel record, @Param("example") ReportModelExample example);

    int updateByExample(@Param("record") ReportModel record, @Param("example") ReportModelExample example);

    int updateByPrimaryKeySelective(ReportModel record);

    int updateByPrimaryKey(ReportModel record);
}