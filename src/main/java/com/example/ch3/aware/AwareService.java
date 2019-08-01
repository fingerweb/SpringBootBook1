package com.example.ch3.aware;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
/**
 *  实现BeanNameAware,ResourceLoaderAware接口，获得Bean名称和资源加载的服务
 * @author yuyz
 *
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware{
	private String beanName;
	private ResourceLoader loader;
	
	//实现ResourceLoaderAware，需重写setResourceLoader
	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		// TODO Auto-generated method stub
		this.loader = resourceLoader;
	}
	
	//实现BeanNameAware,需重写setBeanName方法
	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		this.beanName = name;
	}
	
	public void outputResult() {
		System.out.println("Bean的名称：" + beanName);
		Resource resource = 
				loader.getResource("classpath:com/example/ch3/aware/test.txt");
		try {
			System.out.println("ResourceLoader加载的文件内容为：" +
					IOUtils.toString(resource.getInputStream()));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
