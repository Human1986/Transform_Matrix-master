package com.epam.rd.autotasks.matrix;

public class MatrixUtil {

    public static void transformMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return;
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (ints.length != matrix[0].length) return;
            }

        }
        if (matrix.length != matrix[0].length) return;


        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    matrix[i][j] = 0;
                } else if (j > i) {
                    matrix[i][j] = 1;
                }
            }
        }

    }

}
