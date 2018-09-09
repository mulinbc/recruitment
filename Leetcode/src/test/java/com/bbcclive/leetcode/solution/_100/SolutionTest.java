package com.bbcclive.leetcode.solution._100;

import static org.junit.Assert.assertEquals;

import com.bbcclive.leetcode.structure.TreeNode;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testIsSameTree() {
        String strTree1 = "1 2 3";
        String strTree2 = "1 2 3";
        TreeNode p = TreeNode.createTree(strTree1);
        TreeNode q = TreeNode.createTree(strTree2);
        boolean expected = true;

        boolean actual = new Solution().isSameTree(p, q);
        assertEquals(expected, actual);
    }
}