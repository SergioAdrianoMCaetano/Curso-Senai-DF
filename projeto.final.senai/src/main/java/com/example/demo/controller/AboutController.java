package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/sobre")
public class AboutController {

    @GetMapping
    public String index(){
        return "about/sobre";
    }
}
