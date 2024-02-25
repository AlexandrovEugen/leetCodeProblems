package com.eval.educative.basicDataStructures.spiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> integers = new ArrayList<>();

        int row = 0;
        int col = 0;
        int direction = 1;

        if (matrix.length == 0){
            return integers;
        }

        int topRow = 0;
        int bottomRow = matrix.length -1;

        int leftCol = 0;
        int rightCol = matrix[0].length -1;

        while (topRow <= bottomRow){


            while (col >= leftCol && col <= rightCol){
                integers.add(matrix[row][col]);
                col+=direction;
            }
            col += -1 * direction;
            row += direction;


            while (row >= topRow && row <= bottomRow){
                integers.add(matrix[row][col]);
                row += direction;
            }
            col += -1 * direction;
            row += -1 * direction;

            if (direction > 0){
                topRow++;
                rightCol--;
            } else {
                bottomRow--;
                leftCol++;
            }

            direction *= -1;
        }

        return integers;
    }


}
