package WhileLoop;

public class LargestDigitInNumber {
    public static void main(String[] args) {
        int num = 345619;
        char numArray[] = String.valueOf(num).toCharArray();
        int i = 1;
        char max = numArray[0];
        while (i < numArray.length){
            if (numArray[i] > max){
                max = numArray[i];
            }
            i++;
        }
        System.out.println(max);
    }
}
