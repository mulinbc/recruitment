package com.bbcclive.leetcode.solution._303;

public class NumArray {
    // 动态规划
    // dp[i]表示[0, i]区间上的累加和
    // 状态转移方程为：
    // dp[i] = dp[i-1] + nums[i]
    // 将求和转化为求差
    int[] dp;

    public NumArray(int[] nums) {
        if (nums.length > 0) {
            dp = new int[nums.length];

            dp[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                dp[i] = dp[i - 1] + nums[i];
            }
        }
    }

    public int sumRange(int i, int j) {
        if (i == 0)
            return dp[j];
        else
            return dp[j] - dp[i - 1];
    }
}

// Your NumArray object will be instantiated and called as such:
// NumArray obj = new NumArray(nums);
// int param_1 = obj.sumRange(i,j);
