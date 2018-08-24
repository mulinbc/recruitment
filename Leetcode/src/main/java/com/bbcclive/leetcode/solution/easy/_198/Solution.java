package com.bbcclive.leetcode.solution.easy._198;

public class Solution {
    // 动态规划
    // dp[i]表示到达第i个房屋时能偷窃到的最高金额
    // 状态转移方程为：
    // dp[i] = max(dp[i-2] + nums[i], dp[i-1])
    public int rob(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            if (n == 1)
                return nums[0];
            else
                return 0;
        }
        int[] dp = new int[n];
        // 初始化
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        // 状态转移
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[n - 1];
    }
}