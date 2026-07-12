package ForLoop;

public class FibonacciSum {
    public static void main(String[] args) {
        int first = 1;
        int prev = 0;
        int next;
        int n = 10;
        int sum = 0;
        //System.out.print(prev+" "+first+" ");
        for (int i = 0 ; i < n ; i++){
            next = prev + first;// 1
            prev = first;// 1
            first = next;// 1
            sum = sum + next;

        }
        System.out.print(sum);

    }
}
