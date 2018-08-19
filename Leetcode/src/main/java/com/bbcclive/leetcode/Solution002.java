package com.bbcclive.leetcode;

import com.bbcclive.leetcode.structure.ListNode;

public class Solution002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode(0);
        ListNode p1 = l1, p2 = l2, pr = ret;
        int carry = 0;

        while (p1 != null || p2 != null) {
            int x = (p1 != null) ? p1.val : 0;
            int y = (p2 != null) ? p2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;

            pr.next = new ListNode(sum % 10);
            if (p1 != null)
                p1 = p1.next;
            if (p2 != null)
                p2 = p2.next;
            pr = pr.next;
        }
        if (carry > 0) {
            pr.next = new ListNode(carry);
        }
        return ret.next;
    }
}