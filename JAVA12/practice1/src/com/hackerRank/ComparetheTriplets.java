package com.hackerRank;

import java.util.ArrayList;
import java.util.List;

public class ComparetheTriplets {
	public static void main(String[] args) {
		List<Integer>arr1 = new ArrayList<>();
		arr1.add(5);
		arr1.add(6);
		arr1.add(7);
		List<Integer>arr2 = new ArrayList<>();
		arr2.add(3);
		arr2.add(6);
		arr2.add(10);
		int c1=0;
		int c2=0;
		for(int i=0;i<3;i++) {
			if(arr1.get(i)>arr2.get(i)) {
				c1++;
			}else if(arr1.get(i)<arr2.get(i)) {
				c2++;
			}else {
				c1 += 0;
				c2 += 0;
			}
		}
		
		List<Integer>d = new ArrayList<>();
		d.add(c1);
		d.add(c2);
		System.out.println(d);
	}
}
