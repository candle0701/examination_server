package com.examination.service;

import com.examination.model.Choice;

import java.util.List;

public interface ChoiceService {
    List<Choice> selectByDateAndGrade(String examTime, String grade) throws Exception;
    List<Choice> getDoneAnswer(String bankId,String userId);
}
