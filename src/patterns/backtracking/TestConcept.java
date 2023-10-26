package patterns.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestConcept {
    private static List< List<Integer> > res = new ArrayList< List<Integer> >();
    private static List< Integer > bag = new ArrayList<Integer>();

    public static List<List<Integer>> subsets(int[] nums) {

        makeSubsetFrom( 0, nums );

        return res;
    }

    private static void makeSubsetFrom( int startIndex, int[] nums){

        // Add current subset into final result
        // Java object is passing by refernce, so we have to make a copy here
        System.out.println("makeSubsetFrom +" + bag );
        res.add( new ArrayList<Integer>(bag) );


        //// Base cases aka stop condition:
        // No more element
        if( startIndex == nums.length ){
            System.out.println("RETURN");
            return;
        }

        //// General cases
        // Current level, we choouse element on index i
        System.out.println("startIndex = " + startIndex);
        for( int i = startIndex ; i < nums.length ; i++ ){
            System.out.println("I = " + i);
            System.out.println("aaa");
            System.out.println(bag);

            bag.add( nums[i] );            // put this element into bag

            System.out.println("+++");
            System.out.println(bag);

            makeSubsetFrom( i+1, nums );   // make subset from remaining elements

            System.out.println("bbb");
            System.out.println(bag);

            bag.remove( bag.size()-1);     // undo selection

            System.out.println("---");
            System.out.println(bag);
            System.out.println("END");
        }
        return;

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
//        subsets(nums);
        permute(nums);
        System.out.println("---------");
        System.out.println(res);
    }

    public static List<List<Integer>> permute(int[] nums) {
        backtrack(nums, 0);
        return res;
    }

    private static void backtrack(int[] nums, int current) {
        if (current == nums.length) {
            res.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
            return;
        }

        for (int i = current; i < nums.length; i++) {
            int temp = nums[i];
            nums[i] = nums[current];
            nums[current] = temp;
            backtrack(nums, current + 1);
            temp = nums[i];
            nums[i] = nums[current];
            nums[current] = temp;
        }
    }
}
