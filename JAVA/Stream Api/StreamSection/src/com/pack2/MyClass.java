package com.pack2;
interface Calculator{
	public int calculation(int a,int b);
}
public class MyClass {
	public static void main(String[] args) {
		Calculator plusOperation = (a,b)-> a+b;
		Calculator minusOperation = (a,b)->Math.abs(b-a);
		int x = plusOperation.calculation(34, 56);
		int y = minusOperation.calculation(34, 16);
		System.out.println(x);
		System.out.println(y);
	}
}
