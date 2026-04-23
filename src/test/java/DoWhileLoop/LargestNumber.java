package DoWhileLoop;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");// 3 4 5 1 0
        int max = 0;
        int n;
        do {
            n = sc.nextInt();
            if (n > max){
                max = n;
            }


        }while (n != 0);
        System.out.println("Largest number among all inputs is : "+ max);

    }
}
