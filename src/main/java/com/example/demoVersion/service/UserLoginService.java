package com.example.demoVersion.service;

import com.example.demoVersion.db.UserCredentials;
import com.example.demoVersion.db.UserRegistrationRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Service
public class UserLoginService {

    private UserRegistrationRepository userRegistrationRepository;


    public UserLoginService(UserRegistrationRepository userRegistrationRepository) {
        this.userRegistrationRepository = userRegistrationRepository;
    }

    public void controlUserCredentionals1(@RequestParam String uname, @RequestParam String upassword) {

        boolean found = false;
        Iterable<UserCredentials> all = userRegistrationRepository.findAll();
        for (UserCredentials credentials : all) {
            if (uname.equals(credentials.getUname()) && upassword.equals(credentials.getUpassword())) {
                found = true;
            }
        }
        if (found) {
            System.out.println("You are successfully logged in");
        } else {
            System.out.println("username or password is wrong!");
        }

    }

    public String controlUserCredentionals(@RequestParam String uname, @RequestParam String upassword) {

        Optional<UserCredentials> byUnameAndUpassword = userRegistrationRepository.findByUnameAndUpassword(uname, upassword);
        if (byUnameAndUpassword.isPresent()) {
            return "You are successfully logged in";
        } else {
            return "username or password is wrong!";
        }

    }
}
