package com.bbcclive.leetcode.solution._070;

public class Solution {
    // 动态规划
    // dp[i]表示到达i+1个台阶的方法数
    // 状态转移方程为：
    // dp[i] = dp[i-1] + dp[i-2]
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n-1];
    }
}