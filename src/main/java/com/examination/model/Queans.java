package com.examination.model;

public class Queans {
    private String id;

    private String queansAnswer;

    private String queansTitle;

    private Integer queansSort;

    private String queansImg1;

    private String queansImg2;

    private String queansImg3;

    private String queansImg4;

    private String queansImg5;

    private String grade;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getQueansAnswer() {
        return queansAnswer;
    }

    public void setQueansAnswer(String queansAnswer) {
        this.queansAnswer = queansAnswer == null ? null : queansAnswer.trim();
    }

    public String getQueansTitle() {
        return queansTitle;
    }

    public void setQueansTitle(String queansTitle) {
        this.queansTitle = queansTitle == null ? null : queansTitle.trim();
    }

    public Integer getQueansSort() {
        return queansSort;
    }

    public void setQueansSort(Integer queansSort) {
        this.queansSort = queansSort;
    }

    public String getQueansImg1() {
        return queansImg1;
    }

    public void setQueansImg1(String queansImg1) {
        this.queansImg1 = queansImg1 == null ? null : queansImg1.trim();
    }

    public String getQueansImg2() {
        return queansImg2;
    }

    public void setQueansImg2(String queansImg2) {
        this.queansImg2 = queansImg2 == null ? null : queansImg2.trim();
    }

    public String getQueansImg3() {
        return queansImg3;
    }

    public void setQueansImg3(String queansImg3) {
        this.queansImg3 = queansImg3 == null ? null : queansImg3.trim();
    }

    public String getQueansImg4() {
        return queansImg4;
    }

    public void setQueansImg4(String queansImg4) {
        this.queansImg4 = queansImg4 == null ? null : queansImg4.trim();
    }

    public String getQueansImg5() {
        return queansImg5;
    }

    public void setQueansImg5(String queansImg5) {
        this.queansImg5 = queansImg5 == null ? null : queansImg5.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }
}