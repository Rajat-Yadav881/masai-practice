package com.hackerRank;

import java.util.ArrayList;
import java.util.List;

public class BreakingtheRecords {
	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(3);
		lst.add(4);
		lst.add(21);
		lst.add(36);
		lst.add(10);
		lst.add(28);
		lst.add(35);
		lst.add(5);
		lst.add(24);
		lst.add(42);
		List<Integer> max = new ArrayList<>();
		List<Integer> min = new ArrayList<>();
		int count1=0;
		int count2=0;
		int mx = Integer.MIN_VALUE;
		for(int i=0;i<lst.size();i++){
			if(lst.get(i)>mx) {
				mx = lst.get(i);
				max.add(mx);
				count1++;
			}else {
				max.add(mx);
			}
				
			
		}
		int mn = Integer.MAX_VALUE;
		for(int i=0;i<lst.size();i++) {
			if(lst.get(i)<mn) {
				mn = lst.get(i);
				min.add(mn);
				count2++;
			}else {
				min.add(mn);
			}
		}
		System.out.println((count1-1)+" "+(count2-1));
		
	}
}
