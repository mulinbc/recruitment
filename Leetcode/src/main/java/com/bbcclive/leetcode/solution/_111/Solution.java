package com.bbcclive.leetcode.solution._111;

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

    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right != null) {
            return 1 + minDepth(root.right);
        }
        if (root.left != null && root.right == null) {
            return 1 + minDepth(root.left);
        }
        return Math.min(1 + minDepth(root.left), 1 + minDepth(root.right));
    }
}