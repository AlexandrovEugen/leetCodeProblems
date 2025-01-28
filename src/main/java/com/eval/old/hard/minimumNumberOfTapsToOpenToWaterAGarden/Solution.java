package com.eval.old.hard.minimumNumberOfTapsToOpenToWaterAGarden;




public class Solution {
    public int minTaps(int n, int[] ranges) {

        int[] array = new int[n + 1];

        for (int i = 0; i < ranges.length; i++) {
            if (ranges[i] == 0) continue;
            int left = Math.max(0, i - ranges[i]);
            array[left] = Math.max(array[left], i + ranges[i]);
        }
        int end = 0, farCanReach = 0, ans = 0;

        for (int i = 0; i < array.length && end < n; end = farCanReach) {
            ans++;
            while (i < array.length && i <= end){
                farCanReach = Math.max(farCanReach, array[i++]);
            }
            if (end == farCanReach) return -1;
        }
        return ans;
    }
}
