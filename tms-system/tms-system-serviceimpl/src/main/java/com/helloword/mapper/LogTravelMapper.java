package com.helloword.mapper;

import com.helloword.entity.LogTravel;
import com.helloword.entity.LogTravelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogTravelMapper {
    long countByExample(LogTravelExample example);

    int deleteByExample(LogTravelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LogTravel record);

    int insertSelective(LogTravel record);

    List<LogTravel> selectByExample(LogTravelExample example);

    LogTravel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LogTravel record, @Param("example") LogTravelExample example);

    int updateByExample(@Param("record") LogTravel record, @Param("example") LogTravelExample example);

    int updateByPrimaryKeySelective(LogTravel record);

    int updateByPrimaryKey(LogTravel record);
}