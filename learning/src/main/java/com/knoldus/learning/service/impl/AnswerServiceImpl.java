package com.knoldus.learning.service.impl;

import com.knoldus.learning.entity.AnswerEntity;
import com.knoldus.learning.repository.AnswerRepository;
import com.knoldus.learning.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerRepository answerRepository;

    @Override
    public List<AnswerEntity> listAllAnswers() {
        return (List<AnswerEntity>) answerRepository.findAll();
    }


}
