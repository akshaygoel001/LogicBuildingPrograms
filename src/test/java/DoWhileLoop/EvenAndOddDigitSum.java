package DoWhileLoop;

public class EvenAndOddDigitSum {
    public static void main(String[] args) {
        int num = 34567;
        int originalNum = num;
        int evenSum = 0;
        int oddSum = 0;
        do {
            int rem = num % 10;
            if(rem % 2 == 0){
                evenSum = evenSum + rem;
            }
            else {
                oddSum = oddSum + rem;
            }
            num = num / 10;
        }while (num != 0);
        System.out.println("Sum of even digits of number "+originalNum+" is : "+evenSum+" and Sum of odd digits is : "+oddSum);
    }
}
