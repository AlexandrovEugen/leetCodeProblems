package com.eval.year2025.easy.puzzle2379;

public class Solution {

    public int minimumRecolors(String blocks, int k) {
        int l = 0;
        int r = 0;
        int recolor = 0;
        int result = k;

        while(r < blocks.length()) {
            if (blocks.charAt(r) == 'W') {
                recolor++;
            }
            if (r - l + 1 == k){
                result = Math.min(result, recolor);
                if (blocks.charAt(l) == 'W') {
                    recolor--;
                }
                l++;
            }
            r++;
        }
        return result;
    }

}
