package com.example.demo;


import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PersonController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/persondata")
    public String personData(@ModelAttribute Person person, Model model){

        model.addAttribute("yousaf", person);
        return "personData";

    }
}
