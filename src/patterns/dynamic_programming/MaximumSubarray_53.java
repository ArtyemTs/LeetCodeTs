package patterns.dynamic_programming;

public class MaximumSubarray_53 {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            currSum = Math.max(currSum + num, num);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
