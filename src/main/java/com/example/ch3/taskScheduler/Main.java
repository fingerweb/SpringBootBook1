package com.example.ch3.taskScheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String...args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
	}
}
