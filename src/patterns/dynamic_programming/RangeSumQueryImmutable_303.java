package patterns.dynamic_programming;

public class RangeSumQueryImmutable_303 {
    int[] sums;

    public RangeSumQueryImmutable_303(int[] nums) {
        sums = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sums[i] = sum;
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return sums[right];
        }
        return sums[right] - sums[left - 1];
    }
}
