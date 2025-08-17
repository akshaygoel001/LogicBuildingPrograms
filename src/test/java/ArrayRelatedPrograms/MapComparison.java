package ArrayRelatedPrograms;

import java.util.*;

public class MapComparison {

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        List<Map<Integer, String>> maps = Arrays.asList(treeMap, linkedHashMap, hashMap);
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
        for (int num: nums){
            System.out.println(num);
        }


        for (Map<Integer, String> map : maps) {
            map.put(3, "Banana");
            map.put(1, "Apple");
            map.put(2, "Orange");
        }

        System.out.println("Map :" +maps);
        System.out.println("HashMap: " + hashMap);
        System.out.println("LinkedHashMap: " + linkedHashMap);
        System.out.println("TreeMap: " + treeMap);
    }
}
