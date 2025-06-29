package com.example;

public class UserManager {
    private NotificationService notificationService;
    
    public UserManager(NotificationService notificationService){
        this.notificationService= notificationService;
    }

    public void registerUser(String username){
        //Simulated business logic
        notificationService.sendNotification(username,"Welcome "+username+"!");
        
    }
}
