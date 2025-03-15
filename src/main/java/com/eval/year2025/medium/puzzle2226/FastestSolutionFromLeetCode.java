package com.eval.year2025.medium.puzzle2226;

@Deprecated
public class FastestSolutionFromLeetCode extends Solution {


    public boolean checkValid(int[] candie, int val, long k) {
        long count = 0;
        for (int pile : candie) {
            count += pile / val;
        }
        return count >= k;
    }

    @Override
    public int maximumCandies(int[] candies, long k) {

        long sum = 0;
        int min = 1;
        for (int candy : candies) {
            sum += candy;
        }
        if (sum < k) {
            return 0;
        }
        int max = (int) (sum / k);
        while (min <= max) {
            int mid = (min + max) / 2;
            if (checkValid(candies, mid, k)) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return max;
    }

}
