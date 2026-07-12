package NestedLoopLogic;

import java.util.ArrayList;
import java.util.List;

public class FactorsCount {
    public static void main(String[] args) {
        int n = 10;
        List factors;
        for (int i = 1; i< n ; i++){
            factors = new ArrayList<>();
            for (int j = 1 ; j < n ; j++ ){
                if (i % j == 0 ){
                    factors.add(j);
                }
            }
            System.out.println(i +"->"+factors.size());
        }
    }
}
