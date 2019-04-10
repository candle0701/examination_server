package com.examination.model;

public class Completion {
    private String id;

    private String completionTitle;

    private String completionAnswer;

    private Integer completionSort;

    private String completionImg1;

    private String completionImg2;

    private String completionImg3;

    private String completionImg4;

    private String completionImg5;

    private String grade;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCompletionTitle() {
        return completionTitle;
    }

    public void setCompletionTitle(String completionTitle) {
        this.completionTitle = completionTitle == null ? null : completionTitle.trim();
    }

    public String getCompletionAnswer() {
        return completionAnswer;
    }

    public void setCompletionAnswer(String completionAnswer) {
        this.completionAnswer = completionAnswer == null ? null : completionAnswer.trim();
    }

    public Integer getCompletionSort() {
        return completionSort;
    }

    public void setCompletionSort(Integer completionSort) {
        this.completionSort = completionSort;
    }

    public String getCompletionImg1() {
        return completionImg1;
    }

    public void setCompletionImg1(String completionImg1) {
        this.completionImg1 = completionImg1 == null ? null : completionImg1.trim();
    }

    public String getCompletionImg2() {
        return completionImg2;
    }

    public void setCompletionImg2(String completionImg2) {
        this.completionImg2 = completionImg2 == null ? null : completionImg2.trim();
    }

    public String getCompletionImg3() {
        return completionImg3;
    }

    public void setCompletionImg3(String completionImg3) {
        this.completionImg3 = completionImg3 == null ? null : completionImg3.trim();
    }

    public String getCompletionImg4() {
        return completionImg4;
    }

    public void setCompletionImg4(String completionImg4) {
        this.completionImg4 = completionImg4 == null ? null : completionImg4.trim();
    }

    public String getCompletionImg5() {
        return completionImg5;
    }

    public void setCompletionImg5(String completionImg5) {
        this.completionImg5 = completionImg5 == null ? null : completionImg5.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }
}