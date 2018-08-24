package com.bbcclive.leetcode.solution.medium._063;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testLengthOfLongestSubstring() {
        int[][] obstacleGrid = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
        int expected = 2;
        int actual = new Solution().uniquePathsWithObstacles(obstacleGrid);
        assertEquals(expected, actual);
    }
}