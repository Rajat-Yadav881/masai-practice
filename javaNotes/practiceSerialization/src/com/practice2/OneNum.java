package com.practice2;

public class OneNum {
	synchronized public void fun1(String name) {
		System.out.println("Welcome");
		try {
			Thread.sleep(1000);
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(name);
	}
}
