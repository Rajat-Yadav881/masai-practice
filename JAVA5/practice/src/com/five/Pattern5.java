package com.five;

public class Pattern5 {
	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
			for(int j = 0;j<4-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
