package com.eval.old.easy.countingBits;


import lombok.val;

public class Solution {

    public int[] countBits(int n) {
        val ans = new int[n + 1];
        var offset = 1;

        for (int i = 1; i <= n; i++) {
            if (offset * 2 == i){
                offset = i;
            }
            ans[i] = 1 + ans[i - offset];
        }

        return ans;
    }


    @Deprecated
    public int[] countBitsFailed(int n) {

        int[] ans = new int[n + 1];
        ans[0] = 0;
        ans[1] = 1;

        var powerOfTwo = 2;
        var count = 1;

        for (int i = 2; i <= n; i++) {
            if (i == powerOfTwo){
                count = 1;
                ans[i] = count;
                powerOfTwo *=2;
            }  else if (i % 2 == 0){
                ans[i] = count;
            } else {
                count++;
                ans[i] = count;
            }
        }
        return ans;
    }
}
