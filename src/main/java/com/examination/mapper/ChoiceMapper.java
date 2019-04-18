package com.examination.mapper;

import com.examination.model.Choice;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChoiceMapper {
    int insert(Choice record);

    int insertSelective(Choice record);

    List<Choice> selectByDateAndGrade(@Param("examTime") String examTime, @Param("grade")String grade) throws Exception;

    List<Choice> getDoneAnswer(@Param("bankId") String bankId,@Param("userId")String userId);
}