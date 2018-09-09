package com.bbcclive.leetcode.solution._004;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testFindMedianSortedArrays() {
        int[] nums1 = { 1, 2 };
        int[] nums2 = { 3, 4 };

        double expected = 2.5;
        double actual = new Solution().findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, actual, 0);
    }
}