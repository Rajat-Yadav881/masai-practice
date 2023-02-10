package com.two;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class One {
	public static void main(String args[]){
		int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};
		List<int[]> subarrays = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
            	int subarraySize = j-i+1;
            	int[] subarray = new int[subarraySize];
            	for(int k=0;k<subarraySize;k++) {
            		subarray[k] = nums[i+k];
            	}
            	subarrays.add(subarray);
            }
        }
        int max = Integer.MIN_VALUE;
        for (int[] sub : subarrays) {
        	
        	int sum = 0;
        	for(int i=0;i<sub.length;i++) {
        		sum += sub[i];
        	}
        	if(sum>max) {
        		max = sum;
        	}
        }
        System.out.println(max);
	}
}
