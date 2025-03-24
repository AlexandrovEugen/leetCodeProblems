package com.eval.year2025.educative._2BasicDataStructures.LargestRectangleInHistogram;

import java.util.Stack;

class Solution {

    // Function to find the largest rectangle area formed by given heights.
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            while (stack.peek() != -1 && heights[stack.peek()] >= heights[i]) {
                int currentHeight = heights[stack.pop()];

                int rightBoundary = i;
                int leftBoundary = stack.peek();
                int currentWidth = rightBoundary - leftBoundary - 1;

                int currentArea = currentHeight * currentWidth;

                maxArea = Math.max(maxArea, currentArea);
            }

            stack.push(i);
        }

        int n = heights.length;

        while (stack.peek() != -1) {
            int currentHeight = heights[stack.pop()];

            int leftBoundary = stack.peek();
            int currentWidth = n - leftBoundary - 1;

            int currentArea = currentHeight * currentWidth;

            maxArea = Math.max(maxArea, currentArea);
        }

        return maxArea;
    }

    @Deprecated
    public int largestRectangleAreaTimeLimitExceed(int[] heights) {
        int maxSize = 0;
        for (int r = 0; r < heights.length; r++) {
            int curHist = heights[r];
            int size = curHist;
            int j = r + 1;
            while (j < heights.length && curHist <= heights[j]) {
                size += curHist;
                j++;
            }
            j = r - 1;
            while (j >= 0 && curHist <= heights[j]) {
                size += curHist;
                j--;
            }
            if (size > maxSize) {
                maxSize = size;
            }
        }
        return maxSize;
    }
}
