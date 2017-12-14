package com.helloword.mapper;

import com.helloword.entity.LogScenic;
import com.helloword.entity.LogScenicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogScenicMapper {
    long countByExample(LogScenicExample example);

    int deleteByExample(LogScenicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LogScenic record);

    int insertSelective(LogScenic record);

    List<LogScenic> selectByExample(LogScenicExample example);

    LogScenic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LogScenic record, @Param("example") LogScenicExample example);

    int updateByExample(@Param("record") LogScenic record, @Param("example") LogScenicExample example);

    int updateByPrimaryKeySelective(LogScenic record);

    int updateByPrimaryKey(LogScenic record);
}