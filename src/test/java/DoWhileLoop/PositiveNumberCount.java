package DoWhileLoop;

import java.util.Scanner;

public class PositiveNumberCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num;
        int count = 0;
        do {

            num = sc.nextInt();
            if(num > 0){
                count++;
            }
        }while (num > 0);
        System.out.println("Total positive numbers entered are : "+count);
    }
}
