package com.example.demoVersion.service;


import com.example.demoVersion.db.UserCredentials;
import com.example.demoVersion.db.UserRegistrationRepository;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {


    private UserRegistrationRepository userRegistrationRepository;


    public UserRegistrationService(UserRegistrationRepository userRegistrationRepository) {
        this.userRegistrationRepository = userRegistrationRepository;
    }

    public void saveUserCredentionals(String uname, String upassword) {

        UserCredentials userCredentials = new UserCredentials();
        userCredentials.setUname(uname);
        userCredentials.setUpassword(upassword);
        userRegistrationRepository.save(userCredentials);
    }


}
