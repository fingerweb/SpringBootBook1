计划任务在Spring中实现很简单。
	1.首先通过配置类注解@EnableScheduling来开启对计划任务的支持。
	2.在要执行计划任务的方法上注解@Scheduled,声明这是一个计划任务。
spring通过@Scheduled支持多种类型的计划任务：
	1.@Scheduled(cron= "0 10 21 ? * *")
	使用cron属性可按照指定时间执行
	
	2.@Scheduled(fixedRate = 5000)
	fixedRate属性每隔固定时间
	
	3.@Scheduled(fixedDelay = 5000)
	fixedDelay属性每隔“执行时间”+固定时间，执行一次