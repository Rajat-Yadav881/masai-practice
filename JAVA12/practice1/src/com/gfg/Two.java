package com.gfg;

import java.util.ArrayList;


class Two {
    public static void main(String[] args) {
    	ArrayList<Integer> arr = new ArrayList<>();
    	arr.add(1);
    	arr.add(2);
    	arr.add(3);
    	arr.add(4);
    	arr.add(5);
    	reverseInGroups(arr,5,3);
	}
    public static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        for(int i=0;i<n;i += k) {
        	int left = i;
        	int right = Math.min(i+k-1, n-1);
        	int temp;
        	while(left<right) {
        		temp = arr.get(left);
        		arr.set(left, arr.get(right));
        		arr.set(right, temp);
        		left += 1;
        		right -= 1;
        	}
        	
        }
        System.out.println(arr);
    }
}

