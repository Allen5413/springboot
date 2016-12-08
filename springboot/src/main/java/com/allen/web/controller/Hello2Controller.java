package com.allen.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by Allen on 2016/12/7.
 */
@Controller
public class Hello2Controller {
    /**
     * 返回html模板.
     */
    @RequestMapping("/helloHtml")
    public String helloHtml(Map<String,Object> map){
        map.put("hello", "from Hello2Controller.helloHtml");
        return "/helloHtml";
    }

    @RequestMapping("/helloJsp")
    public String helloJsp(Map<String,Object> map){
        System.out.println("HelloController.helloJsp().hello=from Hello2Controller.helloJsp");
        map.put("hello","HelloController.helloJsp().hello=from Hello2Controller.helloJsp");
        return"helloJsp";
    }

}
