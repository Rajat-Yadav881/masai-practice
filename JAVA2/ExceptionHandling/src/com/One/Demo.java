package com.One;

public class Demo {
	
	public static void main(String[] args) {
		System.out.println("start the main");
		try {
			
			
			int x = 100;
			int y = 0;
			
			int z = x/y;
			
			System.out.println("the result is : "+z);
			
			
			
		}catch(Exception e) {
			e.getMessage();
			e.getStackTrace();
			
//			System.out.println("their are some error in denominator");
		}
		System.out.println("End of the main....");
	}
	
	
}
