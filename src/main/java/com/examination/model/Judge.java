package com.examination.model;

public class Judge {
    private String id;

    private String judgeTitle;

    private String judgeAnswer;

    private Integer judgeSort;

    private String judgeImg1;

    private String judgeImg2;

    private String judgeImg3;

    private String judgeImg4;

    private String judgeImg5;

    private String grade;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getJudgeTitle() {
        return judgeTitle;
    }

    public void setJudgeTitle(String judgeTitle) {
        this.judgeTitle = judgeTitle == null ? null : judgeTitle.trim();
    }

    public String getJudgeAnswer() {
        return judgeAnswer;
    }

    public void setJudgeAnswer(String judgeAnswer) {
        this.judgeAnswer = judgeAnswer == null ? null : judgeAnswer.trim();
    }

    public Integer getJudgeSort() {
        return judgeSort;
    }

    public void setJudgeSort(Integer judgeSort) {
        this.judgeSort = judgeSort;
    }

    public String getJudgeImg1() {
        return judgeImg1;
    }

    public void setJudgeImg1(String judgeImg1) {
        this.judgeImg1 = judgeImg1 == null ? null : judgeImg1.trim();
    }

    public String getJudgeImg2() {
        return judgeImg2;
    }

    public void setJudgeImg2(String judgeImg2) {
        this.judgeImg2 = judgeImg2 == null ? null : judgeImg2.trim();
    }

    public String getJudgeImg3() {
        return judgeImg3;
    }

    public void setJudgeImg3(String judgeImg3) {
        this.judgeImg3 = judgeImg3 == null ? null : judgeImg3.trim();
    }

    public String getJudgeImg4() {
        return judgeImg4;
    }

    public void setJudgeImg4(String judgeImg4) {
        this.judgeImg4 = judgeImg4 == null ? null : judgeImg4.trim();
    }

    public String getJudgeImg5() {
        return judgeImg5;
    }

    public void setJudgeImg5(String judgeImg5) {
        this.judgeImg5 = judgeImg5 == null ? null : judgeImg5.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }
}