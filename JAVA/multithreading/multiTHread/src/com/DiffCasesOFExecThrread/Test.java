package com.DiffCasesOFExecThrread;

//performing the multiple task from single thread--this case cannot be possible because it can not handle it at the same time (simountaniouly)
//performing the multiple task from multiple threads

public class Test extends Thread{
	public void run() {
		System.out.println("thread task default");
	}
	
}

class Test1 extends Thread{
	public void run() {
		System.out.println("thread task 1");
	}
	
}
class Test2 extends Thread{
	public void run() {
		System.out.println("thread task 2");
	}
	
}

