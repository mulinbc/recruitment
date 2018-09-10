package com.bbcclive.leetcode.solution._108;

import static org.junit.Assert.assertEquals;

import com.bbcclive.leetcode.structure.TreeNode;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testSortedArrayToBST() {
        int[] nums = { -10, -3, 0, 5, 9 };
        String expected = "0 -10 5 null -3 null 9";

        String actual = TreeNode.convertTree(new Solution().sortedArrayToBST(nums));
        assertEquals(expected, actual);
    }
}