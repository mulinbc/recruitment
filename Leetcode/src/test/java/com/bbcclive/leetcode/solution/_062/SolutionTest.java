package com.bbcclive.leetcode.solution._062;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testLengthOfLongestSubstring() {
        int m = 7;
        int n = 3;
        int expected = 28;
        int actual = new Solution().uniquePaths(m, n);
        assertEquals(expected, actual);
    }
}