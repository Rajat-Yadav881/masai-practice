package com.gfg1;
import java.util.function.*;
public class Two {
	//predicate chaining
	
	public static void main(String[] args) {
		Predicate<Integer> greaterThanTen = (i) -> i>10;
		
		Predicate<Integer> lowerThanTwenty = (i) -> i>10;
		boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
		System.out.println(result);
		boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
		System.out.println(result2);
	}
	
}
