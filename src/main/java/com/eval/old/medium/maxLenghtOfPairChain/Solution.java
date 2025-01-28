package com.eval.old.medium.maxLenghtOfPairChain;


import java.util.Arrays;

public class Solution {

    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (o1, o2) -> {
            if (o1[1] == o2[1]) return 0;
            return o1[1] < o2[1] ? -1 : 1;
        });

        var length = 1;
        var end = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (end < pairs[i][0]){
                length++;
                end = pairs[i][1];
            }
        }
        return length;
    }


}
