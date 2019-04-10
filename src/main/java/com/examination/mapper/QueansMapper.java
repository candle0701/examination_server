package com.examination.mapper;

import com.examination.model.Queans;

public interface QueansMapper {
    int deleteByPrimaryKey(String id);

    int insert(Queans record);

    int insertSelective(Queans record);

    Queans selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Queans record);

    int updateByPrimaryKey(Queans record);
}