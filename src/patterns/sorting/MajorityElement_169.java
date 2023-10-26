package patterns.sorting;

public class MajorityElement_169 {
    public int majorityElement(int[] nums) {
        int cand = -1; //canditate
        int votes = 0;

        for (int i : nums) {
            if (votes == 0) {
                cand = i;
            }
            if (i == cand) {
                votes++;
            } else {
                votes--;
            }
        }
        return cand;
    }
}
