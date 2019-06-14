package com.example.demoVersion.service;

import com.example.demoVersion.db.UserCredentials;
import com.example.demoVersion.db.UserRegistrationRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class UserLoginService {

    private UserRegistrationRepository userRegistrationRepository;


    public UserLoginService(UserRegistrationRepository userRegistrationRepository) {
        this.userRegistrationRepository = userRegistrationRepository;
    }


    public void controlUserCredentionals(@RequestParam String uname, @RequestParam String upassword) {
        UserCredentials userCredentials = new UserCredentials();
        if (uname.equals(userCredentials.getUname()) && upassword.equals(userCredentials.getUpassword())) {
            System.out.println("You are successfully logged in");
        } else {
            System.out.println("username or password is wrong!");
        }

    }
}
