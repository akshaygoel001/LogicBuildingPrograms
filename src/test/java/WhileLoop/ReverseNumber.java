package WhileLoop;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 56721;
        String revNum = "";
        while (num > 0){
            int rem = num % 10;
            revNum = revNum + rem;
            num = num / 10;
        }
        System.out.println(revNum);
    }
}
