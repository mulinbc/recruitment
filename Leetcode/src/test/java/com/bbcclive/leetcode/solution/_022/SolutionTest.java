package com.bbcclive.leetcode.solution._022;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testLengthOfLongestSubstring() {
        int n = 3;
        String[] expecteds = { "()()()", "()(())", "(())()", "(()())", "((()))" };
        List<String> list = new Solution().generateParenthesis(n);
        String[] actuals = list.toArray(new String[list.size()]);
        assertArrayEquals(expecteds, actuals);
    }
}