package patterns.backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII_216 {
    List<List<Integer>> res = new ArrayList<>();
    int k;

    public List<List<Integer>> combinationSum3(int k, int n) {
        this.k = k;

        backtrack(new ArrayList<>(), 1, n);
        return res;
    }

    private void backtrack(List<Integer> curr, int pos, int target) {
        if (curr.size() == k) {
            if (target == 0) {
                res.add(new ArrayList<>(curr));
            }
            return;
        }
        for (int i = pos; i <= 9; i++) {
            curr.add(i);
            backtrack(curr, i + 1, target - i);
            curr.remove(curr.size() - 1);
        }
    }
}
