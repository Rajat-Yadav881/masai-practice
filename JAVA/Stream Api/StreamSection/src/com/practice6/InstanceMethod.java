package com.practice6;
@FunctionalInterface
interface Intr{
	int convertToNumber(String s);
}
public class InstanceMethod {
	public static int fun1(String s) {
		System.out.println("Using static Method reference Welcome "+s);
		return Integer.parseInt(s);
	}
	public static void main(String[] args) {
		
		//using the static method reference 
		Intr intr = InstanceMethod :: fun1;
		System.out.println(intr.convertToNumber("456"));
		
		//using the static method reference
		Intr intr2 = Integer :: parseInt;
		System.out.println(intr2.convertToNumber("43211"));
		
		//using the Lambda Expression
		Intr intr3 = s -> Integer.parseInt(s);
		System.out.println(intr3.convertToNumber("453432"));
	}
}
