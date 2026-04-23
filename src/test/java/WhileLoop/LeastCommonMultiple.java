package WhileLoop;

import java.util.ArrayList;
import java.util.List;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 45;
        List factors = new ArrayList<>();

        int i = 1;
        while (i < num1){
            if (num1 % i == 0 && num2 % i == 0){
                factors.add(i);
            }
            i++;
        }
        System.out.println((num1 / ((int)factors.get(factors.size()-1)) ) * num2);
    }
}
