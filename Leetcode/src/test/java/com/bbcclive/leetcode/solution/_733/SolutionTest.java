package com.bbcclive.leetcode.solution._733;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testFloodFill() {
        int[][] image = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
        int sr = 1, sc = 1, newColor = 2;

        int[][] expected = { { 2, 2, 2 }, { 2, 2, 0 }, { 2, 0, 1 } };
        int[][] actual = new Solution().floodFill(image, sr, sc, newColor);
        assertArrayEquals(expected, actual);
    }
}