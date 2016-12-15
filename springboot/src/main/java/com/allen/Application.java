package com.allen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Allen on 2016/12/7.
 */

//其中@SpringBootApplication申明让spring boot自动给程序进行必要的配置，等价于以默认属性使用@Configuration，@EnableAutoConfiguration和@ComponentScan
@ServletComponentScan
@SpringBootApplication
public class Application extends WebMvcConfigurerAdapter {

    /**
          （1）Application.java类中继承：WebMvcConfigurerAdapter
         （2）覆盖方法：configureContentNegotiation
        
         favorPathExtension表示支持后缀匹配，
         属性ignoreAcceptHeader默认为fasle，表示accept-header匹配，defaultContentType开启默认匹配。
            例如：请求aaa.xx，若设置<entry key="xx" value="application/xml"/> 也能匹配以xml返回。
     根据以上条件进行一一匹配最终，得到相关并符合的策略初始化ContentNegotiationManager  
          */
    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer){
        configurer.favorPathExtension(false);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, new String[]{"hello","Allen"});
    }

}
