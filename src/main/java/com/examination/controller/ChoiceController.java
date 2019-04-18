package com.examination.controller;

import com.examination.model.Choice;
import com.examination.service.ChoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("choice")
public class ChoiceController {

    @Autowired
    private ChoiceService choiceService;

    @RequestMapping("selectByDateAndGrade")
    public List<Choice> selectByDateAndGrade(String examTime, String grade){
        try {
            return choiceService.selectByDateAndGrade(examTime, grade);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping("getDoneAnswer")
    public List<Choice> getDoneAnswer(String bankId,String userId){
        return choiceService.getDoneAnswer(bankId,userId);
    }
}
