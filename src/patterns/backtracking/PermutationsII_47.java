package patterns.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class PermutationsII_47 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        backtrack(0, nums);
        return List.copyOf(new HashSet<>(res));
    }

    private void backtrack(int curr, int[] nums) {
        if (curr == nums.length) {
            res.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
            return;
        }
        for (int i = curr; i < nums.length; i++) {
            int temp = nums[i];
            nums[i] = nums[curr];
            nums[curr] = temp;

            backtrack(curr + 1, nums);

            temp = nums[i];
            nums[i] = nums[curr];
            nums[curr] = temp;
        }
    }
}
