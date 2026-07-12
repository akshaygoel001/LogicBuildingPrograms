package ForLoop;

public class GivenNumberFactors {
    public static void main(String[] args) {
        int num = 34;
        for (int i = 1 ; i< num ; i++){
            if (num % i == 0){
                System.out.println(i);
            }
        }

    }
}
