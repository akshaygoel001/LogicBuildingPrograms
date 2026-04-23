package WhileLoop;

import org.codehaus.groovy.ast.stmt.WhileStatement;

public class SmallestDigitInNumber {
    public static void main(String[] args) {
        int num = 345610;
        char numArray[] = String.valueOf(num).toCharArray();
        int i = 1;
        char min = numArray[0];
        while (i < numArray.length){
            if (numArray[i] < min){
                min = numArray[i];
            }
            i++;
        }
        System.out.println(min);

    }
}
