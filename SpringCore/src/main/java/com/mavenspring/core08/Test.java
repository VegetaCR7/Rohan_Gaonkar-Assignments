package com.mavenspring.core08;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		 
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Config8.xml");
		context.registerShutdownHook();
		Demo d=(Demo) context.getBean("annot");
		System.out.println(d);
	}

}
