package patterns.array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence_128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        int res = 0;

        for (int n : nums) {
            int len = 1;
            int prev = n - 1;
            int next = n + 1;

            while (set.remove(prev)) {
                len++;
                prev--;
            }

            while (set.remove(next)) {
                len++;
                next++;
            }

            res = Math.max(len, res);
        }

        return res;
    }
}
