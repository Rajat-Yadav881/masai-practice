package com.one;

public class P3 {
	public static void main(String[] args) {
		int n =1234;
		int revNum = 0;
		while(n>0) {
			int temp = n%10;
			revNum = (revNum*10)+temp;
			n = n/10;
		}
		System.out.println(revNum);
	}
}
