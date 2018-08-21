package com.bbcclive.leetcode.solution._003;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testLengthOfLongestSubstring() {
        String s = "abcabcbb";
        int expected = 3;
        int actual = new Solution().lengthOfLongestSubstring(s);
        assertEquals(expected, actual);
    }
}