package com.gfg;

import java.util.ArrayList;

public class One {
	public static void main(String[] args) {
		int n = 5;
		int[] arr = new int[] {1,2,3,7,5};
		int s = 12;
		
		ArrayList<Integer> array = subarraySum(arr,n,s);
		System.out.println(array);
	}
	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
		int l = 0;
		int r = 0;
		boolean istrue = false;
		int sum = arr[0];
		ArrayList<Integer> lst = new ArrayList<>();
		if(s==0){
		    lst.add(-1);
		    return lst;
		}
		while(r<n) {
			if(sum==s) {
				istrue = true;
				break;
			}else if(sum<s) {
				r++;
				if(r<n)
					sum += arr[r];
			}else {
				sum -= arr[l];
				l++;
			}
		}
		if(istrue) {
			lst.add(l+1);
			lst.add(r+1);
			return lst;
		}
		lst.add(-1);
		return lst;
    }
}
