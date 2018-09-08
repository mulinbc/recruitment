package com.bbcclive.leetcode.solution.easy._113;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import com.bbcclive.leetcode.structure.TreeNode;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testLengthOfLongestSubstring() {
        String strTree = "5 4 8 11 null 13 4 7 2 null null 5 1";
        int sum = 22;
        int[][] res = { { 5, 4, 11, 2 }, { 5, 8, 4, 5 } };

        TreeNode root = TreeNode.createTree(strTree);
        List<List<Integer>> expected = new ArrayList<>();
        for (int i = 0; i < res.length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < res[i].length; j++) {
                list.add(res[i][j]);
            }
            expected.add(list);
        }

        List<List<Integer>> actual = new Solution().pathSum(root, sum);
        assertEquals(expected, actual);
    }
}