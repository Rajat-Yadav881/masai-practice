package com.multithreaded2;

public class ThreadC extends Thread{
	@Override
	public void run() {
		System.out.println("Inside the run method of ThreadC");
		for(int i=20;i<30;i++) {
			System.out.println("inside the run method of ThreadC "+i);
		}
		System.out.println("end of run method of ThreadC");
	}
}
