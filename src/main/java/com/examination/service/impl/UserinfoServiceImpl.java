package com.examination.service.impl;

import com.examination.mapper.UserinfoMapper;
import com.examination.model.Userinfo;
import com.examination.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserinfoServiceImpl implements UserinfoService {
    @Autowired
    private UserinfoMapper userinfoMapper;

    @Override
    public int insertSelective(Userinfo record) {
        return userinfoMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Userinfo record) {
        return userinfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public Userinfo selectByPrimaryKey(String id) {
        return userinfoMapper.selectByPrimaryKey(id);
    }
}
