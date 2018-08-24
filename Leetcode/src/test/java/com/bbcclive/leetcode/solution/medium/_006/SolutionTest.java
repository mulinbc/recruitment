package com.bbcclive.leetcode.solution.medium._006;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testLengthOfLongestSubstring() {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String expected = "PAHNAPLSIIGYIR";
        String actual = new Solution().convert(s, numRows);
        assertEquals(expected, actual);
    }
}