package com.codeChef;

import java.util.*;

public class ConcatPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();
            if (canFormPalindrome(n, m, s1, s2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean canFormPalindrome(int n, int m, String s1, String s2) {
        int[] freq = new int[26];
        for (int i = 0; i < n; i++) {
            freq[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < m; i++) {
            freq[s2.charAt(i) - 'a']++;
        }
        int oddFreqCount = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                oddFreqCount++;
            }
        }
        return oddFreqCount <= 1;
    }
}
