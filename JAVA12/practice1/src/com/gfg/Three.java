package com.gfg;

import java.util.Map;
import java.util.TreeMap;

class Three
{
	public static void main(String[] args) {
		int n = 5;
		int[] arr = new int[] {1, 7, 4, 3, 4, 8, 7};
		int k = 2;
		int x = firstElementKTime(arr,n,k);
		System.out.println(x);
	}
    public static int firstElementKTime(int[] arr, int n, int k) { 
        
    	TreeMap<Integer, Integer> map = new TreeMap<>();
    
    	for(int i=0;i<n;i++) {
    		if(map.containsKey(arr[i]))
    			map.put(arr[i], map.get(arr[i])+1);
    		else
    			map.put(arr[i], 1);
    	}
    	for(Map.Entry<Integer, Integer> a : map.entrySet()) {
    		if(a.getValue()==k) {
    			return a.getKey();
    		}
    	}a
    	
    	return -1;
    } 
}