package com.eval.year2025.hard.pazzle2999;

class Solution {



    //O(finish)
    public long numberOfPowerfulInt(long start, long finish, int limit, String s) {
        long number = Long.parseLong(s);
        if (number > finish) return 0;
        long count = 0;
        if (number >= start) {
            count++;
        }
        long pow = 1L;
        for (int i = 0; i < s.length(); i++) {
            pow *= 10;
        }
        long powerfull = number;
        int i = 1;
        while (i <= limit || powerfull <= finish) {
            powerfull += pow;
            if (powerfull < start) {
                i++;
                continue;
            } else if (powerfull > finish) {
                break;
            }
            count++;
            if (i == limit) {
                i = 1;
                powerfull = number + pow * 10;
                if (powerfull > finish) {
                    break;
                }
                count++;
                continue;
            }
            i++;
        }
        return count;
    }
}
