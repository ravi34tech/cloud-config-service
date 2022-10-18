package com.ravi.spring.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Value("${msg:Config Server is not working. Please check...}")
    private String msg;


    @GetMapping("msg-test")
    public String findMessage(){
        return  this.msg;
    }
}
