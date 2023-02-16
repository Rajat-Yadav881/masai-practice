package com.leetcode;

import java.util.*;

//2279. Maximum Bags With Full Capacity of Rocks
public class Two {
	public static void main(String[] args) {
		int[]capacity = new int[] {2,3,4,5};
		int[]rocks = new int[] {1,2,4,4};
		int additionalRocks = 2;
		int x = maximumBags(capacity,rocks,additionalRocks);
		System.out.println(x);
	}
	public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
		int n = rocks.length;
		
		int[] arr1 = new int[n];
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = capacity[i]-rocks[i];
		}
		
		Arrays.sort(arr1);
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]>additionalRocks) {
				return i;
			}
			additionalRocks -= arr1[i];
		}
		return n;
	}
}



//
//
//2279. Maximum Bags With Full Capacity of Rocks
//You have n bags numbered from 0 to n - 1. You are given two 0-indexed integer 
//arrays capacity and rocks. The i'th bag can hold a maximum of capacity[i] rocks 
//and currently contains rocks[i] rocks. You are also given an integer additional
//Rocks, the number of additional rocks you can place in any of the bags.
////
//Return the maximum number of bags that could have full capacity after placing 
//the additional rocks in some bags.
//
// 
//
//Example 1:
//
//Input: capacity = [2,3,4,5], rocks = [1,2,4,4], additionalRocks = 2
//Output: 3
//Explanation:
//Place 1 rock in bag 0 and 1 rock in bag 1.
//The number of rocks in each bag are now [2,3,4,4].
//Bags 0, 1, and 2 have full capacity.
//There are 3 bags at full capacity, so we return 3.
//It can be shown that it is not possible to have more than 3 bags at full capacity.
//Note that there may be other ways of placing the rocks that result in an answer of 3.
//Example 2:
//
//Input: capacity = [10,2,2], rocks = [2,2,0], additionalRocks = 100
//Output: 3
//Explanation:
//Place 8 rocks in bag 0 and 2 rocks in bag 2.
//The number of rocks in each bag are now [10,2,2].
//Bags 0, 1, and 2 have full capacity.
//There are 3 bags at full capacity, so we return 3.
//It can be shown that it is not possible to have more than 3 bags at full capacity.
//Note that we did not use all of the additional rocks.