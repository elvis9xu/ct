package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.AgeBracketModel;
import com.xjd.ct.dal.dos.AgeBracketModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgeBracketModelMapper {
    int countByExample(AgeBracketModelExample example);

    int deleteByExample(AgeBracketModelExample example);

    int deleteByPrimaryKey(Long ageBracketId);

    int insert(AgeBracketModel record);

    int insertSelective(AgeBracketModel record);

    List<AgeBracketModel> selectByExample(AgeBracketModelExample example);

    AgeBracketModel selectByPrimaryKey(Long ageBracketId);

    int updateByExampleSelective(@Param("record") AgeBracketModel record, @Param("example") AgeBracketModelExample example);

    int updateByExample(@Param("record") AgeBracketModel record, @Param("example") AgeBracketModelExample example);

    int updateByPrimaryKeySelective(AgeBracketModel record);

    int updateByPrimaryKey(AgeBracketModel record);
}