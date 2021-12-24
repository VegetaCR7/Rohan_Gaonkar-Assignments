package com.mavenspring.core09;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Config9.xml");
		Demo d=(Demo) context.getBean("meth");
		System.out.println(d);
		context.registerShutdownHook();
	}

}
