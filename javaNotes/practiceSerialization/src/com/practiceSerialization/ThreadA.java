package com.practiceSerialization;

public class ThreadA extends Thread{
	OneNum num ;
	String name;
	public ThreadA(OneNum num,String name) {
		this.num = num;
		this.name = name;
	}
	@Override
	public void run() {
		num.fun1(name);
	}
}
