package WhileLoop;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int first = 1;
        int prev = 0;
        System.out.println("Fibonacci Series is as follows : ");
        //System.out.print(prev +" "+ first +" ");
        while (n > 0){
            int next = first + prev;
            prev = first;
            first = next;
            System.out.print(next + " ");
            n--;
        }
    }
}
