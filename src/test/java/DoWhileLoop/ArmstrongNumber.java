package DoWhileLoop;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int originalNum = num;
        int sum = 0;
        do {
            int rem = num % 10;
            sum = sum + (int)Math.pow(rem,3);
            num = num / 10;

        }while (num != 0);
        if (originalNum == sum){
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not an Armstrong number");
        }
    }
}
