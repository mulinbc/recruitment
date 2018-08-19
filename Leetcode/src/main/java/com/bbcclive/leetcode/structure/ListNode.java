package com.bbcclive.leetcode.structure;

import java.util.ArrayList;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode createList(int[] v) {
        ListNode ret, p;
        ret = new ListNode(v[0]);
        p = ret;
        for (int i = 1; i < v.length; i++) {
            p.next = new ListNode(v[i]);
            p = p.next;
        }
        return ret;
    }

    public static int[] toInt(ListNode l) {
        ListNode p = l;
        ArrayList<Integer> list = new ArrayList<>();
        while (p != null) {
            list.add(p.val);
            p = p.next;
        }
        int[] ret = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }
}