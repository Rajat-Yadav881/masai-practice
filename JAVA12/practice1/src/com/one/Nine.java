package com.one;

public class Nine extends Eight{
	String location;
	String pincode;
	public Nine(String name, int age, String location, String pincode) {
		super(name, age);
		this.location = location;
		this.pincode = pincode;
	}
	
	
	void displayNine() {
		System.out.println(this.location);
		System.out.println(this.pincode);
	}
	
	public static void main(String[] args) {
		Eight eight = new Nine("rajat", 34, "delhi","343535");
		
	}
}
