package patterns.bit_manipulation;

import java.util.Arrays;

public class CountingBits_338 {
    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];
        ans[0] = 0;

        for (int i = 1; i < ans.length; i++) {
//            int an = ans[i];
//            int ant = ans[i >> 1];
            ans[i] = ans[i >> 1] + i % 2;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(7)));
    }
}
