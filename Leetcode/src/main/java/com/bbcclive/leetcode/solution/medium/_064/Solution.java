package com.bbcclive.leetcode.solution.medium._064;

public class Solution {
    // 动态规划
    // dp[i][j]表示到达[i,j]处路径上数字的最小和
    // 状态转移方程为：
    // dp[i][j] = min(dp[i-1][j],dp[i][j-1]) + grid[i][j]
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int[][] dp = new int[row][column];// 数组初始化为0
        // 初始化
        dp[0][0] = grid[0][0];
        for (int i = 1; i < row; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < column; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }
        // 状态转移矩阵
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[row - 1][column - 1];
    }
}