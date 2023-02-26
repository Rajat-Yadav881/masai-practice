package com.leetcode;

import java.util.HashMap;


public class Seven {
	public static void main(String[] args) {
		String s = "foo";
		String m = "bar";
		if(isIsomorphic(s,m)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
//		isIsomorphic(s,m);
	}
    public static boolean isIsomorphic(String s, String t) {
    	HashMap<Character, Character>map1 = new HashMap<>();
    	HashMap<Character, Boolean>map2 = new HashMap<>();
    	
    	for(int i=0;i<s.length();i++) {
    		char a = s.charAt(i);
    		char b = t.charAt(i);
    		
    		if(map1.containsKey(a)) {
    			if(map1.get(a)!=b) {
    				return false;
    			}
    		}else {
    			if(map2.containsKey(b)) {
    				return false;
    			}else {
    				map1.put(a, b);
    				map2.put(b, true);
    			}
    		}
    	}
    	return true;
        
    }
}