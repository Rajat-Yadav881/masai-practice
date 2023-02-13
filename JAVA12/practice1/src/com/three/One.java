package com.three;

import java.util.*;

public class One {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		arr.add(426980153);
		arr.add(354802167);
		arr.add(142980735);
		arr.add(968217435);
		arr.add(734892650);
		List<Long> array = new ArrayList<>();
//        for(int i=0;i<arr.size();i++){
//            long sum = 0;
//            for(int j=0;j<arr.size();j++){
//                if(i!=j){
//                    sum += arr.get(j);
//                }
//            }
//            array.add(sum);
//        }
		long sum = 0;
		for(int i=0;i<arr.size();i++) {
			sum += arr.get(i);
		}
		
		for(int i=0;i<arr.size();i++) {
			long temp = sum-arr.get(i);
			array.add(temp);
		}
        long a = Collections.max(array);
        long b = Collections.min(array);
        
        System.out.println(b+" "+a);
	}
	
}
