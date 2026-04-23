package WhileLoop;

import java.util.ArrayList;
import java.util.List;

public class HighestCommonFactor {
    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 60;
        List factors = new ArrayList<>();

        int i = 1;
        while (i < num1){
            if (num1 % i == 0 && num2 % i == 0){
                factors.add(i);
            }
            i++;
        }
        System.out.println(factors.get(factors.size()-1));
    }
}
