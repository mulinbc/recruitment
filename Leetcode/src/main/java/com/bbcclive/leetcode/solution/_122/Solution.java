package com.bbcclive.leetcode.solution._122;

public class Solution {
    public int maxProfit(int[] prices) {
        // 贪心算法
        int ret = 0;
        for (int i = 1; i < prices.length; i++) {
            int t = prices[i] - prices[i - 1];
            ret += t > 0 ? t : 0;
        }
        return ret;
    }
}