package com.eval.year2025.medium.puzzle2140;

class Solution {

    private long[] cache;

    public long mostPoints(int[][] questions) {
        cache = new long[questions.length];

        for (int i = questions.length - 1; i >= 0; i--) {
            int reward = questions[i][0];
            int brainpower = questions[i][1];

            long choose = reward + (i + 1 + brainpower >= questions.length ? 0 : cache[i + 1 + brainpower]);
            long skip = (i + 1 >= questions.length ? 0 : cache[i + 1]);

            cache[i] = Math.max(choose, skip);
        }
        return cache[0];
    }


    @Deprecated
    public long mostPointsWithBacktrack(int[][] questions) {
        cache = new long[questions.length];
        return backtrack(0, questions);
    }

    private long backtrack(int index, int[][] questions) {
        if (index >= questions.length) {
            return 0;
        }
        if (cache[index] != 0) {
            return cache[index];
        }
        cache[index] = Math.max(
                backtrack(index + 1, questions),
                questions[index][0] + backtrack(index + questions[index][1] + 1, questions));
        return cache[index];
    }
}
