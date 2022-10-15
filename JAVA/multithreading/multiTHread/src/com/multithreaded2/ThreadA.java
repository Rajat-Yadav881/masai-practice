package com.multithreaded2;

public class ThreadA extends Thread{
	@Override
	public void run() {
		System.out.println("Inside the run method of ThreadA");
		for(int i=0;i<=10;i++) {
			System.out.println("inside the run method of ThreadA "+i);
		}
		System.out.println("end of run method of ThreadA");
	}
	public static void main(String[] args) {
		ThreadA ta = new ThreadA();
		Thread tr = new Thread(ta);
		tr.start();
		for(int i=50;i<60;i++) {
			System.out.println("Inside main of the threadA");
		}
	}

}
//sleep(),wait(),join()______Blocked state