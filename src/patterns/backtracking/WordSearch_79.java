package patterns.backtracking;

public class WordSearch_79 {
    public boolean exist(char[][] board, String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++){
                if (board[i][j] == chars[0] && traverse(board, i, j, chars, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean traverse(char[][] board, int i, int j, char[] chars, int index) {
        if (index == chars.length) {
            return true;
        }
        if (i < 0 || i >= board.length
                || j < 0 || j >= board[0].length
                || board[i][j] != chars[index]) {
            return false;
        }
        boolean match = false;
        char origVal = board[i][j];
        board[i][j] = '_';

        match = traverse(board, i + 1, j, chars, index + 1)
                || traverse(board, i - 1, j, chars, index + 1)
                || traverse(board, i, j + 1, chars, index + 1)
                || traverse(board, i, j - 1, chars, index + 1);

        board[i][j] = origVal;

        return match;
    }
}
