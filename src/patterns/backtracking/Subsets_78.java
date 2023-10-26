package patterns.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets_78 {
//    List<List<Integer>> res = new ArrayList<>();
//    List<Integer> cur = new ArrayList<>();
//
//    public List<List<Integer>> subsets(int[] nums) {
//        backtrack(nums, 0);
//        return res;
//    }
//
//    private void backtrack(int[] nums, int idx) {
//        res.add(new ArrayList<>(cur));
//        if (idx == nums.length) {
//            return;
//        }
//        for (int i = idx; i < nums.length; i++) {
//            cur.add(nums[i]);
//            backtrack(nums, i + 1);
//            cur.remove(cur.size() - 1);
//        }
//        return;
//    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> emptyList = new ArrayList<>();
        res.add(emptyList);

        for (int num : nums) {
            for (int i = 0, size = res.size(); i < size; i++) {
                List<Integer> elem = new ArrayList<>(res.get(i));
                elem.add(num);
                res.add(elem);
            }
        }
        return res;
    }
}
