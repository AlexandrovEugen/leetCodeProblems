package com.eval.year2025.medium.puzzle1922;

class Solution {

    private final int MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {

        long evenPositions = (n + 1) / 2; // ceil(n / 2)
        long oddPositions = n / 2;        // floor(n / 2)

        return (int)(quickmul(5, evenPositions) * quickmul(4, oddPositions) % MOD);
    }

    // use fast exponentiation to calculate x^y % mod
    public long quickmul(int x, long y) {
        long ret = 1;
        long mul = x;
        while (y > 0) {
            if (y % 2 == 1) {
                ret = (ret * mul) % MOD;
            }
            mul = (mul * mul) % MOD;
            y /= 2;
        }

        return ret;
    }

}
