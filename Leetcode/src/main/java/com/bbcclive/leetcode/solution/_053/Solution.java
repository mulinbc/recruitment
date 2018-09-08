package com.bbcclive.leetcode.solution._053;

public class Solution {
    // 动态规划
    // dp[i]表示在i处的连续子数组的最大和
    // 状态转移方程为：
    // dp[i] = max(dp[i-1]+nums[i],num[i])
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];// 初始状态

        int ret = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);// 状态转移矩阵
            ret = Math.max(ret, dp[i]);
        }
        return ret;
    }

    // 分治法
    // 先将nums一分为二，有两种情况：
    // 1. 最大序列包括中间的值，只需要把两侧的最大和计算出来即可
    // 2. 不包括中间的值，继续分治即可
    // public int maxSubArray(int[] nums) {
    // return helper(nums, 0, nums.length - 1);
    // }

    // private int helper(int[] nums, int l, int r) {
    // if (l >= r)
    // return nums[l];
    // int mid = (l + r) / 2;
    // int lAns = helper(nums, l, mid);
    // int rAns = helper(nums, mid + 1, r);
    // int lMax = nums[mid];
    // int rMax = nums[mid + 1];
    // int t = 0;
    // for (int i = mid; i >= l; i--) {
    // t += nums[i];
    // if (t > lMax)
    // lMax = t;
    // }
    // t = 0;
    // for (int i = mid + 1; i <= r; i++) {
    // t += nums[i];
    // if (t > rMax)
    // rMax = t;
    // }
    // return Math.max(Math.max(lAns, rAns), lMax + rMax);
    // }
}