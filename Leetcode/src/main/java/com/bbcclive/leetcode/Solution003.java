package com.bbcclive.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution003 {
    // 优化滑动窗口，使用HashMap存储改字符上次出现的位置
    public int lengthOfLongestSubstring(String s) {
        int ret = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; j < s.length(); j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);// 重复字符最大的索引，不需要逐个增加
            }
            map.put(s.charAt(j), j + 1);
            ret = Math.max(ret, j - i + 1);
        }
        return ret;
    }

    // 滑动窗口
    // public int lengthOfLongestSubstring(String s) {
    // int ret = 0;
    // Set<Character> set = new HashSet<>();
    // int n = s.length();
    // for (int i = 0, j = 0; i < n && j < n;) {// 在最糟糕的情况下，每个字符将被i和j访问两次
    // if (!set.contains(s.charAt(j))) {
    // set.add(s.charAt(j++));
    // ret = Math.max(ret, j - i);
    // } else {
    // set.remove(s.charAt(i++));// 可优化，不需要逐渐增加i
    // }
    // }
    // return ret;
    // }

    // 暴力求解
    // public int lengthOfLongestSubstring(String s) {
    // int ret = s.isEmpty() ? 0 : 1;
    // for (int i = s.length() - 1; i > 0; i--) {
    // for (int j = 0; j < s.length() - i; j++) {
    // String temp = s.substring(j, j + i + 1);
    // Set<Character> set = new HashSet<>();
    // int count = 0;
    // for (int k = 0; k < temp.length(); k++) {
    // if (set.contains(temp.charAt(k))) {
    // count = 0;
    // break;
    // } else {
    // set.add(temp.charAt(k));
    // count++;
    // }
    // }
    // if (count == temp.length()) {
    // return count;
    // }
    // }
    // }
    // return ret;
    // }
}