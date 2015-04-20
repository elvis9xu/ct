package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.TokenModel;
import com.xjd.ct.dal.dos.TokenModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TokenModelMapper {
    int countByExample(TokenModelExample example);

    int deleteByExample(TokenModelExample example);

    int deleteByPrimaryKey(String token);

    int insert(TokenModel record);

    int insertSelective(TokenModel record);

    List<TokenModel> selectByExample(TokenModelExample example);

    TokenModel selectByPrimaryKey(String token);

    int updateByExampleSelective(@Param("record") TokenModel record, @Param("example") TokenModelExample example);

    int updateByExample(@Param("record") TokenModel record, @Param("example") TokenModelExample example);

    int updateByPrimaryKeySelective(TokenModel record);

    int updateByPrimaryKey(TokenModel record);
}