package com.bbcclive.leetcode.solution._690;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import com.bbcclive.leetcode.structure.Employee;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testGetImportance() {
        List<Employee> employees = new ArrayList<>();
        Employee[] e = new Employee[3];
        for (int i = 0; i < e.length; i++) {
            e[i] = new Employee();
            e[i].id = i + 1;
            e[i].importance = 3;
            e[i].subordinates = new ArrayList<>();
        }

        e[0].subordinates.add(2);
        e[0].subordinates.add(3);
        e[0].importance = 5;

        for (int i = 0; i < e.length; i++) {
            employees.add(e[i]);
        }

        int id = 1;
        int expected = 11;

        int actual = new Solution().getImportance(employees, id);
        assertEquals(expected, actual);
    }
}