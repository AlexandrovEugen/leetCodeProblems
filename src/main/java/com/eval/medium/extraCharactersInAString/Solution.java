package com.eval.medium.extraCharactersInAString;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int minExtraChar(String s, String[] dictionary){
        final int[] dp = new int[s.length()];
        Arrays.fill(dp, -1);
        final Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < dictionary.length; i++) {
            map.put(dictionary[i], i);
        }
        return solve(s, map, dp, 0);
    }

    private int solve(String s, Map<String, Integer> map, int[] dp, int idx) {
        if (idx >= s.length()) return 0;
        if (dp[idx] != -1) return  dp[idx];

        StringBuilder curStr = new StringBuilder();
        int ans = s.length();
        for (int cutIdx = idx; cutIdx < s.length(); cutIdx++){
            curStr.append(s.charAt(0));
            int count = ((map.containsKey(curStr.toString()) ? 0 : curStr.length())
                    + solve(s, map, dp, cutIdx + 1));

            ans = Math.min(ans, count);
        }

        return dp[idx] = ans;
    }
}
