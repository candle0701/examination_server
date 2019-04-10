package com.examination.mapper;

import com.examination.model.Choice;

public interface ChoiceMapper {
    int insert(Choice record);

    int insertSelective(Choice record);
}