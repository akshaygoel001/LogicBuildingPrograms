package WhileLoop;

public class PerfectNumber {
    public static void main(String[] args) {
        long num = 33550336;
        int sum = 0;
        int divisor = 1;
        while (divisor < num){
            if (num % divisor == 0){
                sum = sum + divisor;
            }
            divisor++;
        }
        if (num == sum){
            System.out.println("Perfect Number");
        }
        else {
            System.out.println("Not a Perfect Number");
        }
    }
}
