package com.examination.mapper;

import com.examination.model.Wrongs;

public interface WrongsMapper {
    int deleteByPrimaryKey(String id);

    int insert(Wrongs record);

    int insertSelective(Wrongs record);

    Wrongs selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Wrongs record);

    int updateByPrimaryKey(Wrongs record);
}