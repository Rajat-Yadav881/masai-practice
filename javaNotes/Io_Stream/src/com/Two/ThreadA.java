package com.Two;

public class ThreadA extends Thread{
	One one;
	Two two;
	public ThreadA(One one, Two two) {
	
		this.one = one;
		this.two = two;
	}
	@Override
	public void run() {
		one.funA(two);
	}
}
