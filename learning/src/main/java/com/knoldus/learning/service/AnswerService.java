package com.knoldus.learning.service;

import com.knoldus.learning.entity.AnswerEntity;
import com.knoldus.learning.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {

    @Autowired
    private AnswerRepository answerRepository;

    public List<AnswerEntity> listAllAnswers() {
        return (List<AnswerEntity>) answerRepository.findAll();
    }
}
