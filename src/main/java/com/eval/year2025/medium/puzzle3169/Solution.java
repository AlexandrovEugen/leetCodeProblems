package com.eval.year2025.medium.puzzle3169;

import java.util.*;

class Solution {


    public int countDays(int days, int[][] meetings) {

        Arrays.sort(meetings,Comparator.comparingInt(m -> m[0]));

        int prevEnd = 0;
        for (int[] meeting : meetings) {
            int start = Math.max(meeting[0], prevEnd + 1);
            int end = meeting[1];
            if (end < prevEnd) {
                continue;
            }

            days-=(end - start) + 1;
            prevEnd = end;
        }

        return days;
    }



    @Deprecated
    public int countDaysTimeExceeded(int days, int[][] meetings) {
        Set<Integer> adj = new HashSet<>();

        for (int[] meeting : meetings) {
            int l = meeting[0];
            int r = meeting[1];
            while (l <= r){
                adj.add(l);
                l++;
            }
        }


        int res = 0;
        for (int i = 1; i <= days; i++) {
            if (!adj.contains(i)) {
                res++;
            }
        }
        return res;
    }
}
