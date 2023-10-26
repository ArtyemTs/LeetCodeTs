package patterns.two_pointers;

public class SquaresofaSortedArray_977 {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int l = 0; //left index
        int r = nums.length - 1; //right index

        for (int i = nums.length - 1; i >= 0; i--) {
            // if (Math.abs(nums[l]) >  Math.abs(nums[r])) {
            // или проще без модуля
            if (nums[l] * nums[l] >  nums[r] * nums[r]) {
                res[i] = nums[l] * nums[l];
                l++;
            } else {
                res[i] = nums[r] * nums[r];
                r--;
            }
        }
        return res;
    }
}
