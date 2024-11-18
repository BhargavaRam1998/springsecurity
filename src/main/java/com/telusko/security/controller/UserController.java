package com.telusko.security.controller;


import com.telusko.security.model.Users;
import com.telusko.security.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;

    @PostMapping("/register")
    public Users register(@RequestBody Users user){

       return userService.register(user);

    }
}
