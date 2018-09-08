package com.bbcclive.leetcode.solution._113;

import java.util.ArrayList;
import java.util.List;

import com.bbcclive.leetcode.structure.TreeNode;

//Definition for a binary tree node.
// public class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int x) {
//         val = x;
//     }
// }

public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(root, sum, temp, ret);
        return ret;
    }

    public void helper(TreeNode root, int sum, List<Integer> temp, List<List<Integer>> ret) {
        if (root == null) {
            return;
        }
        temp.add(root.val);
        if (root.left == null && root.right == null && root.val == sum) {
            ret.add(new ArrayList<Integer>(temp));
        } else {
            helper(root.left, sum - root.val, temp, ret);
            helper(root.right, sum - root.val, temp, ret);
        }
        temp.remove(temp.size() - 1);
    }
}