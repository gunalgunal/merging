package com.security.example.controller;

import com.security.example.entity.UserForm;
import com.security.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping("/admin")
    public String method()
    {

        return "admin";
    }
    @GetMapping("/user")
    public String method3()
    {

        return "user";
    }
    @PostMapping("/user/enrollment")
    public void method1(@RequestBody UserForm user)
    {

        repository.save(user);
    }
}
