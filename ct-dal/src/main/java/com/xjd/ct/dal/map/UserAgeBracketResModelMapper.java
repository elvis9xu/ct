package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.UserAgeBracketResModel;
import com.xjd.ct.dal.dos.UserAgeBracketResModelExample;
import com.xjd.ct.dal.dos.UserAgeBracketResModelKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAgeBracketResModelMapper {
    int countByExample(UserAgeBracketResModelExample example);

    int deleteByExample(UserAgeBracketResModelExample example);

    int deleteByPrimaryKey(UserAgeBracketResModelKey key);

    int insert(UserAgeBracketResModel record);

    int insertSelective(UserAgeBracketResModel record);

    List<UserAgeBracketResModel> selectByExample(UserAgeBracketResModelExample example);

    UserAgeBracketResModel selectByPrimaryKey(UserAgeBracketResModelKey key);

    int updateByExampleSelective(@Param("record") UserAgeBracketResModel record, @Param("example") UserAgeBracketResModelExample example);

    int updateByExample(@Param("record") UserAgeBracketResModel record, @Param("example") UserAgeBracketResModelExample example);

    int updateByPrimaryKeySelective(UserAgeBracketResModel record);

    int updateByPrimaryKey(UserAgeBracketResModel record);
}