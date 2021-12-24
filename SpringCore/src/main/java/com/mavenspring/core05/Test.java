package com.mavenspring.core05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext("com.mavenspring.core05.StudentConfig");
		Student stud=(Student) ac.getBean("student");
		if(stud.getsAddress()==null)
		{
			System.out.println("Student ID: "+stud.getsId());
			System.out.println("Student Name: "+stud.getsName());
			System.out.println("Student Address is not provided");
		}
		else
		{
			System.out.println("Student ID: "+stud.getsId());
			System.out.println("Student Name: "+stud.getsName());
			System.out.println("Student Address:"+ stud.getsAddress().getStreet()+","+stud.getsAddress().getCity()+","+
			stud.getsAddress().getState());
		}
	}

}
