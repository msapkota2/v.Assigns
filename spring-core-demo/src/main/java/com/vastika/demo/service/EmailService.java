package com.vastika.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailService implements MessageService{

    @Value("${email}")
    private String email;
    @Override
    public void send(String message) {
        System.out.println(message + " is sent to concerned Party via "+email);

    }
}
