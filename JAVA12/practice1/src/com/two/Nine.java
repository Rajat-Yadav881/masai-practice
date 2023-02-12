package com.two;

import java.util.HashMap;
import java.util.Map;

public class Nine {
	static int missing(int[] nums,int n) {
		Map<Integer, Integer> map = new HashMap<>();
        

        for (int i = 0; i < n; i++) {
            int key = nums[i];
            if (map.containsKey(key)) {
                int count = map.get(key) + 1;
                if (count > n / 2) {
                   return(key);
                    
                }
                map.put(key, count);
            } else {
                map.put(key, 1);
            }
        }
        return(-1);
	}
	public static void main(String[] args) {
		int[] nums = new int[] {2, 1, 2};
		int n = nums.length;
		int c = missing(nums,n);
		System.out.println(c);
	}
}
