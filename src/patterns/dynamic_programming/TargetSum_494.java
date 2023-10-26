package patterns.dynamic_programming;

public class TargetSum_494 {
    int res = 0;

    public int findTargetSumWays(int[] nums, int target) {
        backtrack(nums, target, 0, 0);
        return res;
    }

    private void backtrack(int[] nums, int target, int sum, int idx) {
        if (idx == nums.length) {
            if (sum == target) {
                res ++;
            }
            return;
        }

        backtrack(nums, target, sum + nums[idx], idx + 1);
        backtrack(nums, target, sum - nums[idx], idx + 1);
    }
}
