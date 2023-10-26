package patterns.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Find All Numbers Disappeared In An Array_448

public class AlgCyclicSort {

    //Cyclic Sort Alg =========
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int pos = nums[i] - 1;
            if (nums[i] != nums[pos]) {
                int temp = nums[i];
                nums[i] = nums[pos];
                nums[pos] = temp;
            }
            i++;
        }
    //==============

        System.out.println(Arrays.toString(nums));

        List<Integer> res = new ArrayList<>();
        for (int num : nums) {
            if (nums[i] - 1 != i) {
                res.add(i + 1);
            }
        }
        return res;
    }
}
