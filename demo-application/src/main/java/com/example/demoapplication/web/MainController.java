package com.example.demoapplication.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    @PostMapping("/register")
        public String fillTheRegister(Model model, String name, String pass){
        model.addAttribute("username", name);
        return "greeting";
    }


}
