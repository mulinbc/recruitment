package com.bbcclive.leetcode.solution.medium._002;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import com.bbcclive.leetcode.structure.ListNode;

public class SolutionTest {
    @Test
    public void testAddTwoNumbers() {
        int[] in1 = { 2, 4, 3 };
        int[] in2 = { 5, 6, 4 };
        int[] expecteds = { 7, 0, 8 };

        ListNode l1 = ListNode.createList(in1);
        ListNode l2 = ListNode.createList(in2);
        int[] actuals = ListNode.toInt(new Solution().addTwoNumbers(l1, l2));
        assertArrayEquals(expecteds, actuals);
    }
}