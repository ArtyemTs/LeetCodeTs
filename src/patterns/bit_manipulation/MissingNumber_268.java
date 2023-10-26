package patterns.bit_manipulation;

public class MissingNumber_268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumNums = 0;
        for(int i = 0; i < n; i++) {
            sumNums += nums[i];
        }
        //Arethmetic sequences Арифметическая прогрессия формула
        return n * (n + 1) / 2 - sumNums;
    }
}
