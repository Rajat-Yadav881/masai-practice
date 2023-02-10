package com.one;

import java.util.Arrays;

public class Twelve {
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4};
		int m = arr.length;
		int[] lst = new int[m];
		for(int i=0;i<arr.length;i++) {
			lst[i] = pro(arr,arr[i]);
		}
		System.out.println(Arrays.toString(lst));
	}
	
	public static int pro(int[]arr,int n) {
		int product = 1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=n) {
				product *= arr[i];
			}
		}
		return product;
	}
}
