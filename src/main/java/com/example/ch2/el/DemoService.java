package com.example.ch2.el;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;

@Service
public class DemoService {
	@Value("其他类的属性")
	private String another;

	public String getAnother() {
		return another;
	}

	public void setAnother(String another) {
		this.another = another;
	}
	
	
}
