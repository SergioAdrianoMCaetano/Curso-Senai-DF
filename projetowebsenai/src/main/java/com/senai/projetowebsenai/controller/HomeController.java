package com.senai.projetowebsenai.controller;

import com.senai.projetowebsenai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class HomeController {


    @GetMapping
    public String index(Model model){
        model.addAttribute("nome","Francisco");
            return "home/index";
    }

}
