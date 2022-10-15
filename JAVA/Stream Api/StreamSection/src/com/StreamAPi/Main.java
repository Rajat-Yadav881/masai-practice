package com.StreamAPi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("one","two","three","four");
		
		Stream<String> str1 = list.stream();
		
		//terminal method 
		str1.forEach(s -> System.out.println(s.toUpperCase()));
		
		str1.forEach(s ->System.out.println(s));
	}
}
