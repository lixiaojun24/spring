package com.rct.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {
	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		Object obj = act.getBean("product");
		System.out.println(obj);
	}
}
