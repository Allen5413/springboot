package com.allen.base.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 服务器启动执行
 * Created by Allen on 2016/12/9.
 */
@Component
@Order(value = 2)
public class MyStartupRunner1 implements CommandLineRunner {

    /**
     * 里的args就是程序启动的时候进行设置的:
     * SpringApplication.run(App.class, new String[]{"hello,","林峰"});
     * 这里为了做演示，配置为固定值了，其实直接接收main中的args即可，那么在运行的时候，进行配置即可。
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {
        System.out.println(Arrays.asList(args));
        System.out.println(">>>>>>>>>>>>>>> 服务启动执行，执行加载数据等操作 MyStartupRunner1 1111111111 <<<<<<<<<<<<<");
    }
}
