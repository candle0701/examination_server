package com.examination.service;

import com.examination.model.Userinfo;

public interface UserinfoService {
    int insertSelective(Userinfo record);
    int updateByPrimaryKeySelective(Userinfo record);
    Userinfo selectByPrimaryKey(String id);
}
