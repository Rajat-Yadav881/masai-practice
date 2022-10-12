package com.practice6;
@FunctionalInterface
interface Intr{
	void sayHello(String name);
}
public class MethodReference {
	
	public static void main(String[] args) {
		//className : : methodName     refernce of the static method
		Intr intr = MethodReference :: fun1;
		intr.sayHello("Rajat___");
		
	}
	public static void fun1(String s) {
		System.out.println("using Method refernce Welcome "+s);
	}
}
