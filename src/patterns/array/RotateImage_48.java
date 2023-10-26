package patterns.array;

public class RotateImage_48 {
    public void rotate(int[][] m) {
        int top = 0;
        int bottom = m.length - 1;

        while (top < bottom) {
            for (int i = 0; i < bottom - top; i++) {

                int temp = m[top][top + i];
                m[top][top + i] = m[bottom - i][top];
                m[bottom - i][top] = m[bottom][bottom - i];
                m[bottom][bottom - i] = m[top + i][bottom];
                m[top + i][bottom] = temp;
            }
            top++;
            bottom--;
        }
    }
}
