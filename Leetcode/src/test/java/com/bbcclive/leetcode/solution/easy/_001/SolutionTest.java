package com.bbcclive.leetcode.solution.easy._001;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void testTwoSum() {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] expecteds = { 0, 1 };

        int[] actuals = new Solution().twoSum(nums, target);
        assertArrayEquals(expecteds, actuals);
    }
}