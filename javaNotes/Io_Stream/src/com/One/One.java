package com.One;

public class One extends Thread{
	@Override
	public void run() {
		System.out.println("Inside run method");
		for(int i=0;i<20;i++) {
			System.out.println("Inside the loop of run :"+i);
		}
		System.out.println("End of run method");
	}
	public static void main(String[] args) {
		One one = new One();
		one.start(); //1 main/1 child thread
		
		for(int i=50;i<60;i++) {
			System.out.println("Inside the loop of main :"+i);
		}
		System.out.println("End of main method");
	}
}
//every thread in java  by Default join with main thread as a last statment of the main method
