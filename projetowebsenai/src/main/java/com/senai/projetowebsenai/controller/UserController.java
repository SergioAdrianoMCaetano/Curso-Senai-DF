package com.senai.projetowebsenai.controller;

import com.senai.projetowebsenai.model.UserModel;
import com.senai.projetowebsenai.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @GetMapping
    public String index(){
        return "user/users.html";
    }

}
