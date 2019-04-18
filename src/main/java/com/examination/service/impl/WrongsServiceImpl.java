package com.examination.service.impl;

import com.examination.mapper.WrongsMapper;
import com.examination.model.Wrongs;
import com.examination.service.WrongsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WrongsServiceImpl implements WrongsService {

    @Autowired
    private WrongsMapper wrongsMapper;

    public int insertSelective(Wrongs wrongs) {
        return wrongsMapper.insertSelective(wrongs);
    }

    @Override
    public List<Wrongs> selectByUserIdAndBankId(String userId, String bankId) {
        return wrongsMapper.selectByUserIdAndBankId(userId,bankId);
    }

    @Override
    public List<Wrongs> getWrongsList(String userId,String examtime) {
        return wrongsMapper.getWrongsList(userId,examtime);
    }
}
