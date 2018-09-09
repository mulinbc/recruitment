package com.bbcclive.leetcode.solution._101;

import static org.junit.Assert.assertEquals;

import com.bbcclive.leetcode.structure.TreeNode;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testIsSymmetric() {
        String strTree = "1 2 2 3 4 4 3";
        TreeNode root = TreeNode.createTree(strTree);
        boolean expected = true;

        boolean actual = new Solution().isSymmetric(root);
        assertEquals(expected, actual);
    }
}