package com.multithreaded2;

public class Demo {
	public static void main(String[] args) {
		
		ThreadA t1 = new ThreadA();
		ThreadB t2 = new ThreadB();
		ThreadC t3 = new ThreadC();
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		for(int i=70 ; i<80 ; i++) {
			System.out.println("Inside main of the Demo: "+i);
		}
		
		System.out.println("end of the main");
	}
}
