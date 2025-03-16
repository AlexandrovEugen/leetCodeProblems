package com.eval.year2025.medium.puzzle2594;

class Solution {
    public long repairCars(int[] ranks, int cars) {
        long l = 1;
        long r = Long.MIN_VALUE;
        for (int rank : ranks) {
            r = Math.max(r, (long) rank * cars * cars);
        }
        long result = 0L;
        while (l <= r) {
            long mid = l + (r - l) / 2;
            if (isValid(mid, ranks, cars)) {
                result = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }


        return result;
    }

    private boolean isValid(long mid, int[] ranks, int cars) {
        long count = 0;
        for (int rank : ranks) {
            count += (int) Math.sqrt((double) mid /rank);
        }
        return count >= cars;
    }
}