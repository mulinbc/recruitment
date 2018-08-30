package com.bbcclive.leetcode.solution.easy._009;

public class Solution {
    // 翻转一半的数字
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;
        int t = 0;
        for (; x > t;) {
            t = 10 * t + x % 10;
            x /= 10;
        }
        return t == x || t / 10 == x;// 奇数的话就除以10
    }

    // 翻转全部数字
    // public boolean isPalindrome(int x) {
    // if (x < 0)
    // return false;
    // int n = x, t = 0;
    // for (; n > 0;) {
    // t = 10 * t + n % 10;
    // n /= 10;
    // }
    // return t == x;
    // }
}
