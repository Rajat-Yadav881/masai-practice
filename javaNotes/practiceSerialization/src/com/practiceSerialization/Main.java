package com.practiceSerialization;

public class Main {
	public static void main(String[] args) {
		
		OneNum num = new OneNum();
		ThreadA t1 = new ThreadA(num, "rajat");
		ThreadB t2 = new ThreadB(num, "Shayam");
		t1.start();
		t2.start();
	}
}

 