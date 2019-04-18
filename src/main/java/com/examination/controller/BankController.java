package com.examination.controller;

import com.examination.model.Bank;
import com.examination.model.Wrongs;
import com.examination.service.BankService;
import com.examination.service.WrongsService;
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
    @Autowired
    private WrongsService wrongsService;

    @RequestMapping("selectByDate")
    public List<Bank> selectByDate(String begin , String end,String userId){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date beginDate = null;
            Date endDate = null;
            if(!"".equals(begin) && !"".equals(end) && begin != null && end != null){
                beginDate = sdf.parse(begin);
                endDate = sdf.parse(end);
            }
            List<Bank> bankList = bankService.selectByDate(beginDate,endDate);

            for(int i = 0 ; i < bankList.size(); i ++){
                List<Wrongs> wrongsList = wrongsService.selectByUserIdAndBankId(userId,bankList.get(i).getId());
                if(wrongsList.size()>0){
                    bankList.get(i).setIfDone("true");
                }else{
                    bankList.get(i).setIfDone("false");
                }
            }
            return bankList;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
