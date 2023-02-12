package com.two;

import java.lang.*;
import java.util.*;

public class Seven {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[1000];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i=arr.length-1;i>=0;i++){
            if(arr[i]>=0){
                lst.add(arr[i]);
            }
        }
        for(Integer a:lst){
            System.out.print(a+" ");
        }
    }
}