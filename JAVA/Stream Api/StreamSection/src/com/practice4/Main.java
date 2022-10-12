package com.practice4;
@FunctionalInterface
interface Intr{
	void sayHello(String name);
}
public class Main {
	public static void main(String[] args) {
		Intr i1 = fun1();
		i1.sayHello("Rajat Yadav");
	}
	public static Intr fun1() {
		return n   ->  System.out.println("Welcome "+n);
	}
}
