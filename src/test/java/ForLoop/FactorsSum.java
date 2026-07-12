package ForLoop;

public class FactorsSum {
    public static void main(String[] args) {
        int num = 34;
        int sum = 0;
        for (int i = 1 ; i< num ; i++){
            if (num % i == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
