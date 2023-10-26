package patterns.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(numbers.contains(nums[i])) {
                return true;
            }
            numbers.add(nums[i]);
        }
        return false;
    }
}
