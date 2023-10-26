package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> a = new ArrayList<>();
        a.add(1);
        List<Integer> b = new ArrayList<>();
        b.add(2);
        b.add(3);
        List<Integer> c = new ArrayList<>();
        c.add(3);
        c.add(2);
        set.add(a);
        set.add(b);
        set.add(c);
        set.forEach(e -> System.out.println(e.toString()));

        System.out.println("--------");


        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(target - nums[i])) {
                return new int[]{numToIndex.get(target - nums[i]), i};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[] {2,7,11,15}, 9)));
    }
}
