package com.five;

public class Pattern15 {
	public static void main(String[] args) {
		int n = 5;
		for(int i=0;i<n;i++) {
			for(char j = 'A';j<='A'+(n-i-1);j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
