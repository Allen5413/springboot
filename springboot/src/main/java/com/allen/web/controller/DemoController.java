package com.allen.web.controller;

import com.allen.entity.Demo;
import com.allen.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Allen on 2016/12/8 0008.
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Resource
    private DemoService demoService;

    /**
     * 测试保存数据方法.
     * @return
     */
    @RequestMapping("/save")
    public String save(){
        Demo d = new Demo();
        d.setName("Allen");
        demoService.save(d);//保存数据.
        return "ok.Demo2Controller.save";
    }

    @RequestMapping("/getById")
    public Demo getById(long id){
        return demoService.getById(id);
    }

}
