package com.examination.model;

import java.util.Date;

public class Wrongs {
    private String id;

    private String userId;

    private Integer completionId;

    private Integer choiceId;

    private Integer judgeId;

    private Integer queansId;

    private Date wrongDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getCompletionId() {
        return completionId;
    }

    public void setCompletionId(Integer completionId) {
        this.completionId = completionId;
    }

    public Integer getChoiceId() {
        return choiceId;
    }

    public void setChoiceId(Integer choiceId) {
        this.choiceId = choiceId;
    }

    public Integer getJudgeId() {
        return judgeId;
    }

    public void setJudgeId(Integer judgeId) {
        this.judgeId = judgeId;
    }

    public Integer getQueansId() {
        return queansId;
    }

    public void setQueansId(Integer queansId) {
        this.queansId = queansId;
    }

    public Date getWrongDate() {
        return wrongDate;
    }

    public void setWrongDate(Date wrongDate) {
        this.wrongDate = wrongDate;
    }
}