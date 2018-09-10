package com.bbcclive.leetcode.solution._257;

import java.util.ArrayList;
import java.util.List;

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

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ret = new ArrayList<>();
        if (root == null)
            return ret;
        helper(root, String.valueOf(root.val), ret);
        return ret;
    }

    public void helper(TreeNode root, String current, List<String> ret) {
        if (root.left != null)
            helper(root.left, current + "->" + root.left.val, ret);
        if (root.right != null)
            helper(root.right, current + "->" + root.right.val, ret);
        if (root.left == null && root.right == null) {
            ret.add(current);
        }
    }
}