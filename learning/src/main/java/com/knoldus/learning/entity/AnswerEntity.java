package com.knoldus.learning.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "answers")
public class AnswerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = true, length = 45)
    private Long score;

    @Column(nullable = true, length = 255)
    private String questionTitle;

    @Column(nullable = true, length = 255)
    private String answer;

    @Column(nullable = true, length = 45)
    private String questionTagged;

    @Column(nullable = true, length = 45)
    private Date answeredDate;

    @Column(nullable = true, length = 45)
    private Time answeredTime;
}
