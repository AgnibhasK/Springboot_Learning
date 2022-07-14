package com.knoldus.learning.service;

import com.knoldus.learning.entity.AnswerEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AnswerService {

    public List<AnswerEntity> listAllAnswers();
}
