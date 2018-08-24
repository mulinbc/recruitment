package com.bbcclive.leetcode.solution._022;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    // 递归
    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        helper(ret, "", 0, n);
        return ret;
    }

    private void helper(List<String> list, String cur, int rightNeed, int leftRest) {
        if (rightNeed == 0 && leftRest == 0) {
            list.add(cur);
            return;
        }
        if (rightNeed > 0)
            helper(list, cur + ")", rightNeed - 1, leftRest);
        if (leftRest > 0)
            helper(list, cur + "(", rightNeed + 1, leftRest - 1);
    }
}