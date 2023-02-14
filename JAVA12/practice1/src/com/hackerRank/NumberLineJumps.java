package com.hackerRank;

public class NumberLineJumps {
	public static void main(String[] args) {
		int x = 0;
		int y = 2;
	    int v = 5;
	    int c = 3;
	    int count1 =0;
	    int count2 =0;
	    
	    boolean flag = false;
		while(flag) {
			if(x+y>0) {
				count1++;
			}
			if(v+c>0) {
				count2++;
			}
			
			if(count1==count2 && (x+y)==(v+c) ) {
				flag = true;
				break;
			}
		}
	}
}
