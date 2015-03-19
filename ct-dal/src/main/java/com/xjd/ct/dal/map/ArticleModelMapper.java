package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.ArticleModel;
import com.xjd.ct.dal.dos.ArticleModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleModelMapper {
    int countByExample(ArticleModelExample example);

    int deleteByExample(ArticleModelExample example);

    int deleteByPrimaryKey(Long articleId);

    int insert(ArticleModel record);

    int insertSelective(ArticleModel record);

    List<ArticleModel> selectByExample(ArticleModelExample example);

    ArticleModel selectByPrimaryKey(Long articleId);

    int updateByExampleSelective(@Param("record") ArticleModel record, @Param("example") ArticleModelExample example);

    int updateByExample(@Param("record") ArticleModel record, @Param("example") ArticleModelExample example);

    int updateByPrimaryKeySelective(ArticleModel record);

    int updateByPrimaryKey(ArticleModel record);
}