package com.vastika.demo.test;

import com.vastika.demo.config.SpringConfig;
import com.vastika.demo.controller.MessageController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MessageTest
{
    public static void main(String[] args)
    {
        ApplicationContext context =new AnnotationConfigApplicationContext(SpringConfig.class);
        MessageController controller=context.getBean(MessageController.class);
        controller.sendMessage("Hello");

    }
}
