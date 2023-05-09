package com.epam.rd.autotasks.matrix;

import java.util.Arrays;

public class MatrixUtil {

	public static void transformMatrix(int[][] matrix) {
		     if (matrixHasNull(matrix) || matrix[0].length != matrix[1].length || matrix.length % 2 != 0 ) {
            System.out.println(Arrays.deepToString(matrix));
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i < j) {
                        matrix[i][j] = 1;
                    } else if (i > j) {
                        matrix[i][j] = 0;
                    }
                }
            }
            for (int[] ints : matrix) {
                System.out.println(Arrays.toString(ints));
            }
        }
	}
	private static boolean matrixHasNull(int[][] matrix) {
        for (int[] ints : matrix) {
            if (ints == null || ints.length == 0) {
                return true;
            }
        }
        return false;
    }

	public static void main(String[] args) {
		{
			int[][] matrix = null;
			transformMatrix(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}
		{
			int[][] matrix = {};
			transformMatrix(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}
		{
			int[][] matrix = { {} };
			transformMatrix(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}
		{
			int[][] matrix = { {}, {} };
			transformMatrix(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}
		{
			int[][] matrix = { { 2, 3 }, { 4, 5, 6 } };
			transformMatrix(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}
		{
			int[][] matrix = { { 2, 3 }, { 4, 5 }, {} };
			transformMatrix(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}
		{
			int[][] matrix = { { 2, 3 }, { 4, 5 } };
			transformMatrix(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}
		{
			int[][] matrix = { { 2, 4, 3, 3 }, { 5, 7, 8, 5 }, { 2, 4, 3, 3 }, { 5, 7, 8, 5 } };
			transformMatrix(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}
		{

			int[][] matrix = { { 2, 3 }, { 4, 5 }, { 6, 7 } };
			transformMatrix(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}
		{
			int[][] matrix = { { 2, 4, 3, 3 }, { 5, 7, 8, 5 }, { 2, 4, 3, 3 } };
			transformMatrix(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}

	}

}
