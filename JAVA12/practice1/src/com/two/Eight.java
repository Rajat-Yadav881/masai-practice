package com.two;

import java.util.*;

public class Eight {
	public static void main(String[] args) {
		int[] nums = new int[]{-8,-7,-6};
		int size = nums.length;
		HashMap<Integer, Integer>map = new HashMap<>();
		
		for(int i=0;i<size;i++) {
			if(map.get(nums[i])==null) {
				map.put(nums[i], 1);
			}else {
				int n = map.get(nums[i]);
				map.put(nums[i], n++);
			}
		}
		System.out.println(map);
	}
	
	
}
