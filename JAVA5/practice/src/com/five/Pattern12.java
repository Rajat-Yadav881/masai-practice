package com.five;

public class Pattern12 {
	public static void main(String[] args) {
		int n = 5;
		
		for(int i=0;i<n;i++) {
			//numders
			for(int j=0;j<i+1;j++) {
				System.out.print(j+1);
			}
			//spaces
			for(int j = 0;j< 2*n-2*i-2;j++) {
				System.out.print("-");
			}
			//numbers
			for(int j=i;j>=0;j--) {
				System.out.print(j+1);
			}
			System.out.println();
		}
	}
}
