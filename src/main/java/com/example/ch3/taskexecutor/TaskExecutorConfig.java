package com.example.ch3.taskexecutor;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * 利用@EnableAsync注解开启异步任务支持
 * 配置类实现AsyncConfigurer接口并重写getAsyncExecutor方法，并返回一个ThreadPoolTaskExecutor
 * ,这样我们就获得一个基于线程池TaskExecutor
 * @author yuyz
 *
 */
@Configuration
@ComponentScan("com.example.ch3.taskexecutor")
@EnableAsync
public class TaskExecutorConfig implements AsyncConfigurer{
	
	@Override
	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		taskExecutor.setCorePoolSize(5);
		taskExecutor.setMaxPoolSize(10);
		taskExecutor.setQueueCapacity(25);
		taskExecutor.initialize();
		return taskExecutor;
	}
}
