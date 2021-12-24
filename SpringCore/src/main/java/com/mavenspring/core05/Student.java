package com.mavenspring.core05;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Component;
@Component("student")
public class Student {

	@Resource(name="studentUser")
	private int sId;
	@Resource(name="studentUser")
	private String sName;
	@Inject
	private Address sAddress;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Address getsAddress() {
		return sAddress;
	}
	public void setsAddress(Address sAddress) {
		this.sAddress = sAddress;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAddress=" + sAddress + "]";
	}
	
}
