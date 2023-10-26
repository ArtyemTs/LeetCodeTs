package patterns.array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length;
        int left = 0;
        int right = matrix[0].length;

        int direction = 0;

        while (top < bottom && left < right) {
            if (direction == 0) {
                for (int i = left; i < right; i++) {
                    res.add(matrix[top][i]);
                }
                top++;
                direction = 1;
            } else if (direction == 1) {
                for (int i = top; i < bottom; i++) {
                    res.add(matrix[i][right - 1]);
                }
                right--;
                direction = 2;
            } else if (direction == 2) {
                for (int i = right - 1; i >= left; i--) {
                    res.add(matrix[bottom - 1][i]);
                }
                bottom--;
                direction = 3;
            } else if (direction == 3) {
                for (int i = bottom - 1; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
                direction = 0;
            }
        }

        return res;
    }
}
