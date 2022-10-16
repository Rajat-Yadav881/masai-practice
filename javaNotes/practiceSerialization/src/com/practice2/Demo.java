package com.practice2;

public class Demo {
	public static void main(String[] args) {
		OneNum num1 = new OneNum();
		OneNum num2 = new OneNum();
		
		ThreadA t1=new ThreadA(num1,"Ram");
		ThreadB t2=new ThreadB(num2,"Shyam");
		t1.start();
		t2.start();
	}
}
