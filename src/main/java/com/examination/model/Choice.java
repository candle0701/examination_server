package com.examination.model;

public class Choice {
    private String id;

    private String choiceTitle;

    private String choiceA;

    private String choiceB;

    private String choiceC;

    private String choiceD;

    private String choiceE;

    private String choiceAnswer;

    private Integer choiceSort;

    private String choiceImgUrl1;

    private String choiceImgUrl2;

    private String choiceImgUrl3;

    private String choiceImgUrl4;

    private String examtime;

    private String grade;

    private String answer;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getChoiceTitle() {
        return choiceTitle;
    }

    public void setChoiceTitle(String choiceTitle) {
        this.choiceTitle = choiceTitle == null ? null : choiceTitle.trim();
    }

    public String getChoiceA() {
        return choiceA;
    }

    public void setChoiceA(String choiceA) {
        this.choiceA = choiceA == null ? null : choiceA.trim();
    }

    public String getChoiceB() {
        return choiceB;
    }

    public void setChoiceB(String choiceB) {
        this.choiceB = choiceB == null ? null : choiceB.trim();
    }

    public String getChoiceC() {
        return choiceC;
    }

    public void setChoiceC(String choiceC) {
        this.choiceC = choiceC == null ? null : choiceC.trim();
    }

    public String getChoiceD() {
        return choiceD;
    }

    public void setChoiceD(String choiceD) {
        this.choiceD = choiceD == null ? null : choiceD.trim();
    }

    public String getChoiceE() {
        return choiceE;
    }

    public void setChoiceE(String choiceE) {
        this.choiceE = choiceE == null ? null : choiceE.trim();
    }

    public String getChoiceAnswer() {
        return choiceAnswer;
    }

    public void setChoiceAnswer(String choiceAnswer) {
        this.choiceAnswer = choiceAnswer == null ? null : choiceAnswer.trim();
    }

    public Integer getChoiceSort() {
        return choiceSort;
    }

    public void setChoiceSort(Integer choiceSort) {
        this.choiceSort = choiceSort;
    }

    public String getChoiceImgUrl1() {
        return choiceImgUrl1;
    }

    public void setChoiceImgUrl1(String choiceImgUrl1) {
        this.choiceImgUrl1 = choiceImgUrl1 == null ? null : choiceImgUrl1.trim();
    }

    public String getChoiceImgUrl2() {
        return choiceImgUrl2;
    }

    public void setChoiceImgUrl2(String choiceImgUrl2) {
        this.choiceImgUrl2 = choiceImgUrl2 == null ? null : choiceImgUrl2.trim();
    }

    public String getChoiceImgUrl3() {
        return choiceImgUrl3;
    }

    public void setChoiceImgUrl3(String choiceImgUrl3) {
        this.choiceImgUrl3 = choiceImgUrl3 == null ? null : choiceImgUrl3.trim();
    }

    public String getChoiceImgUrl4() {
        return choiceImgUrl4;
    }

    public void setChoiceImgUrl4(String choiceImgUrl4) {
        this.choiceImgUrl4 = choiceImgUrl4 == null ? null : choiceImgUrl4.trim();
    }

    public String getExamtime() {
        return examtime;
    }

    public void setExamtime(String examtime) {
        this.examtime = examtime == null ? null : examtime.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }
}