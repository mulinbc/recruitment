package com.bbcclive.leetcode.solution._872;

import static org.junit.Assert.assertEquals;

import com.bbcclive.leetcode.structure.TreeNode;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testLeafSimilar() {
        String tree1 = "3 5 1 6 2 9 8 null null 7 4";
        String tree2 = "3 5 1 6 7 4 2 null null null null null null 9 8";
        TreeNode root1 = TreeNode.createTree(tree1);
        TreeNode root2 = TreeNode.createTree(tree2);
        boolean expected = true;

        boolean actual = new Solution().leafSimilar(root1, root2);
        assertEquals(expected, actual);
    }
}