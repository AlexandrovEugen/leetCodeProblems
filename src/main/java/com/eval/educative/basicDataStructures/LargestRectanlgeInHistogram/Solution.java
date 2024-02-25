package com.eval.educative.basicDataStructures.LargestRectanlgeInHistogram;


import java.util.Stack;

public class Solution {

    @Deprecated
    public static int largestRectangleMine(int[] heights){
        int maxSize = 0;
        for (int i = 0; i < heights.length; i++) {
            int curHist = heights[i];
            int size = curHist;
            int j = i + 1;
            while (j < heights.length && curHist <= heights[j]){
                size += curHist;
                j++;
            }
            j = i - 1;
            while (j >= 0 &&  curHist <= heights[j]){
                size += curHist;
                j--;
            }
            if (size > maxSize){
                maxSize = size;
            }
        }
        return maxSize;
    }

    // Function to find the largest rectangle area formed by given heights.
    public static int largestRectangle(int[] heights) {
        // Initialize a stack with a sentinel value -1.
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        // Initialize the variable to store the maximum area.
        int maxArea = 0;

        // Iterate through the array of heights.
        for (int i = 0; i < heights.length; i++) {
            // Check if the current height is less than or equal to the height at the top of the stack.
            while (stack.peek() != -1 && heights[stack.peek()] >= heights[i]) {
                // Pop the stack to get the height of the rectangle.
                int currentHeight = heights[stack.pop()];

                // Calculate the right and left boundaries of the rectangle.
                int rightBoundary = i;
                int leftBoundary = stack.peek();
                int currentWidth = rightBoundary - leftBoundary - 1;

                // Calculate the area of the current rectangle.
                int currentArea = currentHeight * currentWidth;

                // Update the maximum area if the current area is greater.
                maxArea = Math.max(maxArea, currentArea);
            }

            // Push the current index onto the stack.
            stack.push(i);
        }

        // Calculate the length of the heights array.
        int n = heights.length;

        // Process any remaining elements in the stack.
        while (stack.peek() != -1) {
            // Pop the stack to get the height of the rectangle.
            int currentHeight = heights[stack.pop()];

            // Calculate the left boundary of the rectangle.
            int leftBoundary = stack.peek();
            int currentWidth = n - leftBoundary - 1;

            // Calculate the area of the current rectangle.
            int currentArea = currentHeight * currentWidth;

            // Update the maximum area if the current area is greater.
            maxArea = Math.max(maxArea, currentArea);
        }

        // Return the final maximum area of the largest rectangle.
        return maxArea;
    }

}
