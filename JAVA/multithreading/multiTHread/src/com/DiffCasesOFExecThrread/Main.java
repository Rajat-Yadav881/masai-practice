package com.DiffCasesOFExecThrread;

public class Main{
	public static void main(String[] args) {
		//here i am performing the multiple task from multiple threads
		
		Test test = new Test(); //thread 1
		test.start();
		Test1 test1 = new Test1(); //thread 2
		test1.start();
		Test2 test2 = new Test2(); //thread 3
		test2.start();
	}
		//we cannot judge the execution of the threads
		//because all the threads will be running at the same time
}
