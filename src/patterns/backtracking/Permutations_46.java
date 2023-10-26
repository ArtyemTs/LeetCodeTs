package patterns.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Permutations_46 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        backtrack(nums, 0);
        return res;
    }

    private void backtrack(int[] nums, int idx) {
        if (idx == nums.length) {
            res.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            int temp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;
            backtrack(nums, idx + 1);
            temp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;
        }
    }
}
