package com.multithreaded2;

public class ThreadB implements Runnable{
	@Override
	public void run() {
		System.out.println("Inside the run method of ThreadB");
		for(int i=50;i<60;i++) {
			String tname = Thread.currentThread().getName();
			System.out.println(tname+" is running");
		}
		System.out.println("end of run method of ThreadB");
	}
}
