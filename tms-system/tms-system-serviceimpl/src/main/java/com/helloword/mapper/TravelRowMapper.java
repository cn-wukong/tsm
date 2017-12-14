package com.helloword.mapper;

import com.helloword.entity.TravelRow;
import com.helloword.entity.TravelRowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TravelRowMapper {
    long countByExample(TravelRowExample example);

    int deleteByExample(TravelRowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TravelRow record);

    int insertSelective(TravelRow record);

    List<TravelRow> selectByExample(TravelRowExample example);

    TravelRow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TravelRow record, @Param("example") TravelRowExample example);

    int updateByExample(@Param("record") TravelRow record, @Param("example") TravelRowExample example);

    int updateByPrimaryKeySelective(TravelRow record);

    int updateByPrimaryKey(TravelRow record);

    List<TravelRow> selectRowByTravelKey(@Param("id") Integer id);
}