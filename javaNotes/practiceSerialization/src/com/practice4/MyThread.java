package com.practice4;

public class MyThread extends Thread{
	int total=0;
	public void run() {
		

		synchronized (this) {
			System.out.println("child thread performing calculation");
			for(int i=1;i<=10;i++) {
				total = total+i;
			}
		}
		System.out.println("child thread giving the notification");
		this.notify();
	}
}
