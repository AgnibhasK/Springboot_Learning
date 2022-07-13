package com.knoldus.learning.controller;

import com.knoldus.learning.entity.AnswerEntity;
import com.knoldus.learning.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @GetMapping("/answers")
    public String showAnswers(Model model) {
        List<AnswerEntity> listAnswers = answerService.listAllAnswers();
        model.addAttribute("listAnswers", listAnswers);

        return "answers";
    }
}
