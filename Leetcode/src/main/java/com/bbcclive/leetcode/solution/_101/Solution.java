package com.bbcclive.leetcode.solution._101;

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

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return helper(root.left, root.right);
    }

    public boolean helper(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left != null && right != null) {
            if (left.val == right.val) {
                return helper(left.left, right.right) && helper(left.right, right.left);
            }
        }
        return false;
    }
}