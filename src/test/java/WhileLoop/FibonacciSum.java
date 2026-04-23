package WhileLoop;

public class FibonacciSum {
    public static void main(String[] args) {
        // 1 2 3 5 8 13 21 34 55 89
        int n = 10;
        int first = 1;
        int prev = 0;
        int sum = 0;
        while (n > 0){
            int next = first + prev;//1
            prev = first;
            first = next;
            sum = sum + next;
            n--;
        }
        System.out.println(sum);
    }
}
