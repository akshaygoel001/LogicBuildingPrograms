package WhileLoop;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        int n = 6;
        int count = 0;
        int j = 1;
        while (j <= n){
            if (n % j == 0){
                count++;
            }
            j++;
        }
        if (count <= 2){
            System.out.print("Prime Number");
        }
        else {
            System.out.println("Not a Prime Number");
        }
    }
}
