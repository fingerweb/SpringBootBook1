package com.example.ch2.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String...args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(PrePostConfig.class);
		context.close();
		
	}
}
