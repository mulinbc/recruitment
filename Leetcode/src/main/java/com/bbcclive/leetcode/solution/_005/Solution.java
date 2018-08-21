package com.bbcclive.leetcode.solution._005;

public class Solution {
    // 动态规划
    // dp[i][j]表示字符串区间[i, j]是否为回文串
    // 状态转移方程为：
    // dp[i][j] = dp[i+1][j-1], s[i]==s[j]
    // dp[i][j] = 0, s[i]!=s[j]
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len <= 1)
            return s;

        int l = 0, r = 0;
        int[][] dp = new int[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = 1;// 初始状态
            for (int j = 0; j < i; j++) {
                if (j + 1 == i) {
                    dp[j][i] = s.charAt(j) == s.charAt(i) ? 1 : 0;// 初始状态
                } else {
                    dp[j][i] = (dp[j + 1][i - 1] == 1 && s.charAt(j) == s.charAt(i)) ? 1 : 0;// 状态转移方程
                }
                if (dp[j][i] == 1 && i - j > r - l) {
                    l = j;
                    r = i;
                }
            }
        }
        return s.substring(l, r + 1);
    }

    // 暴力法
    // public String longestPalindrome(String s) {
    // int len = s.length();
    // for (int i = len - 1; i >= 0; i--) {
    // for (int j = 0; j < len - i; j++) {
    // String ret = s.substring(j, j + i + 1);
    // if (isPalindrome(ret))
    // return ret;
    // }
    // }
    // return "";
    // }

    // public boolean isPalindrome(String s) {
    // for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++) {
    // if (s.charAt(i) != s.charAt(j--)) {
    // return false;
    // }
    // }
    // return true;
    // }
}