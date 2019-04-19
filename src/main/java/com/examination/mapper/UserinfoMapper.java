package com.examination.mapper;

import com.examination.model.Userinfo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserinfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    Userinfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);
}