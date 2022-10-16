package com.practice2;

public class ThreadB extends Thread{
	OneNum num ;
	String name;
	public ThreadB(OneNum num,String name) {
		this.num = num;
		this.name = name;
	}
	@Override
	public void run() {
		num.fun1(name);
	}
}