package com.hackerRank;

import java.util.ArrayList;
import java.util.List;

public class AppleAndOrange {
	public static void main(String[] args) {

		int s =2;
		int t = 3;
		int a = 1;
		int b = 5;
		int m = 1;
		List<Integer> apples = new ArrayList<>();
		apples.add(2);
//		apples.add(3);
//		apples.add(-4);
		int n = 1;
		List<Integer> oranges = new ArrayList<>();
//		oranges.add(3);
		oranges.add(-2);
//		oranges.add(-4);
		List<Integer> lst = new ArrayList<>();
		for(int i=s;i<=t;i++) {
			lst.add(i);
		}
		System.out.println(lst);
		int countA = 0;
		for(int i=0;i<apples.size();i++) {
			if(find(a+apples.get(i),lst)) {
				countA++;
			}
		}
		int countB=0;
		for(int i=0;i<oranges.size();i++) {
			if(find(b+oranges.get(i),lst)) {
				countB++;
			}
		}
		System.out.println(countA+" "+countB);
	}
	public static boolean find(int k,List<Integer> arr) {
		int left = 0;
	    int right = arr.size() - 1;
	    while (left <= right) {
	        int mid = left + (right - left) / 2;
	        if (arr.get(mid) == k) {
	            return true;
	        } else if (arr.get(mid) < k) {
	            left = mid + 1;
	        } else {
	            right = mid - 1;
	        }
	    }
	    return false;
	}
}
