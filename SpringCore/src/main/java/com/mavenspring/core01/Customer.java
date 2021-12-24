package com.mavenspring.core01;

public class Customer {
	private int customerId;
	private String customerName;
	private long customerContact;
	private Address customerAddress;
	//Settters
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	//Constructor
	/*
	 * public Customer(int customerId, String customerName, long customerContact,
	 * Address customerAddress) { super(); this.customerId = customerId;
	 * this.customerName = customerName; this.customerContact = customerContact;
	 * this.customerAddress = customerAddress; }
	 */
	public void customerInfo() {
		System.out.println("ID: "+customerId);
		System.out.println("Name: "+customerName);
		System.out.println("Contact: "+customerContact);
		System.out.println("Address :"+customerAddress);
	}
}
