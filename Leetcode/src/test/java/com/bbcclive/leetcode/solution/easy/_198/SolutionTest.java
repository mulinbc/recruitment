package com.bbcclive.leetcode.solution.easy._198;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testLengthOfLongestSubstring() {
        int[] nums = { 1, 2, 3, 1 };
        int expected = 4;
        int actual = new Solution().rob(nums);
        assertEquals(expected, actual);
    }
}