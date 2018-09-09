package com.bbcclive.leetcode.solution._303;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumArrayTest {
    @Test
    public void testSumRange() {
        int[] nums = { -2, 0, 3, -5, 2, -1 };
        int i = 2, j = 5;
        int expected = -1;
        int actual = new NumArray(nums).sumRange(i, j);
        assertEquals(expected, actual);
    }
}