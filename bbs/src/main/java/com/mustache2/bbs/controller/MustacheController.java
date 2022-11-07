package com.mustache2.bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MustacheController {

    @GetMapping(value = "/hi/{id}")
    public String mustacheCon(@PathVariable String id, Model model) {
        model.addAttribute("username", "shb");// view에 값을 넘기겠
        model.addAttribute("id", id);
        return "greetings"; // greetings라는 이름의 view를 리턴
    }
}
