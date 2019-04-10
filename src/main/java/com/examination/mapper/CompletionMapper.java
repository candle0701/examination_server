package com.examination.mapper;

import com.examination.model.Completion;

public interface CompletionMapper {
    int deleteByPrimaryKey(String id);

    int insert(Completion record);

    int insertSelective(Completion record);

    Completion selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Completion record);

    int updateByPrimaryKey(Completion record);
}