package DoWhileLoop;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 23456;
        String revNum = "";
        do{
            int rem = num % 10;
            revNum = revNum + rem;
            num = num / 10;

        }while (num != 0);
        System.out.println(revNum);
    }
}
