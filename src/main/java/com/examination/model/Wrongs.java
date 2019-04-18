package com.examination.model;

public class Wrongs {
    private String id;

    private String userId;

    private String completionId;

    private String choiceId;

    private String judgeId;

    private String queansId;

    private String examtime;

    private String answer;

    private String bankId;

    private String wrongsum;

    public String getWrongsum() {
        return wrongsum;
    }

    public void setWrongsum(String wrongsum) {
        this.wrongsum = wrongsum;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

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

    public String getCompletionId() {
        return completionId;
    }

    public void setCompletionId(String completionId) {
        this.completionId = completionId == null ? null : completionId.trim();
    }

    public String getChoiceId() {
        return choiceId;
    }

    public void setChoiceId(String choiceId) {
        this.choiceId = choiceId == null ? null : choiceId.trim();
    }

    public String getJudgeId() {
        return judgeId;
    }

    public void setJudgeId(String judgeId) {
        this.judgeId = judgeId == null ? null : judgeId.trim();
    }

    public String getQueansId() {
        return queansId;
    }

    public void setQueansId(String queansId) {
        this.queansId = queansId == null ? null : queansId.trim();
    }

    public String getExamtime() {
        return examtime;
    }

    public void setExamtime(String examtime) {
        this.examtime = examtime == null ? null : examtime.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }
}