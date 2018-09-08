package com.bbcclive.leetcode.solution._213;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testLengthOfLongestSubstring() {
        int[] nums = { 2, 3, 2 };
        int expected = 3;
        int actual = new Solution().rob(nums);
        assertEquals(expected, actual);
    }
}