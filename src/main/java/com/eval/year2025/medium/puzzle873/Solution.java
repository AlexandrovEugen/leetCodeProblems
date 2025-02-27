package com.eval.year2025.medium.puzzle873;

import java.util.HashSet;
import java.util.Set;


class Solution {



    @Deprecated
    public int lenLongestFibSubseqNeetCode(int[] arr) {
        int result = 0;
        Set<Integer> set = new HashSet<>();
        for (int el : arr) {
            set.add(el);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int prev = arr[i];
                int cur = arr[j];
                int next = prev + cur;
                int length = 2;
                while (set.contains(next)) {
                    length += 1;
                    prev = cur;
                    cur = next;
                    next = prev + cur;
                    result = Math.max(result, length);
                }
            }
        }
        return result;
    }


    public int lenLongestFibSubseq(int[] arr) {
        int result = 0;
        if (arr == null || arr.length < 3) {
            return 0;
        }

        Set<Integer> subseq = new HashSet<>();
        for (int el : arr) {
            subseq.add(el);
        }
        int i = 0;
        while (i < arr.length - 1) {
            int prev = arr[i];
            int curr = arr[i + 1];
            int next = curr + prev;
            int currRes = 0;
            while (subseq.contains(next)) {
                currRes+=1;
                prev = curr;
                curr = next;
                next = curr + prev;
                result = Math.max(result, currRes + 2);
            }
            i++;
        }
        return result;
    }


    @Deprecated
    public int lenLongestFibSubseqNotWorking(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        if (arr.length < 3) {
            return 0;
        }
        //First lets try the bruteforce solution
        int result = 0;
        int currResult = 0;
        int j = 2;
        while (j < arr.length) {
            int prepre = arr[j - 2];
            int pre = arr[j - 1];
            for (int i = j; i < arr.length; i++) {
                if (arr[i] == prepre + pre) {
                    currResult++;
                    prepre = pre;
                    pre = arr[i];
                }
            }
            j++;
            result = Math.max(result, currResult + 2);
            currResult = 0;
        }

        return result;
    }
}