package com.multithreaded2;

public class X extends Thread{
	
	@Override
	public void run() {
		System.out.println("Inside the run method of X");
		for(int i=0;i<=10;i++) {
			System.out.println("inside the run method");
		}
		System.out.println("end of run method of X");
	}
	public static void main(String[] args) {
		System.out.println("inside main method of X class");
		X x1 = new X();
//		x1.run();
		x1.start();
		for(int i=30;i<40;i++) {
			System.out.println("inside the main "+i);
		}
		
		System.out.println("End of main method X");
	}
	
	
}
