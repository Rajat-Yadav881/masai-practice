package com.Oden;

public class A {
	
	static{
		System.out.println("inside the static block");
		A a1 = new A();
		a1.funA();
	}
	
	
	public void funA() {
		System.out.println("inside funA of A");
	}
	
}
  