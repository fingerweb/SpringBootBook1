package com.example.ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
/**
 * 3.使用容器发布事件
 * @author yuyz
 *
 */
@Component
public class DemoPublisher {
	
	//注入ApplicationContext用来发布事件
	@Autowired
	ApplicationContext applicationContext;
	
	//使用ApplicationContext的publishEvent方法来发布。
	public void publish(String msg) {
		applicationContext.publishEvent(new DemoEvent(this, msg));
	}
}
