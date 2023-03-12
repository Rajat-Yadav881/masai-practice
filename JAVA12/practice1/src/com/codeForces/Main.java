package com.codeForces;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                b[i] = sc.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int diff = Math.abs(a[n-1] - b[n-1]);
            for (int i = n-2; i >= 0; i--) {
                int curDiff = Math.max(Math.abs(a[i] - b[n-1]), Math.abs(a[n-1] - b[i]));
                diff = Math.min(diff, curDiff);
            }
            System.out.println(diff);
//        }
    }
}
