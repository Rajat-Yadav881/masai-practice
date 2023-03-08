package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*349. Intersection of Two Arrays
Easy
4.4K
2.1K
Companies
Given two integer arrays nums1 and nums2, 
return an array of their intersection. 
Each element in the result must be unique 
and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 

Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000*/
public class Intersection {
	
	public static void main(String[] args) {
		int[] nums1 = new int[] {1,2,2,1};
		int[] nums2 = new int[] {2,2};
		   HashSet<Integer> set = new HashSet<Integer>();
	        ArrayList<Integer> res = new ArrayList<Integer>();
	        //Add all elements to set from array 1
	        for(int i =0; i< nums1.length; i++) set.add(nums1[i]);
	        for(int j = 0; j < nums2.length; j++) {
	           // If present in array 2 then add to res and remove from set 
	           if(set.contains(nums2[j])) {
	                res.add(nums2[j]);
	                set.remove(nums2[j]);
	            }
	        }
	        // Convert ArrayList to array
	        int[] arr = new int[res.size()];
	        for (int i= 0; i < res.size(); i++) arr[i] = res.get(i);
	        System.out.println(Arrays.toString(arr));
	}
	
}
