package com.examination.mapper;

import com.examination.model.Bank;
import com.examination.model.BankKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface BankMapper {
    int deleteByPrimaryKey(BankKey key);

    int insert(Bank record);

    int insertSelective(Bank record);

    Bank selectByPrimaryKey(BankKey key);

    int updateByPrimaryKeySelective(Bank record);

    int updateByPrimaryKey(Bank record);

    List<Bank> selectByDate(@Param("beginDate") Date beginDate, @Param("endDate")Date endDate) throws Exception;
}