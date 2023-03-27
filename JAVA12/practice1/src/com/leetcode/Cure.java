package com.leetcode;


public class Cure {
	public static void main(String[] args) {
		int[] arr1 = new int[] {1,1,1,0,0,1};
		int[] arr2 = new int[] {1,0,0,0,1,1};
		int x = countStudents(arr1,arr2);
		System.out.println(x);
	}
	public static int countStudents(int[] students, int[] sandwiches) {
		int c1=0;
		int c2=0;
		for(int i=0;i<students.length;i++) {
			if(students[i]==0) {
				c1++;
			}else {
				c2++;
			}
		}
		
		for(int i=0;i<sandwiches.length;i++) {
			if(sandwiches[i]==0) {
				if(c1==0) {
					return c2;
				}
				c1--;
			}else {
				if(c2==0) {
					return c1;
				}
				c2--;
			}
		}
		return c1+c2;
    }
}
