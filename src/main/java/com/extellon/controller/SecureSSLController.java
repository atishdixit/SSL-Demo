package com.extellon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class SecureSSLController {

    @RequestMapping("/check")
    public String check(){
        return "Hello I am Secure with SSL " + new Date();
    }
}
