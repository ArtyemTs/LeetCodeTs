package patterns.dynamic_programming;

public class ClimbingStairs_70 {

    //concept of the Fibonacci series.

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }

        int prev = 1;
        int curr = 2;

        for (int i = 3; i <= n; i++) {
            int temp = curr;
            curr += prev;
            prev = temp;
        }

        return curr;
    }
}
