package com.examination.mapper;

import com.examination.model.Judge;

public interface JudgeMapper {
    int deleteByPrimaryKey(String id);

    int insert(Judge record);

    int insertSelective(Judge record);

    Judge selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Judge record);

    int updateByPrimaryKey(Judge record);
}