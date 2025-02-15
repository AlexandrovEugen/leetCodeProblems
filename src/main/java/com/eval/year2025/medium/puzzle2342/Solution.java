package com.eval.year2025.medium.puzzle2342;

import java.util.HashMap;
import java.util.Map;

class Solution {


    private final Map<Integer, Integer> numberToSumOfIntegers = new HashMap<>();


    //best from LeetCode
    public int maximumSum(int[] nums) {
        int[] max = new int[100];
        int ans = -1;
        for(int x : nums){
            int dsum = 0;
            int temp = x;
            while(temp != 0){
                dsum += temp % 10;
                temp /= 10;
            }
            if(max[dsum] != 0) ans = Math.max(ans, x + max[dsum]);
            max[dsum] = Math.max(max[dsum], x);
        }
        return ans;
    }



    @Deprecated
    public int maximumSumSlow(int[] nums) {
        final Map<Integer, Integer> map = new HashMap<>();
        int maxSum = -1;

        for (int num : nums) {
            int sumDigits = computeSum(num);

            if (map.containsKey(sumDigits)) {
                int prevNum = map.get(sumDigits);
                int currentSum = prevNum + num;
                maxSum = Math.max(maxSum, currentSum);
                map.put(sumDigits, Math.max(prevNum, num));
            } else {
                map.put(sumDigits, num);
            }
        }

        return maxSum;
    }

    private int computeSum(int num) {
        if (num == 0) return 0;
        int sum = numberToSumOfIntegers.getOrDefault(num, 0);
        if (sum == 0) {
            sum+=num % 10;
            sum+=computeSum(num/10);
        }
        numberToSumOfIntegers.put(num, sum);
        return sum;
    }
}