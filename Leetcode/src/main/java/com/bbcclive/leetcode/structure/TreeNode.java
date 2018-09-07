package com.bbcclive.leetcode.structure;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    public static TreeNode createTree(String str) {
        if (str == null || str == "")
            return null;

        String[] parts = str.split(" ");
        String temp = parts[0];
        TreeNode root = new TreeNode(Integer.valueOf(temp));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int index = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();

            if (index == parts.length)
                break;

            temp = parts[index++];
            if (!temp.equals("null")) {
                node.left = new TreeNode(Integer.valueOf(temp));
                queue.add(node.left);
            }

            if (index == parts.length)
                break;

            temp = parts[index++];
            if (!temp.equals("null")) {
                node.right = new TreeNode(Integer.valueOf(temp));
                queue.add(node.right);
            }
        }
        return root;
    }
}