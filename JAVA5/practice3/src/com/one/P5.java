package com.one;

public class P5 {
	public static void main(String[] args) {
		int n = 1634;
		int dup = n;
		int count = 0;
		while(n>0) {
			int temp = n%10;
			
			n = n/10;
			count += (temp*temp*temp);
		}
		if(dup == count)
			System.out.println("amstrone number");
		else 
			System.out.println("Error");
	}
}
