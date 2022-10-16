package com.Two;

public class ThreadB extends Thread{
	One one;
	Two two;
	public ThreadB(One one, Two two) {
	
		this.one = one;
		this.two = two;
	}
	@Override
	public void run() {
		two.funB(one);
	}
}
