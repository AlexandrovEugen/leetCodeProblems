package com.eval.year2025.medium.puzzle3160;


import java.util.HashMap;
import java.util.Map;

class Solution {

    /*
    Fastest solution from LeetCode
     */
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer,Integer> node = new HashMap<>();
        Map<Integer,Integer> color = new HashMap<>();
        int[] ans =new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int[] it =queries[i];
            if(node.containsKey(it[0])){
                if(node.get(it[0])==it[1]) {
                    ans[i]=color.size();continue;
                }
                else if (color.get(node.get(it[0]))<=1) color.remove(node.get(it[0]));
                else
                    color.put(node.get(it[0]),color.get(node.get(it[0]))-1);
            }
            node.put(it[0],it[1]);
            color.put(it[1],color.getOrDefault(it[1],0)+1);
            ans[i]=color.size();
        }
        return ans;
    }



    @Deprecated
    //I don't need balls colours at all.
    public int[] queryResultsFromPythonCode(int limit, int[][] queries){
        final Map<Integer,Integer> colors = new HashMap<>();
        final Map<Integer, Integer> f = new HashMap<>();
        int uniqAmount = 0;
        int[] results = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];

            int prev = colors.getOrDefault(ball, 0);
            if (prev != 0){
                f.compute(prev, (k, prevCount) -> prevCount - 1);
                if (f.get(prev) == 0){
                    uniqAmount--;
                }
            }
            colors.put(ball, color);
            int count = f.getOrDefault(color, 0);
            f.put(color, count + 1);
            if (f.get(color) == 1){
                uniqAmount++;
            }
            results[i] = uniqAmount;
        }

        return results;
    }


    @Deprecated
    public int[] queryResultsMemoryExceeds(int limit, int[][] queries) {
        final Map<Integer,Integer> colorsCounts = new HashMap<>();
        int[] ballsColors = new int[limit + 1];
        int uniqAmount = 0;

        int[] results = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];

            int colorCount = colorsCounts.getOrDefault(color, 0);
            if (ballsColors[ball] == 0) {
                ballsColors[ball] = color;
                if (colorCount == 0) {
                    colorsCounts.put(color, colorCount + 1);
                    uniqAmount++;
                }else {
                    colorsCounts.put(color, colorCount + 1);
                }
            }else {
                int prevColor = ballsColors[ball];
                ballsColors[ball] = color;
                int prevColorCount = colorsCounts.get(prevColor);
                prevColorCount--;
                if (color != prevColor) {
                    if (colorCount == 0) {
                        if (prevColorCount != 0) {
                            uniqAmount++;
                        }
                    } else {
                        if (prevColorCount == 0) {
                            uniqAmount--;
                        }
                    }
                    colorsCounts.put(prevColor, prevColorCount);
                    colorsCounts.put(color, colorCount + 1);
                }
            }
            results[i] = uniqAmount;
        }

        return results;
    }


    /*
    I don't now the exact colors
     */
    @Deprecated
    public int[] queryResultsFailedWithRuntimeException(int limit, int[][] queries) {
        int[] ballsColors = new int[limit + 1];
        int[] colorsCount = new int[limit + 2];
        int uniqAmount = 0;

        int[] results = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];

            if (ballsColors[ball] == 0) {
                ballsColors[ball] = color;
                if (colorsCount[color] == 0) {
                    colorsCount[color]++;
                    uniqAmount++;
                }else {
                    colorsCount[color]++;
                }
            }else {
                int prevColor = ballsColors[ball];
                colorsCount[prevColor]--;
                if (colorsCount[prevColor] != 0) {
                    uniqAmount++;
                }
                ballsColors[ball] = color;
                colorsCount[color]++;
            }
            results[i] = uniqAmount;
        }

        return results;
    }
}