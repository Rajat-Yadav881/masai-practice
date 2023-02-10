package com.two;

//import java.util.*;

public class Two {
	public static void main(String[] args) {
		int[] arr = new int[] {2,2,1,2,1,2};
		int n = arr.length;
		int k = -1;
		for(int i=0;i<n;i++) {
			int left = 1;
			for(int j=0;j<i;j++) {
				left *= arr[j];
			}
			
			int right = 1;
			for(int j=i;j<n;j++) {
				right *= arr[j];
			}
			
			
			if(left==right) {
				k = i;
				break;
			}
		}
		System.out.println(k);
	}
}

	
