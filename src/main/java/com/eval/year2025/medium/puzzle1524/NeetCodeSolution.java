package com.eval.year2025.medium.puzzle1524;

public class NeetCodeSolution extends Solution {


    @Override
    public int numOfSubarrays(int[] arr) {
        int cur_sum = 0;
        int cur_odd = 0;
        int cur_even = 0;
        int res = 0;
        int MOD = 1_000_000_007;
        for (int n : arr) {
            cur_sum += n;
            if (cur_sum % 2 == 1) {
                res = (res + 1 + cur_even) % MOD;
                cur_odd +=1;
            } else {
                res = (res + cur_odd) % MOD;
                cur_even+=1;
            }
        }
        return res;
    }
}
