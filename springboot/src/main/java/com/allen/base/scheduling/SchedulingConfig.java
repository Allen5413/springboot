package com.allen.base.scheduling;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by Allen on 2016/12/8.
 */
@Configuration
@EnableScheduling
public class SchedulingConfig {
    // 每20秒执行一次
    @Scheduled(cron = "0/20 * * * * ?")
    public void scheduler() {
        //System.out.println(">>>>>>>>> SchedulingConfig.scheduler()");
    }
}
