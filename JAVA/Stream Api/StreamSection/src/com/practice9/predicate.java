package com.practice9;

import java.util.function.Predicate;

public class predicate {
	public static void main(String[] args) {
		Predicate<Integer> p = i -> i>0;
		System.out.println(p.test(10));
		System.out.println(p.test(-10));
	}
}
