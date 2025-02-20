package com.eval.year2025.medium.puzzle1415;

class Solution {
    public String getHappyString(int n, int k) {
        int amountOfStrings = (int) (3 * Math.pow(2, n - 1));
        if (amountOfStrings < k) {
            return "";
        }

        String choices = "abc";
        StringBuilder sb = new StringBuilder();

        int left = 1;
        int right = amountOfStrings;

        for (int i = 0; i < n; i++) {

            int cur = left;
            int partitionSize = (right - left + 1) / choices.length();

            for (char c: choices.toCharArray()) {
                if (k >= cur && k < cur + partitionSize) {
                    sb.append(c);
                    left = cur;
                    right = cur + partitionSize - 1;
                    choices = "abc".replace(String.valueOf(c),"");
                    break;
                }else {
                    cur += partitionSize;
                }
            }

        }

        return sb.toString();
    }
}