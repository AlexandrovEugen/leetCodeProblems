package com.eval.year2025.medium.puzzle2226;

class Solution {
    public int maximumCandies(int[] candies, long k) {

        long totalSum = 0;
        for (int candy : candies) {
            totalSum += candy;
        }

        if (totalSum < k) return 0;
        if (totalSum/k == 1) return 1;


        int l = 1;
        int r = (int) (totalSum / k);
        int res = 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            long piles = 0;
            for (int candy : candies) {
                if (candy >= mid) {
                    piles += (candy / mid);
                }
                if (piles >= k) break;
            }
            if (piles >= k) {
                res = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return res;
    }
}