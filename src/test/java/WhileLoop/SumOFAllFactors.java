package WhileLoop;

public class SumOFAllFactors {
    public static void main(String[] args) {
        int num = 26;
        int i = 1;
        int sum = 0;
        while (i < num){
            if (num % i == 0){
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
