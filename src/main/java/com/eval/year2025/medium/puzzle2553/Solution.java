package com.eval.year2025.medium.puzzle2553;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] closestPrimNumbers(int left, int right) {
        List<Integer> primes = getPrimes(left, right);
        int[] result = {-1, -1};
        int diff = Integer.MAX_VALUE;
        for (int i = 1; i < primes.size(); i++) {
            if (primes.get(i) - primes.get(i - 1) < diff) {
                diff = primes.get(i) - primes.get(i - 1);
                result = new int[]{primes.get(i - 1), primes.get(i)};
            }
        }
        return result;
    }


    private List<Integer> getPrimes(int left, int right) {
        boolean[] isPrime = new boolean[right + 1];
        for (int i = 2; i < (int) Math.sqrt(right) + 1; i++) {
            int k = i;
            while (k * i <= right) {
                isPrime[i * k] = true;
                k++;
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (!isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

}
