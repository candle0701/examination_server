package com.examination.service;

import com.examination.model.Bank;

import java.util.Date;
import java.util.List;

public interface BankService {
    List<Bank> selectByDate(Date beginDate, Date endDate) throws Exception;
}
