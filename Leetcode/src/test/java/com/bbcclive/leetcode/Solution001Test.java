package com.bbcclive.leetcode;

import org.junit.Test;
import static org.junit.Assert.*;

public class Solution001Test {
    @Test
    public void testTwoSum() {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] expecteds = { 0, 1 };

        int[] actuals = new Solution001().twoSum(nums, target);
        assertArrayEquals(expecteds, actuals);
    }
}