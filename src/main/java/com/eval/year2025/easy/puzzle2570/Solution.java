package com.eval.year2025.easy.puzzle2570;

import java.util.TreeMap;

class Solution {

    private final TreeMap<Integer, Integer> map = new TreeMap<>();

    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i = 0, j = 0;

        while (i < nums1.length) {
            int[] num = nums1[i];
            int key = num[0];
            int value = num[1];
            map.put(key, value);
            i++;
        }
        while (j < nums2.length) {
            int[] num = nums2[j];
            int key = num[0];
            int value = num[1];
            map.compute(key, (_, v) -> v == null ? value : v + value);
            j++;
        }
        int k = 0;
        int[][] result = new int[map.size()][2];
        for (Integer integer : map.keySet()) {
            result[k] = new int[]{integer, map.get(integer)};
            k++;
        }
        return result;
    }
}