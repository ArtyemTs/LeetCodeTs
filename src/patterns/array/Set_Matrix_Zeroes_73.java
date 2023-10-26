package patterns.array;

import java.util.Arrays;

public class Set_Matrix_Zeroes_73 {

    public static void main(String[] args) {
//        int[][] matrix = {{0,1}};
        int[][] matrix = {{1, 0, 3}};
        setZeroes(matrix);
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }

    }

    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        boolean rZero = false;
        boolean cZero = false;

        for (int r = 0; r < rows; r++) {
            if (matrix[r][0] == 0) {
                cZero = true;
            }
        }
        for (int c = 0; c < columns; c++) {
            if (matrix[0][c] == 0) {
                rZero = true;
            }
        }

        for (int r = 1; r < rows; r++) {
            for (int c = 1; c < columns; c++) {
                if (matrix[r][c] == 0) {
                    matrix[r][0] = 0;
                    matrix[0][c] = 0;
                }
            }
        }

        for (int r = 1; r < rows; r++) {
            for (int c = 1; c < columns; c++) {
                if (matrix[r][0] == 0 || matrix[0][c] == 0) {
                    matrix[r][c] = 0;
                }
            }
        }

        if (rZero) {
            for (int c = 0; c < columns; c++) {
                matrix[0][c] = 0;
            }
        }
        if (cZero) {
            for (int r = 0; r < rows; r++) {
                matrix[r][0] = 0;
            }
        }
    }
}

