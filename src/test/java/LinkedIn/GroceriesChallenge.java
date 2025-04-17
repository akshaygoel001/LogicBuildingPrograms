package LinkedIn;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceriesChallenge {


    public static void main(String[] args) {

        ArrayList<String> groceries = new ArrayList<>();
        groceries.add("milk");
        groceries.add("bread");
        groceries.add("eggs");
        groceries.add("cheese");
        groceries.add("butter");
        System.out.println("Grocery List: " + groceries.toString());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the grocery item you want to search or \"quit\" to exit");
        String searchItem = scanner.nextLine();
        boolean found = false;
        while (searchItem.equalsIgnoreCase("quit") == false) {
            for (String item : groceries) {
                if (item.equalsIgnoreCase(searchItem)) {
                    found = true;
                    break;
                }
            }
            if (found == false) {
                groceries.add(searchItem);
            }
            System.out.println("Enter the grocery item you want to search or \"quit\" to exit:");
            searchItem = scanner.nextLine();
        }

        System.out.println("Final Grocery List: " + groceries.toString());





    }
}
