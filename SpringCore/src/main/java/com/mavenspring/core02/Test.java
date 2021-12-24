package com.mavenspring.core02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Config2.xml");
		Question qsn=(Question) context.getBean("question");
		qsn.displayQsn();
	}

}
