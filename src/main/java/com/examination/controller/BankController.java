package com.examination.controller;

import com.examination.model.Bank;
import com.examination.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("bank")
public class BankController {

    @Autowired
    private BankService bankService;

    @RequestMapping("selectByDate")
    public List<Bank> selectByDate(String begin , String end){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date beginDate = null;
            Date endDate = null;
            if(!"".equals(begin) && !"".equals(end) && begin != null && end != null){
                beginDate = sdf.parse(begin);
                endDate = sdf.parse(end);
            }
            return bankService.selectByDate(beginDate,endDate);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
