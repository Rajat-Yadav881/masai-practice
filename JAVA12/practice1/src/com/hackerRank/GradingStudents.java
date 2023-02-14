package com.hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		arr.add(73);
		arr.add(67);
		arr.add(38);
		arr.add(33);
		for(int i=0;i<arr.size();i++) {
            if(arr.get(i)>40) {
                int digit = arr.get(i)%5;
                @SuppressWarnings("unused")
                int diff = 5-digit;
                if(diff<3) {
                    int x = arr.get(i)+diff;
                    arr.set(i, x);
                }
                
            }else if(arr.get(i)==38 || arr.get(i)==39) {
            	arr.set(i, 40);
            }
        }
		System.out.println(arr);
	}
}
