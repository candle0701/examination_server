package com.examination.service.impl;

import com.examination.mapper.ChoiceMapper;
import com.examination.model.Choice;
import com.examination.service.ChoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChoiceServiceImpl implements ChoiceService {

    @Autowired
    private ChoiceMapper choiceMapper;

    @Override
    public List<Choice> selectByDateAndGrade(String examTime, String grade) throws Exception {
        return choiceMapper.selectByDateAndGrade(examTime,grade);
    }

    public List<Choice> getDoneAnswer(String bankId,String userId){
        return choiceMapper.getDoneAnswer(bankId,userId);
    }
}
