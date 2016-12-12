package com.allen.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * 系统登录
 * Created by Allen on 2016/12/12.
 */
@Controller
public class LoginController {
    @RequestMapping("/")
    public String login(Map<String,Object> map){
        return "/login";
    }

    @RequestMapping("/index")
    @ResponseBody
    public String index(Map<String,Object> map){
        return "/index";
    }
}
