package com.bbcclive.leetcode.solution._006;

public class Solution {
    // 按行访问
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        int n = s.length();
        int loop = numRows + numRows - 2;
        StringBuilder ret = new StringBuilder();
        // 注意下标关系
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += loop) {
                ret.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + loop - i < n) {
                    ret.append(s.charAt(j + loop - i));
                }
            }
        }
        return ret.toString();
    }

    //
    // public String convert(String s, int numRows) {
    // int n = s.length();
    // int loop = numRows + numRows - 2;
    // if (loop == 0)
    // return s;
    // char[] sChars = s.toCharArray();
    // StringBuilder[] sbs = new StringBuilder[numRows];
    // for (int i = 0; i < numRows; i++) {
    // sbs[i] = new StringBuilder();
    // }
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < numRows; j++) {
    // int t = i % loop;
    // if (t == j) {
    // sbs[j].append(sChars[i]);
    // break;
    // }
    // if (t >= numRows) {
    // sbs[loop - t].append(sChars[i]);
    // break;
    // }

    // }
    // }
    // String ret = new String();
    // for (int i = 0; i < numRows; i++) {
    // ret += sbs[i];
    // }
    // return ret;
    // }
}