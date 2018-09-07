package com.bbcclive.leetcode.solution.easy._112;

import static org.junit.Assert.assertEquals;

import com.bbcclive.leetcode.structure.TreeNode;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testLengthOfLongestSubstring() {
        String strTree="5 4 8 11 null 13 4 7 2 null null null 1";
        TreeNode root=TreeNode.createTree(strTree);
        boolean expected = true;
        boolean actual = new Solution().hasPathSum(root, 22);
        assertEquals(expected, actual);
    }
}