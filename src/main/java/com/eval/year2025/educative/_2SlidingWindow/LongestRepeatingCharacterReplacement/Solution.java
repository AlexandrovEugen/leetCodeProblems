package com.eval.year2025.educative._2SlidingWindow.LongestRepeatingCharacterReplacement;


import java.util.HashMap;
import java.util.Map;

public class Solution {


    public int longestRepeatingCharacterReplacement(String s, int k) {
        int i = 0;
        final Map<Character, Integer> freq = new HashMap<>();

        int maxFreq = 0;
        int maxLength = 0;

        for (int j = 0; j < s.length(); j++) {
            final char curr = s.charAt(j);
            freq.put(curr, freq.getOrDefault(curr, 0) + 1);

            maxFreq = Math.max(maxFreq, freq.get(curr));

            if (j - i + 1 - maxFreq > k) {
                freq.put(s.charAt(i), freq.get(s.charAt(i)) - 1);
                i++;
            }

            maxLength = Math.max(maxLength, j - i + 1);
        }

        return maxLength;
    }
}
