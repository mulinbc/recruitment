package com.bbcclive.leetcode.solution._733;

public class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image == null)
            return null;
        int oldColor = image[sr][sc];
        helper(image, sr, sc, oldColor, newColor);
        return image;
    }

    public void helper(int[][] image, int sr, int sc, int oldColor, int newColor) {
        if (oldColor == newColor)
            return;
        if (sr >= 0 && sr < image.length && sc >= 0 && sc < image[0].length) {
            if (image[sr][sc] == oldColor) {
                image[sr][sc] = newColor;
                helper(image, sr - 1, sc, oldColor, newColor);
                helper(image, sr + 1, sc, oldColor, newColor);
                helper(image, sr, sc - 1, oldColor, newColor);
                helper(image, sr, sc + 1, oldColor, newColor);
            }
        }
    }
}