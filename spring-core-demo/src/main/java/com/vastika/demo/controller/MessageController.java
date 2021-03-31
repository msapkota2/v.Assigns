package com.vastika.demo.controller;

import com.vastika.demo.service.EmailService;
import com.vastika.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageController {
    @Autowired
   // @Qualifier("textService")
    private MessageService messageService;
//    @Autowired
//    public void setMessageService(MessageService messageService)
//    {
//        this.messageService=messageService;
//    }

//    public MessageController(MessageService messageService)
//    {
//        this.messageService=messageService;
//    }

    public void sendMessage(String message)
    {
        messageService.send("HELLO");

    }
}
