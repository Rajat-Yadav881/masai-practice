package com.one;

public class Calculation {
	int a;
	public Calculation(int a) {
		this.a= a;
	}
	public int add() {
		a = a+10;
	
	try {
		a = a+10;
		try {
			a = a*10;
			throw new Exception();
		}catch(Exception e) {
			a = a-10;
		}
	}catch(Exception e) {
		a = a-10;
	}
	return a;
	}
	public static void main(String[] args) {
		Calculation calculation = new Calculation(10);
		int result = calculation.add();
		System.out.println("result = "+result);
	}
}

