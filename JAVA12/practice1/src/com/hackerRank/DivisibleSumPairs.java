package com.hackerRank;

public class DivisibleSumPairs {
	public static void main(String[] args) {
		int k = 3;
		int[]ar = new int[] {1, 3, 2, 6, 1, 2};
		int c = 0;
		for(int i=0;i<ar.length-1;i++) {
			for(int j = i+1;j<ar.length;j++) {
				if((ar[i]+ar[j])%k==0 && i<j) {
					c++;
				}
			}
		}
		System.out.println(c);
	}
}
