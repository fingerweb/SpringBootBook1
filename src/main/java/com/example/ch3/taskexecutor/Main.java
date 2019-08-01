package com.example.ch3.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String...args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
		AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
		
		for(Integer i = 0; i < 10; i++) {
			asyncTaskService.executorAsyncTask(i);
			asyncTaskService.executorAsyncTaskPlus(i);
		}
		context.close();
	}
}
