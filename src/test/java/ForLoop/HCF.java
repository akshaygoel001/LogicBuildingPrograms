package ForLoop;

import java.util.ArrayList;
import java.util.List;

public class HCF {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;
        List factors = new ArrayList();
        for(int i = 1; i <= Math.max(num1,num2); i++){
            if (num1 % i == 0 && num2 % i == 0){
                factors.add(i);
            }
        }
        System.out.println(factors.get(factors.size()-1));
    }
}
