package com.bbcclive.leetcode.solution._897;

import static org.junit.Assert.assertEquals;

import com.bbcclive.leetcode.structure.TreeNode;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testLeafSimilar() {
        String tree = "5 3 6 2 4 null 8 1 null null null 7 9";
        TreeNode root = TreeNode.createTree(tree);
        String expected = "1 null 2 null 3 null 4 null 5 null 6 null 7 null 8 null 9";

        String actual = TreeNode.convertTree(new Solution().increasingBST(root));
        assertEquals(expected, actual);
    }
}