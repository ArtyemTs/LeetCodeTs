package patterns.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII_40 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(new ArrayList<>(), candidates, 0, target);
        return res;
    }

    private void backtrack(List<Integer> curr, int[] cands, int idx, int target) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int i = idx; i < cands.length; i++) {
            //проверка что не начало массива и что не дубликат
            if (i > idx && cands[i] == cands[i - 1]) {
                continue;
            }
            curr.add(cands[i]);
            backtrack(curr, cands, i + 1, target - cands[i]);
            curr.remove(curr.size() - 1);
        }
    }
}
