package com.knoldus.learning.controller;

import com.knoldus.learning.entity.LoginEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String init(Model model) {
        model.addAttribute("msg", "Please Enter Your Login Details");
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String submit(Model model, @ModelAttribute("loginEntity") LoginEntity loginEntity) {
        if (loginEntity != null && loginEntity.getUserName() != null & loginEntity.getPassword() != null) {
            if (loginEntity.getUserName().equals("Agnibhas") && loginEntity.getPassword().equals("password")) {
                model.addAttribute("msg", loginEntity.getUserName());
                return "success";
            } else {
                model.addAttribute("error", "Invalid Details");
                return "login";
            }
        } else {
            model.addAttribute("error", "Please enter Details");
            return "login";
        }
    }
}
