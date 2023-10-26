package patterns.backtracking;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation_784 {
    List<String> res = new ArrayList<>();

    public List<String> letterCasePermutation(String s) {
        traverse(s.toCharArray(), 0);
        return res;
    }

    private void traverse(char[] arr, int idx) {
        if (arr.length == idx) {
            res.add(new String(arr));
            return;
        }

        if (Character.isDigit(arr[idx])) {
            traverse(arr, idx + 1);
            return;
        }

        arr[idx] = Character.toUpperCase(arr[idx]);
        traverse(arr, idx + 1);

        arr[idx] = Character.toLowerCase(arr[idx]);
        traverse(arr, idx + 1);
    }
}
