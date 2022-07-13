package com.knoldus.learning.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnswerEntity {

    @Id
    private int id;

    private Long score;

    private String questionTitle;

    private String answer;

    private String questionTagged;

    private Date answeredDate;

    private Time answeredTime;
}
