package com.Two;

public class Demo {
	public static void main(String[] args) {
		One one = new One();
		Two two = new Two();
		
		ThreadA t1 = new ThreadA(one, two);
		ThreadB t2 = new ThreadB(one, two);
		
		t1.start();
		t2.start();
	}
}
