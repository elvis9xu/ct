package com.xjd.ct.dal.mapper;

import com.xjd.ct.dal.model.UserDo;

public interface UserMapper {

    int insert(UserDo record);

    int insertSelective(UserDo record);

    UserDo selectByUserId(String userId);
}