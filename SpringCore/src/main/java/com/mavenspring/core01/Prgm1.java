package com.mavenspring.core01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prgm1 {

	public static void main(String[] args) {
		
		ApplicationContext testContext= new ClassPathXmlApplicationContext("Config1.xml");
		Customer customer1=(Customer) testContext.getBean("customer");
		customer1.customerInfo();
	}

}
