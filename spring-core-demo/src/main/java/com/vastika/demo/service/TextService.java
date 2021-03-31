package com.vastika.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("textService")
public class TextService implements MessageService{

    @Value("${cellNo}")
    private String cellNo;
    @Override
    public void send(String message) {
        System.out.println(message + " is sent to concerned Party via "+ cellNo);

    }
}

