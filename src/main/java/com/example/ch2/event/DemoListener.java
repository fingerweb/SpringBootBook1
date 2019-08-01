package com.example.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
/**
 * 2.定义事件监听器，实现ApplicationListener.
 * @author yuyz
 *
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{
	
	//使用onApplicationEvent方法对消息进行接收处理
	@Override
	public void onApplicationEvent(DemoEvent event) {
		// TODO Auto-generated method stub
		String msg = event.getMsg();
		
		System.out.println("我（bean-domoListener）接收到了bean-demoPublisher发布的消息：" + msg);
		
	}
	

}
