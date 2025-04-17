package NumberRelatedPrograms;

import java.util.Scanner;

public class SufraceAreaOfHouse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length, width & height of the house:");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.println("Enter the number, length & width of windows:");
        int windows = sc.nextInt();
        int winLength = sc.nextInt();
        int winWidth = sc.nextInt();
        System.out.println("Enter the number, length & width of doors:");
        int doors = sc.nextInt();
        int doorLength = sc.nextInt();
        int doorWidth = sc.nextInt();
        double areaOfHouse = 2 * (length * width + length * height + width * height);
        double areaOfWindow = winLength * winWidth;
        double areaOfDoor = doorLength * doorWidth;
        double totalAreaOfWindow = areaOfWindow * windows;
        double totalAreaOfDoor = areaOfDoor * doors;
        double totalArea = areaOfHouse - (totalAreaOfWindow + totalAreaOfDoor);
        System.out.println("The total area of the house is: " + areaOfHouse);




    }



}
