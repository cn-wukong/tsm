package com.helloword.mapper;

import com.helloword.entity.LogShop;
import com.helloword.entity.LogShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogShopMapper {
    long countByExample(LogShopExample example);

    int deleteByExample(LogShopExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LogShop record);

    int insertSelective(LogShop record);

    List<LogShop> selectByExample(LogShopExample example);

    LogShop selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LogShop record, @Param("example") LogShopExample example);

    int updateByExample(@Param("record") LogShop record, @Param("example") LogShopExample example);

    int updateByPrimaryKeySelective(LogShop record);

    int updateByPrimaryKey(LogShop record);
}