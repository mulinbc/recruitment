package com.bbcclive.leetcode.solution._897;

import java.util.ArrayList;
import java.util.List;

import com.bbcclive.leetcode.structure.TreeNode;

public class Solution {
    public TreeNode increasingBST(TreeNode root) {
        TreeNode temp = new TreeNode(0);
        TreeNode ret = temp;
        List<TreeNode> list = new ArrayList<>();
        helper(root, list);
        for (TreeNode node : list) {
            temp.right = new TreeNode(node.val);
            temp = temp.right;
        }
        return ret.right;
    }

    public void helper(TreeNode root, List<TreeNode> list) {
        if (root == null)
            return;
        helper(root.left, list);
        list.add(root);
        helper(root.right, list);
    }
}