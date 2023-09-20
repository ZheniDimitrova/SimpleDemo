package com.example.demoapplication.web;


import com.example.demoapplication.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private final UserService userService;


    public MainController(UserService userService) {
        this.userService = userService;

    }

    @GetMapping("/register")
    public String registerPage(HttpSession httpSession) {

        return "register";
    }

    @PostMapping("/register")
        public String fillTheRegister(Model model, String name,String email,  String pass, HttpSession httpSession){
        model.addAttribute("username", name);
        model.addAttribute("email", email);
        model.addAttribute("password", pass);
        userService.registerUser(name, email, pass);
        return "greeting";
    }






}
