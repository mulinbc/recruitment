package com.bbcclive.leetcode.solution._070;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testClimbStairs() {
        int n = 3;
        int expected = 3;
        int actual = new Solution().climbStairs(n);
        assertEquals(expected, actual);
    }
}