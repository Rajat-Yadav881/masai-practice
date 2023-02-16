package com.hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotation {
	public static void main(String[] args) {
		int d = 6;
		
		List<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		 ArrayList<Integer> list = new ArrayList<>(Arrays.asList(new Integer[5]));
	     Arrays.fill(list.toArray(), -1);
		while(d-->0) {
			for(int i=0;i<arr.size()-1;i++) {
				list.set(i, arr.get(i+1));
				list.set(arr.size()-1, arr.get(0));
			}
			arr.clear();
	        arr.addAll(list);
		}
		System.out.println(arr);
		
	}
}
