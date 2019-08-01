package com.example.ch3.taskScheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTaskService {
	private static final SimpleDateFormat dateFormat = 
			new SimpleDateFormat("HH:mm:ss");
	
	/**
	 * 使用cron属性可按照指定时间执行
	 */
	@Scheduled(cron= "0 10 21 ? * *")
	public void fixTimeExecution() {
		System.out.println("在指定时间 " + dateFormat.format(new Date()) + "执行");
	}
	/**
	 * fixedRate属性每隔固定时间
	 */
	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {
		System.out.println("每隔五秒执行一次 " + dateFormat.format(new Date()));
	}
	/**
	 * fixedDelay属性每隔“执行时间”+固定时间，执行一次
	 */
	@Scheduled(fixedDelay = 5000)
	public void reportCurrentTime2() {
		System.out.println("每个固定时间执行一个(执行时间+5000) " + dateFormat.format(new Date()));
	}
}
