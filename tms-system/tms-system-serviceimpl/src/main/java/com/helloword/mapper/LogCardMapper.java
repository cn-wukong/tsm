package com.helloword.mapper;

import com.helloword.entity.LogCard;
import com.helloword.entity.LogCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogCardMapper {
    long countByExample(LogCardExample example);

    int deleteByExample(LogCardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LogCard record);

    int insertSelective(LogCard record);

    List<LogCard> selectByExample(LogCardExample example);

    LogCard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LogCard record, @Param("example") LogCardExample example);

    int updateByExample(@Param("record") LogCard record, @Param("example") LogCardExample example);

    int updateByPrimaryKeySelective(LogCard record);

    int updateByPrimaryKey(LogCard record);
}