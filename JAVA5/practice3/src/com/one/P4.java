package com.one;

public class P4 {
	public static void main(String[] args) throws Exception {
		int n = 121;
		int x = n;
		int revNum = 0;
		while(n>0) {
			int temp = n%10;
			revNum = (revNum*10)+temp;
			n = n/10;
		}
		if(x==revNum) {
			System.out.println("Palindrome");
		}else {
			throw new Exception("not the valid answer");
		}
	}
}
