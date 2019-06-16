package com.example.demoVersion.controller;

import com.example.demoVersion.service.UserLoginService;
import com.example.demoVersion.service.UserRegistrationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/auth")
public class RegisterController {


    private UserRegistrationService userRegistrationService;

    private UserLoginService userLoginService;


    public RegisterController(UserRegistrationService userRegistrationService,
                              UserLoginService userLoginService) {
        this.userRegistrationService = userRegistrationService;
        this.userLoginService = userLoginService;
    }

    //Лучше не использовать сокращения в назанваниях

    @PostMapping("/register")
    public void register(@RequestParam String uname, @RequestParam String upassword) {
        userRegistrationService.saveUserCredentials(uname, upassword);
    }

    @PostMapping("/login")
    public String login(@RequestParam String uname, @RequestParam String upassword) {
        return userLoginService.controlUserCredentionals(uname, upassword);

    }

}
