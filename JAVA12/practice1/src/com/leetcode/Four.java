package com.leetcode;


public class Four {
	public static void main(String[] args) {
		int[] arr = new int[] {2,3,-2,4};
		int n = arr.length;
		int z = product(arr,n);
		System.out.println(z);
	}
	public static int product(int[] arr,int n) {
		int ans = arr[0];
		int min = ans;
		int max = ans;
		for(int i=1;i<n;i++) {
			if(arr[i]<0) {
				swap(min,max);
			}
			min = Math.min(arr[i],arr[i]*min);
			max = Math.max(arr[i], arr[i]*max);
			ans = Math.max(ans,max);
		}
		return ans;
	}
	public static void swap(int x,int y) {
		int temp = x;
		x = y;
		y = temp;
	}
}
/*Given an integer array nums, find a 
subarray
 that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

 

Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.*/