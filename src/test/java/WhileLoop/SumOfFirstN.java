package WhileLoop;

public class SumOfFirstN {
    public static void main(String[] args) {
        int N = 100;
        int sum = 0;
        while (N>=0){
            sum = sum + N;
            N--;
        }
        System.out.println(sum);
    }
}
