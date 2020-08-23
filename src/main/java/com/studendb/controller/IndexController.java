package com.studendb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(final Model model){

        return "index";
    }


    @GetMapping("/addStudent")
    public String addStudent(final Model model){

        return "addStudent";
    }


    @GetMapping("/rider")
    public String rider(final Model model){

        return "rider";
    }
}
