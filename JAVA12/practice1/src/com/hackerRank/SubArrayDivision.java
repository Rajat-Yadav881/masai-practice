package com.hackerRank;

import java.util.ArrayList;
import java.util.List;

public class SubArrayDivision {
	public static void main(String[] args) {
		int m = 18;
		int d = 7;
		List<Integer> arr = new ArrayList<>();
		
		arr.add(2);
		arr.add(5);
		arr.add(1);
		arr.add(3);
		arr.add(4);
		arr.add(4);
		arr.add(3);
		arr.add(5);
		arr.add(1);
		arr.add(1);
		arr.add(2);
		arr.add(1);
		arr.add(4);
		arr.add(1);
		arr.add(3);
		arr.add(3);
		arr.add(4);
		arr.add(2);
		arr.add(1);
		int x = birthday(arr,d,m);
		System.out.println(x);
	}
	public static int birthday(List<Integer> arr, int d, int m) {
        
        int sum = 0;
        int c = 0;
        for(int i=0;i<d;i++) {
            
            sum += arr.get(i);
            
        }
        if(sum==m) {
            c++;
        }
        int curr = sum;
        
        for(int i = d;i<arr.size();i++) {
            curr += arr.get(i)-arr.get(i-d);
            if(curr==m) {
                c++;
            }
        }
        return c;
    }
}