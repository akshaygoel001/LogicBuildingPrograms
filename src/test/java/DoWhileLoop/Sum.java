package DoWhileLoop;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n;
        int sum = 0;
        do {
            n = sc.nextInt();
            sum = sum + n;
        }while (n != 0);
        System.out.println("Sum of entered numbers is : "+sum);
    }
}
