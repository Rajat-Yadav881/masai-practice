package com.one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P1 {
	public static void main(String[] args) {
		int n = 7789;
		int count = 0;
		List<Integer> lst = new ArrayList<>();
		while(n>0) {
			int temp = n%10;
			lst.add(temp);
			count++;
			n = n/10;//reducing the number
		}
		Collections.reverse(lst);
		System.out.println(lst+" "+count);
	}
}
