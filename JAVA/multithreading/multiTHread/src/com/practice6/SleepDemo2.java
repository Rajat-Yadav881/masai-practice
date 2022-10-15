package com.practice6;

public class SleepDemo2 extends Thread{
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println(i+" : "+Thread.currentThread().getName());
				Thread.sleep(1000);
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		SleepDemo2 demo2 = new SleepDemo2();
		demo2.start();
		
		SleepDemo2 demo3 = new SleepDemo2();
		demo3.start();
	}
}
