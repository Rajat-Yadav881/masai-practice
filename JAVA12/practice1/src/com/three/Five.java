package com.three;

public class Five {
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,1,3,2};
		int m = 3;
		int d = 2;
		int sum = 0;
		int c = 0;
		for(int i=0;i<d;i++) {
			
			sum += arr[i];
			
		}
		if(sum==m) {
			c++;
		}
		int curr = sum;
		
		for(int i = d;i<arr.length;i++) {
			curr += arr[i]-arr[i-d];
			System.out.println(curr);
		}
	}
}
