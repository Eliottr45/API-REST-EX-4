package com.formation.apirestdemo.service;

import com.formation.apirestdemo.repository.NotificationService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service

public class ConsoleNotificationService implements NotificationService {

    @Override
    public void notifier(String statusLocationProduct, String message){
        System.out.println("[NOTIFICATION]" + statusLocationProduct + ": " + message);
    }
}
