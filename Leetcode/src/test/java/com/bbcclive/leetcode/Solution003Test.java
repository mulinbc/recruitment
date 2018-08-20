package com.bbcclive.leetcode;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Solution003Test {
    @Test
    public void testLengthOfLongestSubstring() {
        String s = "abcabcbb";
        int expected = 3;
        int actual = new Solution003().lengthOfLongestSubstring(s);
        assertEquals(expected, actual);
    }
}