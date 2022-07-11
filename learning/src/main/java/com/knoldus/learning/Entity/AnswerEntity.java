package com.knoldus.learning.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Date;

@Entity
public class AnswerEntity {

    @Id
    private int id;

    private Long score;

    private String questionTitle;

    private String answer;

    private String questionTagged;

    private Date answeredDate;

    private Time answeredTime;

    public AnswerEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestionTagged() {
        return questionTagged;
    }

    public void setQuestionTagged(String questionTagged) {
        this.questionTagged = questionTagged;
    }

    public Date getAnsweredDate() {
        return answeredDate;
    }

    public void setAnsweredDate(Date answeredDate) {
        this.answeredDate = answeredDate;
    }

    public Time getAnsweredTime() {
        return answeredTime;
    }

    public void setAnsweredTime(Time answeredTime) {
        this.answeredTime = answeredTime;
    }
}
