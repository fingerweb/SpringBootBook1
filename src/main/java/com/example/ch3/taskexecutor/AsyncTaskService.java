package com.example.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {
	/**
	 * 通过@Async注解表明该方法是个异步方法，如果注解类级别，则表明该类所有的方法都是异步方法
	 * 而这里的方法自动被注入使用ThreadPoolTaskExecutor作为TaskExecutor
	 * @param i
	 */
	@Async
	public void executorAsyncTask(Integer i) {
		System.out.println("executorAsyncTask : " + i);
	}
	
	@Async
	public void executorAsyncTaskPlus(Integer i) {
		System.out.println("executorAsyncTaskPlus : " + i);
	}
}
