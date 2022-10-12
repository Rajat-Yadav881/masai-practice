package com.practice7;
@FunctionalInterface
interface Intr{
	void printNumber(int number);
}
public class InstanceMethod1 {
	public void fun1 (int num) {
		System.out.println("Using non-static Method reference Welcome "+num);
	}
	public static void main(String[] args) {
		Intr intr = new InstanceMethod1() :: fun1;
		intr.printNumber(45);
		
		Intr intr2 = System.out :: print;
		intr2.printNumber(456);
		
	}
}
