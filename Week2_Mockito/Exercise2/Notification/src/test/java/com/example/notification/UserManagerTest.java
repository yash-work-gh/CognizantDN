package com.example;

import org.junit.jupiter.api.Test;

import com.example.NotificationService;

import static org.mockito.Mockito.*;

import javax.management.Notification;


public class UserManagerTest{

    @Test 
    public void testSendNotificationCalledWithCorrectArguments(){
        //Creating a mock notifcationservice
        NotificationService mockService = mock(NotificationService.class);

        // inject into usermanage and call the method
        UserManager userManager = new UserManager(mockService);
        userManager.registerUser("kinshuk");

        //verification
        verify(mockService).sendNotification("kinshuk","Welcome kinshuk!");
    }
}