package com.example.demoVersion.service;

import com.example.demoVersion.db.UserCredentials;
import com.example.demoVersion.db.UserRegistrationRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayDeque;
import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.Silent.class)
public class UserRegistrationServiceTest {

    @InjectMocks
    private UserRegistrationService userRegistrationService;

    @Mock
    private UserRegistrationRepository userRegistrationRepository;

    @Test
    public void saveUserPetyaCredentials() {
        userRegistrationService.saveUserCredentials("petya", "upassword");
        verify(userRegistrationRepository).save(any());

    }
    @Test
    public void saveUserOtherCredentials() {
        userRegistrationService.saveUserCredentials("vasya", "upassword");
        verify(userRegistrationRepository, never()).save(any());
    }

//    @Test
//    public void findUsersCredentials() {
//        ArrayList<UserCredentials> objects = new ArrayList<>();
//        UserCredentials userCredentials = new UserCredentials();
//        userCredentials.setUname("im Mock!");
//        objects.add(userCredentials);
//        when(userRegistrationRepository.findAll()).thenReturn(objects);
//        userRegistrationService.saveUserCredentials("","");
//
//    }
}