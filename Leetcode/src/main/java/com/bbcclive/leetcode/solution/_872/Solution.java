package com.bbcclive.leetcode.solution._872;

import java.util.ArrayList;
import java.util.List;

import com.bbcclive.leetcode.structure.TreeNode;

public class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaf1 = new ArrayList<>();
        List<Integer> leaf2 = new ArrayList<>();
        helper(root1, leaf1);
        helper(root2, leaf2);
        return leaf1.equals(leaf2);
    }

    public void helper(TreeNode root, List<Integer> leaf) {
        if (root == null)
            return;
        if (root.left == null && root.right == null)
            leaf.add(root.val);
        helper(root.left, leaf);
        helper(root.right, leaf);
    }
}