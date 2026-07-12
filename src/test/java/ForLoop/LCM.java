package ForLoop;

import java.util.ArrayList;
import java.util.List;

public class LCM {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 6;
        List factors = new ArrayList();
        for(int i = 1; i <= Math.max(num1,num2); i++){
            if (num1 % i == 0 && num2 % i == 0){
                factors.add(i);
            }
        }
        int hcf = (int)factors.get(factors.size()-1);
        System.out.println((num1 * num2)/hcf);
    }
}
