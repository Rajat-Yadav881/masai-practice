package com.one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Thirteen {
	static List<Integer>lst = new ArrayList<>();
	static void printSubArrays(int[] arr, int start, int end){
		int pro = 1;
        if (end == arr.length)
            return;
        else if (start > end)
            printSubArrays(arr, 0, end + 1);
        else {
            for (int i = start; i <= end; i++) {
            	
            	pro *= arr[i];
            	
            }
            lst.add(pro);

            printSubArrays(arr, start + 1, end);
        }
        return;
    }
 
    public static void main(String args[]){
        int[] arr = {-2,0,-1};
        printSubArrays(arr, 0, 0);
        
        String s = "appleNewton";
       
        System.out.println(lst);
        System.out.println(Collections.max(lst));
        
    }
}
