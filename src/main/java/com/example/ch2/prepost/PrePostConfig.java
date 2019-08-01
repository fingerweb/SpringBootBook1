package com.example.ch2.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.ch2.prepost")
public class PrePostConfig {
	/**
	 * initMethod指定BeanWayService类的init方法在构造之后执行
	 * destroyMethod指定BeanWayService类的destroy方法在Bean销毁之前执行
	 * @return
	 */
	@Bean(initMethod="init", destroyMethod="destroy")
	BeanWayService beanWayService() {
		return new BeanWayService();
	}
}
