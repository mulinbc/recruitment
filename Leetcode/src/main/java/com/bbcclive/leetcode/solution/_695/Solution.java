package com.bbcclive.leetcode.solution._695;

public class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if (grid.length == 0)
            return 0;
        int ret = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                ret = Math.max(ret, helper(grid, i, j));
            }
        }
        return ret;
    }

    public int helper(int[][] grid, int i, int j) {
        if ((i >= 0 && i < grid.length) && (j >= 0 && j < grid[0].length) && (grid[i][j] == 1)) {
            grid[i][j] = 0;
            return 1 + helper(grid, i - 1, j) + helper(grid, i + 1, j) + helper(grid, i, j - 1)
                    + helper(grid, i, j + 1);
        } else
            return 0;
    }
}