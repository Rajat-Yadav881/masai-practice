package com.Two;

public class Two {
	public synchronized void funB(One a1) {
		System.out.println("funB of B starts");
		a1.fun1();
		System.out.println("funB of B ends");
	}
	
	public synchronized void fun2() {
		System.out.println("inside the fun1 of B");
	}
}