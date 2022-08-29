package com.eval.medium.sortTheMatrixDiagonally;

import java.util.Arrays;

public class Solution {

    public int[][] diagonalSort(int[][] mat) {
        int y = mat.length, x = mat[0].length - 1;
        int[] diag = new int[y];
        for (int i = 2 - y; i < x; i++) {
            int k = 0;
            for (int j = 0; j < y; j++)
                if (i+j >= 0 && i+j <= x)
                    diag[k++] = mat[j][i+j];
            Arrays.sort(diag, 0, k);
            k = 0;
            for (int j = 0; j < y; j++)
                if (i+j >= 0 && i+j <= x)
                    mat[j][i+j] = diag[k++];
        }
        return mat;
    }

}
