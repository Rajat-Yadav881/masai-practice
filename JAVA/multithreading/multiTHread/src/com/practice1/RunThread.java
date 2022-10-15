package com.practice1;

public class RunThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("Inside the run method");
	}
	
	public static void main(String[] args) {
		RunThread t1 = new RunThread();
		RunThread t2 = new RunThread();
		RunThread t3 = new RunThread();
		
		System.out.println("t1 thread priority : " + t1.getPriority());
		System.out.println("t2 thread priority : " + t2.getPriority());
		System.out.println("t3 thread priority : " + t3.getPriority());
		
		t1.setPriority(2);
		t2.setPriority(5);
		t3.setPriority(8);
		
		System.out.println("t1 thread priority : " + t1.getPriority());
		System.out.println("t2 thread priority : " + t2.getPriority());
		System.out.println("t3 thread priority : " + t3.getPriority());
		
		System.out.println("currently Executing Thread : "+Thread.currentThread().getName());
		System.out.println("Main thread priority : "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("Main thread priority : "+Thread.currentThread().getPriority());
	}

}
