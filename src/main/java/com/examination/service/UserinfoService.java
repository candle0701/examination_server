package com.examination.service;

import com.examination.model.Userinfo;

import java.util.List;

public interface UserinfoService {
    int insertSelective(Userinfo record);
    int updateByPrimaryKeySelective(Userinfo record);
    Userinfo selectByPrimaryKey(String id);
    List<Userinfo> getUserinfoByUsernameAndPassword(String username, String password);
    List<Userinfo> getUserinfoByOpenid(String openid);
}
