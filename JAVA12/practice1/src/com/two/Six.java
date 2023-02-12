package com.two;

import java.lang.*;
import java.util.*;

public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][]mat = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int[] sum = new int[m];
        for(int i=0;i<n;i++){
           
            for(int j=0;j<m;j++){
                sum[j] += mat[i][j];
            }
            
        }
        for(int i=0;i<m;i++) {
        	System.out.print(sum[i]+" ");
        }
    }
}