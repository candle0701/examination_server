package com.examination.mapper;

import com.examination.model.Userinfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserinfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    Userinfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);

    List<Userinfo> getUserinfoByUsernameAndPassword(@Param("username")String username, @Param("password")String password);

    List<Userinfo> getUserinfoByOpenid(@Param("openid") String openid);
}