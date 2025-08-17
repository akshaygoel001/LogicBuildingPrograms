package LeetCodeProblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicates {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};

        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());//new HashSet<>(Arrays.asList(nums));//

        System.out.println(set.size() < nums.length);

        // Arrays.sort(nums);

        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i] == nums[i - 1]) {
        //         return true;
        //     }
        // }

        // return false;
        // Set<Integer> numSet = new HashSet<>();

        // for (int n : nums) {
        //     if (numSet.contains(n)) {
        //         return true;
        //     }
        //     numSet.add(n);
        // }

        // return false; 
//        Set<Integer> numSet = new HashSet<>();
//        for (int num : nums) {
//            numSet.add(num);
//        }
//        return numSet.size() < nums.length;


        


    }
    
}
