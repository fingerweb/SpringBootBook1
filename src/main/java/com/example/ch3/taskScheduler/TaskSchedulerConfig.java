package com.example.ch3.taskScheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

//@EnableScheduling注解开启对计划任务的支持
@Configuration
@ComponentScan("com.example.ch3.taskScheduler")
@EnableScheduling
public class TaskSchedulerConfig {

}
