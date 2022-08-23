package com.eval.longestSubstringWithoutRepeatingCharacters;

import lombok.val;
import java.util.Arrays;

public class Solution {

    static final int NO_OF_CHARS = 256;

    @Deprecated
    public int lengthOfLongestSubstringOld(String s) {
        StringBuilder test = new StringBuilder();

        // Result
        int maxLength = -1;

        // Return zero if string is empty
        if (s.isEmpty()) {
            return 0;
        }
        // Return one if string length is one
        else if (s.length() == 1) {
            return 1;
        }
        for (char c : s.toCharArray()) {
            String current = String.valueOf(c);

            // If string already contains the character
            // Then substring after repeating character
            if (test.toString().contains(current)) {
                test = new StringBuilder(test.substring(test.indexOf(current)
                        + 1));
            }
            test.append(c);
            maxLength = Math.max(test.length(), maxLength);
        }

        return maxLength;
    }

    @Deprecated
    public int lengthOfLongestSubstringMine(String s) {
        String max = "";
        if (s.isBlank()) {
            if (s.isEmpty()) {
                return 0;
            } else return 1;
        }
        if (s.length() == 1) {
            return 1;
        }
        StringBuilder tmp = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!tmp.toString().contains(String.valueOf(c))) {
                tmp.append(c);
            } else {
                if (max.length() < tmp.length()){
                    max = tmp.toString();
                }
                var i = tmp.indexOf(String.valueOf(c));
                var substring = tmp.append(c).substring(i + 1, tmp.length());
                tmp.setLength(0);
                tmp.append(substring);
            }
        }
        return Math.max(tmp.length(), max.length());
    }

    public int lengthOfLongestSubstring(String str) {
        int n = str.length();

        int res = 0; // result

        // last index of all characters is initialized
        // as -1
        int [] lastIndex = new int[NO_OF_CHARS];
        Arrays.fill(lastIndex, -1);

        // Initialize start of current window
        int i = 0;

        // Move end of current window
        for (int j = 0; j < n; j++) {

            // Find the last index of str[j]
            // Update i (starting index of current window)
            // as maximum of current value of i and last
            // index plus 1
            var c = str.charAt(j);
            i = Math.max(i, lastIndex[c] + 1);

            // Update result if we get a larger window
            res = Math.max(res, j - i + 1);

            // Update last index of j.
            lastIndex[c] = j;
        }
        return res;
    }
}
