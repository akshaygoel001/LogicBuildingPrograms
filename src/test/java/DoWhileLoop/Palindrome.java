package DoWhileLoop;

public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        int originalNum = num;
        String revNum = "";
        do {
            int rem = num % 10;
            revNum = revNum + rem;
            num = num / 10;

        }while (num != 0);
        if (originalNum == Integer.parseInt(revNum)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}
