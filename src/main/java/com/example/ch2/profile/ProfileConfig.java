package com.example.ch2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Profile为dev时，实例化devDemoBean
 * Profile为prod时，实例化prodDemoBean
 * @author yuyz
 *
 */
@Configuration
public class ProfileConfig {
	
	@Bean
	@Profile("dev")
	public DemoBean devDemoBean() {
		return new DemoBean("from development profile");
	}
	
	@Bean
	@Profile("prod")
	public DemoBean prodDemoBean() {
		return new DemoBean("from production profile");
	}
}
