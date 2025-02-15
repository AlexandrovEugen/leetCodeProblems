package com.eval.year2025.medium.puzzle2698;

public class Solution {

    public int punishmentNumber(int n) {
        int punishmentNumber = 0;
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            if (canPartition(Integer.toString(square),0, i, 0)){
                punishmentNumber += square;
            }
        }

        return punishmentNumber;
    }

    private boolean canPartition(String sqareAsAString, int index, int target, int currentSum) {
        if (index == sqareAsAString.length()) {
            return currentSum == target;
        }

        int num = 0;
        for (int i = index; i < sqareAsAString.length(); i++) {
            num =  num * 10 + (sqareAsAString.charAt(i) - '0');
            if (num + currentSum > target) {
                break;
            }
            if (canPartition(sqareAsAString, i + 1, target, num + currentSum)) {
                return true;
            }
        }
        return false;
    }
}
