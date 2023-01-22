package com.one;

public class P2 {
	//count the number of digits in integer n;
	
	public static void main(String[] args) {
		int n = 773545269;
		
		int count  = (int)(Math.log10(n)+1);
		
		System.out.println(count);
	}

	
}
