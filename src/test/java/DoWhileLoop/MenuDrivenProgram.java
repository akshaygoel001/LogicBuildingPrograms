package DoWhileLoop;

import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        int result ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operation to perform('/','%','+','-','*') : ");
        String operation;
        do {
            operation = sc.nextLine();
            if (operation.equalsIgnoreCase("/")){
                result = num1/ num2;
                System.out.println("Result of operation "+operation+" is : "+result);
                System.out.println("Enter operation to perform('/','%','+','-','*') : ");
            } else if (operation.equalsIgnoreCase("%")) {
                result = num1 % num2;
                System.out.println("Result of operation "+operation+" is : "+result);
                System.out.println("Enter operation to perform('/','%','+','-','*') : ");
            }else if (operation.equalsIgnoreCase("+")) {
                result = num1 + num2;
                System.out.println("Result of operation "+operation+" is : "+result);
                System.out.println("Enter operation to perform('/','%','+','-','*') : ");
            }else if (operation.equalsIgnoreCase("-")) {
                result = num1 - num2;
                System.out.println("Result of operation "+operation+" is : "+result);
                System.out.println("Enter operation to perform('/','%','+','-','*') : ");
            }else if (operation.equalsIgnoreCase("*")) {
                result = num1 * num2;
                System.out.println("Result of operation "+operation+" is : "+result);
                System.out.println("Enter operation to perform('/','%','+','-','*') : ");
            }
        }while (!operation.equalsIgnoreCase("exit"));


    }
}
