package com.mavenspring.core08;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Demo {
	private int iVar;

	public void setiVar(int iVar) {
		this.iVar = iVar;
	}

	@Override
	public String toString() {
		return "Demo [iVar=" + iVar + "]";
	}
	@PostConstruct
	public void start() {
		System.out.println("In the start method.");
	}
	@PreDestroy
	public void end() {
		System.out.println("In the end method.");
	}
}
