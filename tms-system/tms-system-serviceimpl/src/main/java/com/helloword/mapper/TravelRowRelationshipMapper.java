package com.helloword.mapper;

import com.helloword.entity.TravelRowRelationshipExample;
import com.helloword.entity.TravelRowRelationshipKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TravelRowRelationshipMapper {
    long countByExample(TravelRowRelationshipExample example);

    int deleteByExample(TravelRowRelationshipExample example);

    int deleteByPrimaryKey(TravelRowRelationshipKey key);

    int insert(TravelRowRelationshipKey record);

    int insertSelective(TravelRowRelationshipKey record);

    List<TravelRowRelationshipKey> selectByExample(TravelRowRelationshipExample example);

    int updateByExampleSelective(@Param("record") TravelRowRelationshipKey record, @Param("example") TravelRowRelationshipExample example);

    int updateByExample(@Param("record") TravelRowRelationshipKey record, @Param("example") TravelRowRelationshipExample example);
}