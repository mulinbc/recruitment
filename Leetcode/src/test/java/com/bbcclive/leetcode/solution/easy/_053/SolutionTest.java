package com.bbcclive.leetcode.solution.easy._053;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testLengthOfLongestSubstring() {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int expected = 6;
        int actual = new Solution().maxSubArray(nums);
        assertEquals(expected, actual);
    }
}