package com.bbcclive.leetcode.solution.easy._009;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void testTwoSum() {
        int x = 121;
        boolean expected = true;
        boolean actual = new Solution().isPalindrome(x);
        assertEquals(expected, actual);
    }
}