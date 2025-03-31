package NumberRelatedPrograms;

import java.util.ArrayList;
import java.util.HashMap;

public class SumOfTwoNumberWithTarget {
    public static void main(String[] args) {

        int[] nums ={2, 7, 11, 15, -2, 4, 6, 8};
        int target = 9;
        ArrayList<int[]> result=new ArrayList<>();
//        for (int i=0;i<nums.length-1;i++) {
//            for (int j = i + 1; j < nums.length-1; j++) {
//                if (nums[i] + nums[j] == target) {
//                    result.add(new int[]{nums[i], nums[j]});
//                }
//            }
//        }
//        System.out.println(result.get(0));
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {//num=2, 7, 11, 15
            int complement = target - num;//7, 2, -2,-6
            if (map.containsKey(complement)) {
                result.add(new int[]{complement, num});//2,7
            }
            map.put(num, 1); // Store the number in the map //map= 2=1, 7=1, 11=1, 15=1
        }
        System.out.println(map);
        for (int[] pair : result) {
            System.out.println(pair[0] + ", " + pair[1]);
        }



    }
}
