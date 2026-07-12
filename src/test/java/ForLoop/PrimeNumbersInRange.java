package ForLoop;

public class PrimeNumbersInRange {
    public static void main(String[] args) {

        for(int num = 1 ; num<= 100 ; num++){
            int count = 1;
            for(int i = 1 ; i<=(num/2); i++){
                if(num % i == 0){
                    count++;
                }
            }
            if (count <= 2){
                System.out.println(num);
            }
        }
    }
}
