package com.bbcclive.leetcode.solution._112;

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

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null)// 叶子结点
            return sum == root.val;
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);// 或运算，只要有一个为true就返回true
    }
}