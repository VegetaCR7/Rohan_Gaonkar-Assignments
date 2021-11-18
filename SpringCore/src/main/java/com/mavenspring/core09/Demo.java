package com.mavenspring.core09;

public class Demo {

	private int iVar;

	public void setiVar(int iVar) {
		this.iVar = iVar;
	}

	@Override
	public String toString() {
		return "Demo [iVar=" + iVar + "]";
	}
	
	public void start() {
		System.out.println("In the start method.");
	}
	
	public void end() {
		System.out.println("In the end method.");
	}
}
