package com.bbcclive.leetcode.solution._121;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testMaxProfit() {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int expected = 5;
        int actual = new Solution().maxProfit(prices);
        assertEquals(expected, actual);
    }
}