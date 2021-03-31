package com.vastika.demo.config;

import com.vastika.demo.controller.MessageController;
import com.vastika.demo.service.EmailService;
import com.vastika.demo.service.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.vastika.demo")
@PropertySource(value="classpath:message.properties")
public class SpringConfig
{

}
