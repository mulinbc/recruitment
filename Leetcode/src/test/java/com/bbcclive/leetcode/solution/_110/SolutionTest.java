package com.bbcclive.leetcode.solution._110;

import static org.junit.Assert.assertEquals;

import com.bbcclive.leetcode.structure.TreeNode;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testIsBalanced() {
        String strTree = "3 9 20 null null 15 7";
        TreeNode root = TreeNode.createTree(strTree);
        boolean expected = true;

        boolean actual = new Solution().isBalanced(root);
        assertEquals(expected, actual);
    }
}