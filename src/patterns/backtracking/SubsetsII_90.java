package patterns.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class SubsetsII_90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        // Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> emptyList = new ArrayList<>();
        res.add(emptyList);
        // set.add(emptyList);

        for (int num : nums) {
            for (int j = 0, size = res.size(); j < size; j++) {
                List<Integer> list = new ArrayList<>(res.get(j));
                list.add(num);
                res.add(list);
                // set.add(list);
            }
        }
        // return List.copyOf(set);
        // Set<List<Integer>> set1 = res.stream().collect(Collectors.toSet());
        return List.copyOf(new HashSet<>(res));
    }
}
