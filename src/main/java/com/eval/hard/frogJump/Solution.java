package com.eval.hard.frogJump;


public class Solution {

    boolean[][] visitedGraph;

    public boolean canCross(int[] stones) {
        var n = stones.length;
        visitedGraph = new boolean[n][n];
        return recursiveProcessing(stones, 0, 1);
    }

    private boolean recursiveProcessing(int[] stones, int lastIndex, int currIndex) {
        if (currIndex == stones.length - 1) return true;

        if (visitedGraph[lastIndex][currIndex]) return false;

        var lastJump = stones[currIndex] - stones[lastIndex];
        var nextIndex = currIndex + 1;

        while (nextIndex < stones.length && stones[nextIndex] <= stones[currIndex] + lastJump + 1) {
            var nextJump = stones[nextIndex] - stones[currIndex];
            var jump = nextJump - lastJump;
            if (jump >= -1 && jump <= 1) {
                if (recursiveProcessing(stones, currIndex, nextIndex)) return true;
            }
            nextIndex++;
        }
        visitedGraph[lastIndex][currIndex] = true;
        return false;
    }


    /**
     * Deprecated cause its insufficiency
     *
     * @param stones    the array of stones in the river
     * @param lastIndex index of the stone the frog jumped from
     * @param currIndex index of the stone the frog in.
     * @return true if the frog is able to pass through the river
     */
    @Deprecated
    @SuppressWarnings("unused")
    private boolean recursiveProcessingDeprecated(int[] stones, int lastIndex, int currIndex) {
        if (currIndex == stones.length - 1) {
            return true;
        }
        var lastJump = stones[currIndex] - stones[lastIndex];

        var nextIndex = currIndex + 1;
        while (nextIndex < stones.length && stones[nextIndex] <= stones[currIndex] + lastJump + 1) {
            var nextJump = stones[nextIndex] - stones[currIndex];
            var jump = nextJump - lastJump;
            if (jump >= -1 && jump <= 1) {
                if (recursiveProcessingDeprecated(stones, currIndex, nextIndex)) return true;
            }
            nextIndex++;
        }
        return false;
    }
}