package com.getItTHread;
//Interrupted method is use to check weather a thread is interrupted or not
//IsInterrupted method is used to check weather a thread is interrupted or not
public class Demo111 extends Thread{
	
	public void run() {
		System.out.println(Thread.interrupted());//here checking is the thread is interrupted
//		System.out.println(Thread.currentThread().isInterrupted());
		try {
			for(int i=1;i<=5;i++) {
				System.out.println(i);
				Thread.sleep(1000);
				System.out.println(Thread.interrupted());
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		Demo111 demo111 = new Demo111();
		
		demo111.start();
		demo111.interrupt();
	}
	
	
}
