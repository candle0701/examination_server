package com.examination.service.impl;

import com.examination.mapper.BankMapper;
import com.examination.model.Bank;
import com.examination.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BankServiceImpl implements BankService {

    @Autowired
    private BankMapper bankMapper;

    public List<Bank> selectByDate(Date beginDate, Date endDate) throws Exception{
        return bankMapper.selectByDate(beginDate,endDate);
    }
}
