package com.bbcclive.leetcode.solution.easy._001;

import java.util.*;

public class Solution {
    // 一遍哈希表
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };// 这里需要交换顺序，只遍历了一次
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    
    // 哈希表
    // public int[] twoSum(int[] nums, int target) {
    // Map<Integer, Integer> map = new HashMap<>();
    // for (int i = 0; i < nums.length; i++) {
    // map.put(nums[i], i);
    // }
    // for (int i = 0; i < nums.length; i++) {// 多余的一次遍历
    // int complement = target - nums[i];
    // if (map.containsKey(complement) && map.get(complement) != i) {
    // return new int[] { i, map.get(complement) };
    // }
    // }
    // throw new IllegalArgumentException("No two sum solution");
    // }

    // 暴力求解
    // public int[] twoSum(int[] nums, int target) {
    // for (int i = 0; i < nums.length; i++) {
    // for (int j = i + 1; j < nums.length; j++) {// 可通过哈希表加快查找,使时间复杂度变为O(n)
    // if (nums[j] == target - nums[i]) {
    // return new int[] { i, j };
    // }
    // }
    // }
    // throw new IllegalArgumentException("No two sum solution");
    // }
}
