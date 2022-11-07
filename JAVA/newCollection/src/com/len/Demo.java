package com.len;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Demo {
	public static  ArrayList<String> removeDuplicateFrom(ArrayList<String> cities){
		LinkedHashSet<String> lhs = new LinkedHashSet<>(cities);
		return new ArrayList<>(lhs);
	}
	public static void main(String[] args) {
		ArrayList<String> metros = new ArrayList<>();
		
		metros.add("delhi");
		metros.add("kolakta");
		metros.add("mumbai");
		metros.add("chennai");
		metros.add("chennai");
		metros.add("kolakta");
		
		ArrayList<String> result = removeDuplicateFrom(metros);
		System.out.println(result);
	}
}
