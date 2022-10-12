package com.practice3;
interface Intr{
	int doMultiply(int num1,int num2);
}
public class Main {
	public static void main(String[] args) {
		fun1((n1,n2) -> n1*n2);
	}
	
	public static void fun1(Intr i1) {
		System.out.println(i1.doMultiply(23, 3));
	}
}
