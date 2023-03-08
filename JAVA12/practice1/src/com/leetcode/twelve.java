package com.leetcode;

class twelve {
    public int[] arr = new int[45+1];
    public int climbStairs(int n) {
       
        if (n <= 1) {
            return 1;
        }
        if(arr[n]!=0){
            return arr[n];
        }
        return arr[n] = climbStairs(n-1) + climbStairs(n-2);
       
    //     int[] dp = new int[n+1];
    //     dp[0] = 1;
    //     dp[1] = 1;
    //     if(n<=1){
    //         return 1;
    //     }
    //     for(int i=2;i<=n;i++){
    //         dp[i] = dp[i-1] + dp[i-2];
    //     }
    //     return dp[n];
    }

  
}