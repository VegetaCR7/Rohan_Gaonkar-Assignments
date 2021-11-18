package com.mavenspring.core05;

import org.springframework.stereotype.Component;

@Component("studentUser")
public class StudentUser {

	private String id="101";
	private String name="Guy";
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "StudentUser [id=" + id + ", name=" + name + "]";
	}

	
	
}
