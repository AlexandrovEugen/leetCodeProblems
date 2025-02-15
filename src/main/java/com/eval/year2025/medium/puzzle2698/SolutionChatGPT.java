package com.eval.year2025.medium.puzzle2698;

class SolutionChatGPT {
    @Deprecated
    public int punishmentNumber(int n) {
        var sum = 0;

        for (int i = 1; i <= n; i++) {
            int square = i * i;
            if (canPartition(Integer.toString(square), 0, i, 0)) {
                sum += square;
            }
        }

        return sum;
    }

    private boolean canPartition(String s, int index, int target, int currentSum) {
        if (index == s.length()) {
            return currentSum == target;
        }

        int num = 0;
        for (int j = index; j < s.length(); j++) {
            num = num * 10 + (s.charAt(j) - '0');
            if (num + currentSum > target) break; // Prune invalid paths
            if (canPartition(s, j + 1, target, currentSum + num)) {
                return true;
            }
        }

        return false;
    }

}
