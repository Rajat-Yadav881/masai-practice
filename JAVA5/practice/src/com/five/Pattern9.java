package com.five;

public class Pattern9 {
	public static void main(String[] args) {
		Pattern9 pattern9 = new Pattern9();
		pattern9.sideUp();
		pattern9.sideDown();
	}
	
	public void sideUp() {
		int n = 5;
		for(int i=0;i<n;i++) {
			//space
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			//star
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
			//space
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public void sideDown() {
		int n = 5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*n-2*i-1;j++) {
				System.out.print("*");
			}
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
