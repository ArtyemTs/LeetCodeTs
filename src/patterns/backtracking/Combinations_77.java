package patterns.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations_77 {
    List<List<Integer>> res = new ArrayList<>();
    int k;

    public List<List<Integer>> combine(int n, int k) {
        this.k = k;
        backtrack(new ArrayList<>(), n, 1);
        return res;
    }

    private void backtrack(List<Integer> curr, int n, int start) {
        if (curr.size() == k) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int i = start; i <= n; i++) {
            curr.add(i);
            backtrack(curr, n, i + 1);
            curr.remove(curr.size() - 1);
        }
    }
}
