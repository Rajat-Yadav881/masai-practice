package com.practice6;

import com.practice1.Main;

public class MyThread extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(1000);
			
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
	}
}
