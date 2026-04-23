package WhileLoop;

public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        String revNum = "";
        int originalNum = num;
        while (num > 0){
            int rem = num % 10;
            revNum = revNum + rem;
            num = num / 10;
        }
        if (originalNum == Integer.parseInt(revNum)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
