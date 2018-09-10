package com.bbcclive.leetcode.solution._257;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import com.bbcclive.leetcode.structure.TreeNode;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testBinaryTreePaths() {
        String strTree = "1 2 3 null 5";
        String[] input = { "1->2->5", "1->3" };
        TreeNode root = TreeNode.createTree(strTree);
        List<String> expected = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            expected.add(input[i]);
        }

        List<String> actual = new Solution().binaryTreePaths(root);
        assertEquals(expected, actual);
    }
}