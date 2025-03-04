package com.eval.year2025.medium.puzzle1780;

class Solution {


    public boolean checkPowersOfThree(int n) {
//        return backtrack(0, 0, n);

        // O(log_3(n) << n
        int power = 0;
        while (Math.pow(3, power + 1) <= n) {
            power += 1;
        }
        while (power >= 0) {
            int amount = (int) Math.pow(3, power);
            if (n >= amount) {
                n -= amount;
            }
            power--;
        }
        return n == 0;
    }


    // O(2^log_3(n)) < O(n)
    private boolean backtrack(int i, int curr, int n) {
        if (curr == n) {
            return true;
        }
        if (curr > n || Math.pow(3, i) > n) {
            return false;
        }
        if (backtrack(i + 1, curr + (int) Math.pow(3, i), n)) {
            return true;
        }
        return backtrack(i + 1, curr, n);
    }


}