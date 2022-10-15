package com.practice4;

public class Main201 extends Thread {
	public void run() {
		System.out.println("child thread");
		
		System.out.println(Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		System.out.println("main thread old priority"+Thread.currentThread().getPriority());
	
		Thread.currentThread().setPriority(7);
		System.out.println("main thread old priority"+Thread.currentThread().getPriority());
		
		Main201 main201 = new Main201();
		main201.setPriority(3);
		main201.start();
	}
}
//priority dependent on the platform (windows does not support priority)