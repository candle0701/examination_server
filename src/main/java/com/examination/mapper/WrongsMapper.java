package com.examination.mapper;

import com.examination.model.Wrongs;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WrongsMapper {
    int deleteByPrimaryKey(String id);

    int insert(Wrongs record);

    int insertSelective(Wrongs record);

    Wrongs selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Wrongs record);

    int updateByPrimaryKey(Wrongs record);

    List<Wrongs> selectByUserIdAndBankId(@Param("userId") String userId, @Param("bankId")String bankId);

    List<Wrongs> getWrongsList(@Param("userId") String userId,@Param("examtime")String examtime);
}