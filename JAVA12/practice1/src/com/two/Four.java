package com.two;

public class Four {
	public static void main(String[] args) {
		int[] A = new int[] {5, -2, 3 , 1, 2,7};
		int n = A.length;
		int B = 4;
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		sum2 += A[0];
		for(int i=0;i<B;i++) {
			sum += A[i];
			sum1 += A[n-B+1];
			sum2 += A[n-B];
		}
		System.out.println(sum+" "+sum1+" "+sum2);
	}
}
