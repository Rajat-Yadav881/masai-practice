package com.OneCollection;

public class Demo {
	public void fun1(int num1,int num2) throws InvalidAgeException{
		int result = num1/num2;
		try {
			System.out.println("result is :"+result);
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
			
			InvalidAgeException ie = new InvalidAgeException("num2 is zero");
			throw ie;
		}
		
		
	}
	public static void main(String[] args) {
		System.out.println("Start of main...");
		
		Demo d1 = new Demo();
		try {
			d1.fun1(10,2);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("end of main");
	}
}
