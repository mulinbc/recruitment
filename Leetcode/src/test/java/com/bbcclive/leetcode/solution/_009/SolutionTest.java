package com.bbcclive.leetcode.solution._009;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void testIsPalindrome() {
        int x = 121;
        boolean expected = true;
        boolean actual = new Solution().isPalindrome(x);
        assertEquals(expected, actual);
    }
}