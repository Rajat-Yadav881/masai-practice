package com.practice6;

public class SleepDemo {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
