package com.mavenspring.core07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("Config7.xml");
		Demo d=(Demo) ac.getBean("demo");
		System.out.println(d);
	}

}
