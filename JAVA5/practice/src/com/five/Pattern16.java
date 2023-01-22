package com.five;

public class Pattern16 {
	public static void main(String[] args) {
		int n = 5;
		for(int i=0;i<n;i++) {
			char ch = (char) ('A'+i);
			for(int j=0;j<i+1;j++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
}
