package com.mavenspring.core01;

public class Address {
	private String street;
	private String city;
	private String state;
	private String zip;
	private String country;
	//Constructor
	/*
	 * public Address(String street, String city, String state, String zip, String
	 * country) { super(); this.street = street; this.city = city; this.state =
	 * state; this.zip = zip; this.country = country; }
	 */
	//Setters
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip + ", country="
				+ country + "]";
	}
}