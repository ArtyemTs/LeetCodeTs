package patterns.backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum_39 {
    List<List<Integer>> result = new ArrayList<>();
    int target;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.target = target;
        backtrack(new ArrayList<>(), candidates, 0, target);
        return result;
    }

    private void backtrack(List<Integer> curr, int[] cand, int idx, int target) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            result.add(new ArrayList<>(curr));
            return;
        }
        for (int i = idx; i < cand.length; i++) {
            curr.add(cand[i]);
            backtrack(curr, cand, i, target - cand[i]);
            curr.remove(curr.size() - 1);
        }
    }
}
