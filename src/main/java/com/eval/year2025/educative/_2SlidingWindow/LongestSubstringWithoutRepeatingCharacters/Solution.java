package com.eval.year2025.educative._2SlidingWindow.LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int findLongestSubstring(String str) {
        int i = 0;
        int j = 0;
        int maxLength = 0;
        int curLength = 0;
        final Map<Character, Integer> cache = new HashMap<>();

        while(j < str.length()){
            char cur = str.charAt(j);
            if(!cache.containsKey(cur)){
                cache.put(cur, j);
                curLength++;
                j++;
            }else {
                int lastOcc = cache.get(cur);
                if(lastOcc < i){
                    cache.put(cur, j);
                    j++;
                    curLength++;
                }else {
                    i = lastOcc + 1;
                    maxLength = Math.max(maxLength, curLength);
                    cache.put(cur, j);
                    j++;
                    curLength = j - i;
                }
            }
        }



        // Replace this placeholder return statement with your code
        return Math.max(maxLength, curLength);
    }

}
