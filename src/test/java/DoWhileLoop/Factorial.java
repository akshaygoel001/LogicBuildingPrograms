package DoWhileLoop;

public class Factorial {
    public static void main(String[] args) {
        int fact = 1;
        int num = 3;
        do{
            fact = fact * num;
            num = num -1;
        }
        while(num > 0);
        System.out.println(fact);
    }
}
