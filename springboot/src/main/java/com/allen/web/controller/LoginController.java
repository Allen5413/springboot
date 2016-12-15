package com.allen.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.allen.service.user.user.LoginUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 系统登录
 * Created by Allen on 2016/12/12.
 */
@Controller
public class LoginController {

    @Resource
    private LoginUserService loginUserService;

    @RequestMapping("/")
    public String login(){
        return "/login";
    }

    @RequestMapping("/login")
    @ResponseBody
    public JSONObject userLogin(@RequestParam("loginName")String loginName,
                            @RequestParam("pwd")String pwd)throws Exception{
        JSONObject jsonObject = new JSONObject();
        boolean result = loginUserService.login(loginName, pwd);
        if(result){
            jsonObject.put("state", 0);
        }else{
            jsonObject.put("state", 1);
        }
        return jsonObject;
    }

    @RequestMapping("/index")
    public String index(Map<String,Object> map){
        return "/index";
    }
}
