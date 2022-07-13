package com.knoldus.learning.controller;

import com.knoldus.learning.entity.AnswerEntity;
import com.knoldus.learning.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @GetMapping("/answers")
    public List<AnswerEntity> showAnswers(Model model) {
        List<AnswerEntity> listAnswers = answerService.listAllAnswers();
        model.addAttribute("listAnswers", listAnswers);

        return listAnswers;
    }
}
