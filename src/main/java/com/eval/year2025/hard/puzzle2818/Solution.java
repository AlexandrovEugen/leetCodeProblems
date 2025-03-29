package com.eval.year2025.hard.puzzle2818;

import java.util.*;


class Solution {
    public int maximumScore(List<Integer> nums, int k) {
        final int MOD = 1_000_000_007;
        final int N = nums.size();

        final int[] primes = new int[N];

        for (int i = 0; i < N; i++) {
            int n = nums.get(i);
            int score = 0;
            for (int f = 2; f <= Math.sqrt(n); f++) {
                if (n % f == 0) {
                    score += 1;
                    while (n % f == 0) {
                        n /= f;
                    }
                }
            }
            if (n >= 2) {
                score += 1;
            }
            primes[i] = score;
        }

        int[] right = new int[N];
        Arrays.fill(right, N);
        int[] left = new int[N];
        Arrays.fill(left, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < primes.length; i++) {
            while (!stack.isEmpty() && primes[stack.peek()] < primes[i]) {
                Integer index = stack.pop();
                right[index] = i;
            }
            if (!stack.isEmpty()) {
                left[i] = stack.peek();
            }
            stack.push(i);
        }

        int[][] minHeap = new int[N][2];
        for (int i = 0; i < N; i++) {
            minHeap[i][0] = nums.get(i);
            minHeap[i][1] = i;
        }
        Arrays.sort(minHeap, Comparator.comparing(a -> a[0]));

        int i = N - 1;
        long product = 1;
        while (k > 0) {
            int index = minHeap[i][1];
            int number = minHeap[i][0];

            int score = primes[index];
            int leftCount = index - left[index];
            int rightCount = right[index] - index;

            int count = leftCount * rightCount;
            int operation = Math.min(k, count);
            k -= operation;
            product = (product * power(number, operation, MOD)) % MOD;
            i--;
        }

        return (int) product;
    }

    // Helper function to compute the power of a number modulo MOD
    private long power(long base, long exponent, int MOD) {
        long res = 1;

        // Calculate the exponentiation using binary exponentiation
        while (exponent > 0) {
            // If the exponent is odd, multiply the result by the base
            if (exponent % 2 == 1) {
                res = (res * base) % MOD;
            }

            // Square the base and halve the exponent
            base = (base * base) % MOD;
            exponent /= 2;
        }

        return res;
    }
}
