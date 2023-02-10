package com.two;

public class Three {
	public static void main(String[] args) {
		String A = " the sky is blue";
		String[] arr = A.split("\\s");
        StringBuilder str = new StringBuilder();
        
        for (int i = arr.length - 1; i >= 0; i--) {
            str.append(arr[i]).append(" ");
        }
        str.insert(0," ");
	    System.out.println(str.toString().trim());
	}
}
