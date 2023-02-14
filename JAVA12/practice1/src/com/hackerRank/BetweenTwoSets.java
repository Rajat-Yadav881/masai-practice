package com.hackerRank;

import java.util.*;

public class BetweenTwoSets {
	public static void main(String[] args) {
		List<Integer>a1 = new ArrayList<>();
		a1.add(2);
		a1.add(6);
		List<Integer>a2 = new ArrayList<>();
		a2.add(24);
		a2.add(36);
		getTotalX(a1,a2);
	}
	static int getGCD(int n1, int n2) {
	    if (n2 == 0) {
	      return n1;
	    }
	    return getGCD(n2, n1 % n2);
	  }

	  static int getLCM(int n1, int n2) {
	    if (n1 == 0 || n2 == 0)
	      return 0;
	    else {
	      int gcd = getGCD(n1, n2);
	      return Math.abs(n1 * n2) / gcd;
	    }
	  }

	  public static void getTotalX(List<Integer> a, List<Integer> b) {
	    int result = 0;

	    // Get LCM of all elements of a
	    int lcm = a.get(0);
	    for (Integer integer : a) {
	      lcm = getLCM(lcm, integer);
	    }
//	    System.out.println(lcm);
	    // Get GCD of all elements of b
	    int gcd = b.get(0);
	    for (Integer integer : b) {
	      gcd = getGCD(gcd, integer);
	    }
//	    System.out.println(gcd);
	    // Count multiples of lcm that divide the gcd
	    int multiple = 0;
	    while (multiple <= gcd) {
	      multiple += lcm;

	      if (gcd % multiple == 0)
	        result++;
	    }
	    System.out.println(result);
	  }
	  
}
