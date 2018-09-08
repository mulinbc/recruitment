package com.bbcclive.leetcode.solution._121;

public class Solution {
    public int maxProfit(int[] prices) {
        // 1.始终保存最小的买入价格
        // 2.始终保存最大的利润
        int ret = 0, minPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < minPrice)
                minPrice = price;
            ret = Math.max(ret, price - minPrice);
        }
        return ret;
    }

    // 暴力法
    // public int maxProfit(int[] prices) {
    // int ret = 0;
    // for (int i = 0; i < prices.length; i++) {
    // for (int j = i + 1; j < prices.length; j++) {
    // ret = Math.max(ret, prices[j] - prices[i]);
    // }
    // }
    // return ret;
    // }
}