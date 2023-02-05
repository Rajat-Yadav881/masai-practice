package com.one;

//import java.util.HashMap;
//import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Ten {
	public static void main(String[] args) {
		TreeMap<Integer, Integer> map = new TreeMap<>();
		map.put(17, 1);
		map.put(6, 4);
		map.put(4, 3);
		map.put(15, 2);
		
		for (Map.Entry<Integer, Integer>entry : map.entrySet()) {
			System.out.println(entry);
		}
	}
}
