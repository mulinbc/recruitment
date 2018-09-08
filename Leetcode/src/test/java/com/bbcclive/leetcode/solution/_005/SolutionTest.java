package com.bbcclive.leetcode.solution._005;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testLengthOfLongestSubstring() {
        String s = "babad";
        String expected = "bab";
        String actual = new Solution().longestPalindrome(s);
        assertEquals(expected, actual);
    }
}