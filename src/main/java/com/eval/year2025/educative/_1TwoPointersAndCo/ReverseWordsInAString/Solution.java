package com.eval.year2025.educative._1TwoPointersAndCo.ReverseWordsInAString;


import java.util.*;

public class Solution {
    public static String reverseWords(String sentence) {
        sentence = sentence.trim();
        String[] words = sentence.split("\\s+");

        int left = 0;
        int right = words.length - 1;

        while (left < right) {
            String word = words[left];
            words[left] = words[right];
            words[right] = word;
            left++;
            right--;
        }
        return String.join(" ", words);
    }


}


