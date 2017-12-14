package com.helloword.mapper;

import com.helloword.entity.Travel;
import com.helloword.entity.TravelExample;
import java.util.List;

import com.helloword.entity.TravelRow;
import org.apache.ibatis.annotations.Param;

public interface TravelMapper {
    long countByExample(TravelExample example);

    int deleteByExample(TravelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Travel record);

    int insertSelective(Travel record);

    List<Travel> selectByExample(TravelExample example);

    Travel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Travel record, @Param("example") TravelExample example);

    int updateByExample(@Param("record") Travel record, @Param("example") TravelExample example);

    int updateByPrimaryKeySelective(Travel record);

    int updateByPrimaryKey(Travel record);
}