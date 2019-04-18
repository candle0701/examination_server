package com.examination.model;

import java.util.Date;

public class Bank extends BankKey {
    private String title;

    private String opendate;

    private Integer questionType;

    private String grade;

    private String url;

    private String ifDone;

    public String getIfDone() {
        return ifDone;
    }

    public void setIfDone(String ifDone) {
        this.ifDone = ifDone;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getOpendate() {
        return opendate;
    }

    public void setOpendate(String opendate) {
        this.opendate = opendate;
    }

    public Integer getQuestionType() {
        return questionType;
    }

    public void setQuestionType(Integer questionType) {
        this.questionType = questionType;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }
}