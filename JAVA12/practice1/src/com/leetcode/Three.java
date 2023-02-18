package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Three {
	public static void main(String[] args) {
		int[] strength = new int[]{1,3,1,2};
		int k = 44;
		long sum = 0;
		for (int i = 0; i < strength.length; i++) {
		    	List<Integer> arr = new ArrayList<>();
		        for (int j = i; j < strength.length; j++) {
		            arr.add(strength[j]);
		            sum += minZ(arr)*sumZ(arr);
		    }
		}
		System.out.println(sum);
	}
	
	public static int sumZ(List<Integer> x) {
		int sum = 0;
		for(int i=0;i<x.size();i++) {
			sum += x.get(i);
		}
		return sum;
	}
	
	public static int minZ(List<Integer> x) {
		int min = Integer.MAX_VALUE;
		for(int i=0;i<x.size();i++) {
			if(x.get(i)<min) {
				min = x.get(i);
			}
		}
		return min;
	}
}
