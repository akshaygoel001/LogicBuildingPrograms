package DoWhileLoop;

public class DigitsSum {
    public static void main(String[] args) {
        int num = 34567;
        int originalNum = num;
        int sum = 0;
        do {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }while (num != 0);
        System.out.println("Sum of digits of number "+originalNum+" is : "+sum);
    }
}
