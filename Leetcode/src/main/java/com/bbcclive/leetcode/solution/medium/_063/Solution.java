package com.bbcclive.leetcode.solution.medium._063;

public class Solution {
    // 动态规划
    // dp[i][j]表示到达[i,j]处的路径数
    // 状态转移方程为：
    // dp[i][j] = dp[i-1][j] + dp[i][j-1]
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int column = obstacleGrid[0].length;
        int[][] dp = new int[row][column];// 数组初始化为0
        // 初始化
        for (int i = 0; i < row; i++) {
            if (obstacleGrid[i][0] == 1) {
                break;
            }
            dp[i][0] = 1;
        }
        for (int i = 0; i < column; i++) {
            if (obstacleGrid[0][i] == 1) {
                break;
            }
            dp[0][i] = 1;
        }
        // 状态转移矩阵
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                dp[i][j] = (obstacleGrid[i][j] == 0) ? dp[i - 1][j] + dp[i][j - 1] : 0;
            }
        }
        return dp[row - 1][column - 1];
    }
}