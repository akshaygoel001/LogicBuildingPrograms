package WhileLoop;

public class EvenSum {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;
        while (n >=1){
            if (n %2 ==0){
                sum = sum +n;
            }
            n--;
        }
        System.out.println(sum);
    }
}
