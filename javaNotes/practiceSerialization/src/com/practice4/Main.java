package com.practice4;

public class Main {
	public static void main(String[] args){
		MyThread myThread = new MyThread();
		myThread.start();
		synchronized (myThread) {
			System.out.println("main thread calls the wait method");
		
				try {
					myThread.wait();
				} catch (Exception e) {
					// TODO Auto-generated catch block
				
				}
			
			System.out.println("main thread got the notification");
			System.out.println(myThread.total);

		}
		
	}
}
