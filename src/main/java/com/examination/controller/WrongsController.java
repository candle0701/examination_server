package com.examination.controller;

import com.examination.model.Wrongs;
import com.examination.service.WrongsService;
import com.examination.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("wrongs")
public class WrongsController {

    @Autowired
    private WrongsService wrongsService;

    @RequestMapping("insertSelective")
    public void insertSelective(String str,String examtime,String userId,String bankId){
        System.out.println(str);
        String[] arr = str.substring(1,str.length()-1).replace("\"","").split(",");
        for(int i = 0 ; i < arr.length; i ++){
            Wrongs wrongs = new Wrongs();
            String choiceId = "";
            String answer = "";
            for(int j = 0 ; j < arr[i].split(":").length; j ++){
                choiceId = arr[i].split(":")[0];
                answer = arr[i].split(":")[1];
            }
            wrongs.setChoiceId(choiceId);
            wrongs.setAnswer(answer);
            wrongs.setUserId(userId);
            wrongs.setId(UUIDUtil.getUUID());
            wrongs.setBankId(bankId);
            wrongs.setExamtime(examtime);
            wrongsService.insertSelective(wrongs);
        }
    }

    @RequestMapping("getWrongsList")
    public List<Wrongs> getWrongsList(String userId,String examtime){
        return wrongsService.getWrongsList(userId,examtime);
    }
}
