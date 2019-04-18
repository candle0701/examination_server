package com.examination.service;

import com.examination.model.Wrongs;

import java.util.List;

public interface WrongsService {
    int insertSelective(Wrongs record);
    List<Wrongs> selectByUserIdAndBankId(String userId, String bankId);
    List<Wrongs> getWrongsList(String userId,String examtime);
}
