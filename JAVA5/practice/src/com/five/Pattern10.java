package com.five;

public class Pattern10 {
	public static void main(String[] args) {
		int n = 10;
		for(int i=0;i<2*n;i++) {
			int stars = i;
			if(i>n) {
				stars = 2*n-i;
			}
			for(int j=0;j<stars;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
