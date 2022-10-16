package com.Two;

public class One {
	
	public synchronized void funA(Two b1) {
		System.out.println("funA of A starts");
		b1.fun2();
		System.out.println("funA of A ends");
	}
	public  void fun1() {
		System.out.println("inside the fun1 of A");
	}
}
