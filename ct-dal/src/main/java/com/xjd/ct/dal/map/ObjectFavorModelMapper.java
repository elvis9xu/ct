package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.ObjectFavorModel;
import com.xjd.ct.dal.dos.ObjectFavorModelExample;
import com.xjd.ct.dal.dos.ObjectFavorModelKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObjectFavorModelMapper {
    int countByExample(ObjectFavorModelExample example);

    int deleteByExample(ObjectFavorModelExample example);

    int deleteByPrimaryKey(ObjectFavorModelKey key);

    int insert(ObjectFavorModel record);

    int insertSelective(ObjectFavorModel record);

    List<ObjectFavorModel> selectByExample(ObjectFavorModelExample example);

    ObjectFavorModel selectByPrimaryKey(ObjectFavorModelKey key);

    int updateByExampleSelective(@Param("record") ObjectFavorModel record, @Param("example") ObjectFavorModelExample example);

    int updateByExample(@Param("record") ObjectFavorModel record, @Param("example") ObjectFavorModelExample example);

    int updateByPrimaryKeySelective(ObjectFavorModel record);

    int updateByPrimaryKey(ObjectFavorModel record);
}