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
public class QuestionEntity {
    @Id
    private int id;

    private String questionTitle;

    private String questionTagged;

    private String questionAuthor;

    private Date questionDate;

    private Time questionTime;

    private int totalNoOfViews;
}
