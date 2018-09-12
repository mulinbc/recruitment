package com.bbcclive.leetcode.solution._690;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bbcclive.leetcode.structure.Employee;

public class Solution {
    // 使用map提高查找效率
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee e : employees) {
            map.put(e.id, e);
        }
        return helper(map, id);
    }

    public int helper(Map<Integer, Employee> map, int id) {
        int ret = 0;
        Employee temp = map.get(id);
        ret += map.get(id).importance;
        for (int stuff_id : temp.subordinates) {
            ret += helper(map, stuff_id);
        }
        return ret;
    }

    // public int getImportance(List<Employee> employees, int id) {
    // int ret = 0;
    // for (Employee e : employees) {
    // if (e.id == id) {
    // ret += e.importance;
    // for (int stuff_id : e.subordinates) {
    // ret += getImportance(employees, stuff_id);
    // }
    // }
    // }
    // return ret;
    // }
}
