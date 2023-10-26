package patterns.backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses_22 {
    List<String> res = new ArrayList<>();
    int n = 0;

    public List<String> generateParenthesis(int n) {
        this.n = n;
        generate(0, 0, new StringBuilder(""));
        return res;
    }

    private void generate(int left, int right, StringBuilder current) {
        if (left + right == 2 * n) {
            res.add(current.toString());
            return;
        }
        if (left < n) {
            generate(left + 1, right, current.append("("));
            current.deleteCharAt(current.length() - 1);
        }
        if (right < left) {
            generate(left, right + 1, current.append(")"));
            current.deleteCharAt(current.length() - 1);
        }
    }

    // public List<String> generateParenthesis(int n) {
    //     this.n = n;
    //     generate(0, 0, "");
    //     return res;
    // }

    // private void generate(int left, int right, String current) {
    //     if (left + right == 2 * n) {
    //         res.add(current);
    //         return;
    //     }
    //     if (left < n) {
    //         generate(left + 1, right, current + "(");
    //     }
    //     if (right < left) {
    //         generate(left, right + 1, current + ")");
    //     }
    // }
}
