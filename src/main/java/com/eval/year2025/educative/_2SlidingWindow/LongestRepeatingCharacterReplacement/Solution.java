package com.eval.year2025.educative._2SlidingWindow.LongestRepeatingCharacterReplacement;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    @Deprecated(forRemoval = true)
    public int longestRepeatingCharacterReplacementNotWorking(String s, int k) {
        if (s == null || s.isEmpty()) return 0;
        if (k >= s.length()) return s.length();

        final Map<Character, Integer> dict = new HashMap<>();

        char prev = s.charAt(0);
        dict.put(prev, 0);

        int i = 0;
        int j = 1;
        int maxLength = 0;

        while (j < s.length()) {
            char curr = s.charAt(j);
            while (curr == prev) {
                dict.put(curr, j);
                curr = s.charAt(++j);
            }
            if (dict.containsKey(curr)) {
                int p = dict.get(curr);
                if (j - k - 1 <= p) {
                    while (p >= 0 && s.charAt(p) == curr) {
                        p--;
                    }
                    i = p;
                    maxLength = Math.max(maxLength, j - i);
                }
            } else {
                i = j;
                maxLength = Math.max(maxLength, 1);
            }
            dict.put(curr, j);
            prev = curr;
            j++;
        }

        return Math.max(maxLength, j - i);
    }

    public int longestRepeatingCharacterReplacement(String s, int k) {
        int stringLength = s.length();
        int lengthOfMaxSubstring = 0;
        int start = 0;
        Map<Character, Integer> charFreq = new HashMap<>();
        int mostFreqChar = 0;

        for (int end = 0; end < stringLength; ++end) {
            char currentChar = s.charAt(end);

            charFreq.put(currentChar, charFreq.getOrDefault(currentChar, 0) + 1);

            mostFreqChar = Math.max(mostFreqChar, charFreq.get(currentChar));

            if (end - start + 1 - mostFreqChar > k) {
                charFreq.put(s.charAt(start), charFreq.get(s.charAt(start)) - 1);
                start += 1;
            }

            lengthOfMaxSubstring = Math.max(lengthOfMaxSubstring, end - start + 1);
        }

        return lengthOfMaxSubstring;
    }
}
