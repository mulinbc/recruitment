package com.bbcclive.leetcode.solution.medium._062;

public class Solution {
    // 动态规划
    // dp[i][j]表示到达[i,j]处的路径数
    // 状态转移方程为：
    // dp[i][j] = dp[i-1][j] + dp[i][j-1]
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[n][m];
        // 初始化
        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < m; i++) {
            dp[0][i] = 1;
        }
        // 状态转移矩阵
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[n - 1][m - 1];
    }
}