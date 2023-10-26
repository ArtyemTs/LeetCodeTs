package patterns.binary_search;

public class AlgBinarySearch_704 {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int index = (low + high) / 2;
            int mid = nums[index];
            if (mid == target) {
                return index;
            }
            if (mid < target) {
                low = index + 1;
            }
            if (mid > target){
                high = index - 1;
            }
        }
        return -1;
    }
}
