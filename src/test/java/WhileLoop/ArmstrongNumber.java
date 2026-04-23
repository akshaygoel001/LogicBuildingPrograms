package WhileLoop;

import com.google.common.math.IntMath;
import org.codehaus.groovy.runtime.typehandling.IntegerMath;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 370;
        int sum = 0;
        int originNum = num;
        while (num > 0){
            int rem = num % 10;
            sum = sum + (int)Math.pow(rem,3);
            num = num / 10;
        }
        if (originNum == sum){
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
