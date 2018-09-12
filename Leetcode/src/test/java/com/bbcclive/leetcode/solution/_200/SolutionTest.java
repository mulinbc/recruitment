package com.bbcclive.leetcode.solution._200;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testNumIslands() {
        char[][] grid = { { '1', '1', '1', '1', '0' }, { '1', '1', '0', '1', '0' }, { '1', '1', '0', '0', '0' }, { '0', '0', '0', '0', '0' } };
        int expected = 1;

        int actual = new Solution().numIslands(grid);
        assertEquals(expected, actual);
    }
}