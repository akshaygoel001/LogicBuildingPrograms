package NumberRelatedPrograms;

import java.util.HashMap;
import java.util.Map;

public class TwoSumIndexes {

    public static int[] main(String[] args) {

        int[] nums ={2,7,11,15};
        int target = 9;
        int[] result={};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];//9-2=7,9-7=2, 9-11=-2
            if (map.containsKey(complement)) {//
                return new int[]{ map.get(complement), i };
                //System.out.println(result[1]);
            }
            map.put(nums[i], i);//2,0 ... 7,1
        }
        // Return an empty array if no solution is found
        return new int[]{};


    }
}
