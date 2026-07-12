package ForLoop;

public class FactorialSeries {
    public static void main(String[] args) {
        //int num = 3;
        int n = 10;

        for (int num = 1 ; num<= n ; num++){
            int fact = 1;
            for(int i = 1 ; i <= num ; i++){
                fact = fact * i;
            }
            System.out.println(fact);

        }
    }
}
