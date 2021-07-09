package com.example.springbootsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    
    @GetMapping("/login")
    public String getLogin(){
        return "login/login";
    }

    /** ユーザー一覧画面にリダイレクト */

    @PostMapping
    public String postLogin(){
        return "redirect:/user/list";
    }
}
