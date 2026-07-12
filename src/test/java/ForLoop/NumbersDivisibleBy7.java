package ForLoop;

public class NumbersDivisibleBy7 {
    public static void main(String[] args) {
        int a = 1;
        int b = 100;
        for (int i = a ; i<=b ; i++){
            if (i % 7 == 0){
                System.out.println(i);
            }
        }
    }
}
