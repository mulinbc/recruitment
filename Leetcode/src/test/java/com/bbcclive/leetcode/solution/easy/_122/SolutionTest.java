package com.bbcclive.leetcode.solution.easy._122;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testLengthOfLongestSubstring() {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int expected = 7;
        int actual = new Solution().maxProfit(prices);
        assertEquals(expected, actual);
    }
}