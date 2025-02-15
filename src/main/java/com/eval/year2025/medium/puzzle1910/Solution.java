package com.eval.year2025.medium.puzzle1910;


class Solution {

    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder();
        int partLength = part.length();

        for (char c : s.toCharArray()) {
            sb.append(c);
            // Check if the end of StringBuilder contains "part"
            if (sb.length() >= partLength && sb.substring(sb.length() - partLength).equals(part)) {
                sb.setLength(sb.length() - partLength); // Remove last occurrence
            }
        }

        return sb.toString();
    }

    @Deprecated
    public static String removeOccurrencesFromFastestOnLeetCode(String str, String part) {
        char[] input = str.toCharArray();
        char[] target = part.toCharArray();
        char[] resultStack = new char[input.length];
        int targetLength = target.length;
        int stackSize = 0;
        char targetEndChar = target[targetLength - 1];

        for (char currentChar : input) {
            resultStack[stackSize++] = currentChar;

            if (currentChar == targetEndChar && stackSize >= targetLength) {
                int i = stackSize - 1, j = targetLength - 1;

                while (j >= 0 && resultStack[i] == target[j]) {
                    i--;
                    j--;
                }

                if (j < 0) {
                    stackSize = i + 1;
                }
            }
        }

        return new String(resultStack, 0, stackSize);
    }


    @Deprecated
    public String removeOccurrencesBadSolution(String s, String part) {
        while (s.contains(part)) {
            s = s.replaceFirst(part, "");
        }
        return s;
    }
}