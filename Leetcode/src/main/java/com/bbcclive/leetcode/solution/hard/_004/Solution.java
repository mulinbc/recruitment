package com.bbcclive.leetcode.solution.hard._004;

public class Solution {
    // 可以抽象为求两数组中第k大的元素
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ret = 0;
        int len = nums1.length + nums2.length;
        if (len % 2 == 0) {
            ret = (getkth(nums1, 0, nums2, 0, len / 2) + getkth(nums1, 0, nums2, 0, len / 2 + 1)) / 2.0;
        } else {
            ret = getkth(nums1, 0, nums2, 0, (len + 1) / 2);
        }
        return ret;
    }

    private int getkth(int[] nums1, int m, int[] nums2, int n, int k) {
        if (m >= nums1.length)
            return nums2[n + k - 1];
        if (n >= nums2.length)
            return nums1[m + k - 1];
        if (k == 1)
            return Math.min(nums1[m], nums2[n]);

        int p1 = m + k / 2 - 1;
        int p2 = n + k / 2 - 1;
        int mid1 = p1 < nums1.length ? nums1[p1] : Integer.MAX_VALUE;
        int mid2 = p2 < nums2.length ? nums2[p2] : Integer.MAX_VALUE;
        if (mid1 < mid2)
            return getkth(nums1, m + k / 2, nums2, n, k - k / 2);
        return getkth(nums1, m, nums2, n + k / 2, k - k / 2);
    }

    // 不考虑时间复杂，先排序再计算中位数
    // public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    // double ret = 0;
    // int i = 0, j = 0, count = 0;
    // int[] t = new int[nums1.length + nums2.length];
    // for (; i < nums1.length && j < nums2.length;) {
    // if (nums1[i] < nums2[j]) {
    // t[count++] = nums1[i++];
    // } else {
    // t[count++] = nums2[j++];
    // }
    // }
    // for (; i < nums1.length;) {
    // t[count++] = nums1[i++];
    // }
    // for (; j < nums2.length;) {
    // t[count++] = nums2[j++];
    // }

    // if (t.length % 2 == 0) {
    // ret = (t[t.length / 2 - 1] + t[t.length / 2]) / 2.0;
    // } else
    // ret = t[t.length / 2];
    // return ret;
    // }
}