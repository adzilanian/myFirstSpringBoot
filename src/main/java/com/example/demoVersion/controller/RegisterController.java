package com.example.demoVersion.controller;

import com.example.demoVersion.service.UserLoginService;
import com.example.demoVersion.service.UserRegistrationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/auth")
public class RegisterController {


   private UserRegistrationService userRegistrationService;

   private UserLoginService userLoginService;


    public RegisterController (UserRegistrationService userRegistrationService) {
        this.userRegistrationService=userRegistrationService;
    }

    @PostMapping("/register")
    public void register(@RequestParam String uname, @RequestParam String upassword) {
        userRegistrationService.saveUserCredentionals(uname,upassword);
    }

    @PostMapping("/login")
    public void login(@RequestParam String uname, @RequestParam String upassword) {
        userLoginService.controlUserCredentionals(uname,upassword);
    }

}
