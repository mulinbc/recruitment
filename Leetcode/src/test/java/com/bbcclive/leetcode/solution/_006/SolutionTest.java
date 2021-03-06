package com.bbcclive.leetcode.solution._006;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testConvert() {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String expected = "PAHNAPLSIIGYIR";
        String actual = new Solution().convert(s, numRows);
        assertEquals(expected, actual);
    }
}