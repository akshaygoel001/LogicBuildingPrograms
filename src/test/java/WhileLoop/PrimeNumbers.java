package WhileLoop;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 1;
        while (n <= 100){
            int count = 0;
            int j = 1;
            while (j <= n){
                if (n % j == 0){
                    count++;
                }
                j++;
            }
            if (count <= 2){
                System.out.print(n+ " ");
            }
            n++;
        }
    }
}
