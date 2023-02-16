package com.hackerRank;

import java.util.ArrayList;
import java.util.List;

//import java.util.List;

public class EvenFibonaccinumbers {
	static List<long> arr = new ArrayList<>();
	public static void main(String[] args) {
		long x = 100;
		List<Integer> arr= fibo(x);
		long a = checker(arr);
		System.out.println(a);
	}

	public static List<long> fibo(long x){
		List<Integer>arr = new ArrayList<>();
		arr.add(0);
		arr.add(1);
		for(long i=2;i<=x;i++) {
			long z = arr.get(i-1)+arr.get(i-2);		
			if(z<=x) {
				arr.add(z);
			}else {
				break;
			}
		}
		return arr;
	}
	
	public static long checker(List<Integer>arr){
		
		long sum = 0;
		for(int i=1;i<arr.size();i++) {
			if(arr.get(i)%2==0) {
				sum +=  arr.get(i);
			}
		}
		return sum;
	}
}

