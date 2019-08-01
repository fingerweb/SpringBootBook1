package com.example.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
/**
 * Scope描述Spring容器如何创建Bean实例
 * Spring的Scope有singleton,prototype,request,session
 * singleton:一个spring容器只有一个Bean实例，single是spring的默认配置
 * prototype:每次调用新建一个Bean实例。
 * request：Web项目中，给每一个http request新建一个Bean实例
 * session：Web项目中，给每一个http session新建一个Bean实例
 * 
 * @author yuyz
 *
 */
@Service
@Scope(value="prototype")
public class DemoPrototypeService {

}
