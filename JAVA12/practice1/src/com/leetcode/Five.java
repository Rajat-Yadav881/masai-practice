package com.leetcode;

import java.util.Arrays;

public class Five {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int[] av = runningSum(arr);
		
	}
	public static int[] runningSum(int[] nums) {
        int n = nums.length;
        long [] arr = new long[n];
        long sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += (int)nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            arr[i] = (sum);
            sum -= nums[n-2-i];
        }

        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
