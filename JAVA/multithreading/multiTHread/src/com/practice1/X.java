package com.practice1;

public class X extends Thread{
	
	@Override
	public void run() {
		System.out.println("inside the run method of the X");
		for(int i=1;i<10;i++) {
			System.out.println("Inside run method "+i);
		}
	}

	public static void main(String[] args) {
		//this main method will be called by JVM
		System.out.println("inside the main of the X class");
		
		X x1 = new X();
//		x1.run();
		x1.start(); //now their will be two thread  main thread and child thread
		for(int i=30;i<40;i++) {
			System.out.println("Inside main method "+i);
		}
		
		System.out.println("end of the main of the X");
	}

}
