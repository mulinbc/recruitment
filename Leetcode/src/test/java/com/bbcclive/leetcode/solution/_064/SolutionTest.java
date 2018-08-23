package com.bbcclive.leetcode.solution._064;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testLengthOfLongestSubstring() {
        int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
        int expected = 7;
        int actual = new Solution().minPathSum(grid);
        assertEquals(expected, actual);
    }
}