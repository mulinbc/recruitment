package com.bbcclive.leetcode.solution._104;

import static org.junit.Assert.assertEquals;

import com.bbcclive.leetcode.structure.TreeNode;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testIsSameTree() {
        String strTree = "3 9 20 null null 15 7";
        TreeNode root = TreeNode.createTree(strTree);
        int expected = 3;

        int actual = new Solution().maxDepth(root);
        assertEquals(expected, actual);
    }
}