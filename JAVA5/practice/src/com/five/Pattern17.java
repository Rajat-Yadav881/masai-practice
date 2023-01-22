package com.five;

public class Pattern17 {
	public static void main(String[] args) {
		int n = 5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(char j = 'A';j<=2*n-2*i-1;j++) {
				
			}
			for(int j=0;j<n-i-1;j++) {
				System.out.println(" ");
			}
		}
	}
	
}
