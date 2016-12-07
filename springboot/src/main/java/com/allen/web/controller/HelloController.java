package com.allen.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Allen on 2016/12/7.
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String hello(){
        int i = 100/0;
        return "Hello world222!";
    }
}
