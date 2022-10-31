package com.security.example.controller;

import com.security.example.entity.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecurityController {

    @GetMapping("/login")
    public String loginPage()
    {
        return "login";
    }
    @GetMapping("/register")
    public ModelAndView registerPage()
    {
        ModelAndView view=new ModelAndView();
        view.setViewName("register");
        view.addObject("user",new UserForm());
        return view;
    }

    public void print()
    {
        System.out.println("Hello all");
    }
    public void print1()
    {
        System.out.println("vanakkam da mapla theni la irunthu");
    }



}
