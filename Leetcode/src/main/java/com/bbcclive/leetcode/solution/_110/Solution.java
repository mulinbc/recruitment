package com.bbcclive.leetcode.solution._110;

import com.bbcclive.leetcode.structure.TreeNode;

// Definition for a binary tree node.
// public class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int x) {
//         val = x;
//     }
// }

public class Solution {

    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        if (Math.abs(helper(root.left) - helper(root.right)) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);

    }

    public int helper(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(helper(root.left), helper(root.right));
    }
}