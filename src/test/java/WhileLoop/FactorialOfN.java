package WhileLoop;

public class FactorialOfN {
    public static void main(String[] args) {

        int fact = 1;
        int num = 6;
        while(num > 0){
            fact = fact * num;
            num = num -1;
        }
        System.out.println(fact);

    }
}
