package WhileLoop;

public class DivisibleBy7 {
    public static void main(String[] args) {
        int a = 1;
        int b = 100;
        while (a < b){
            if(a % 7 == 0 ){
                System.out.print(a+" ");
            }
            a++;

        }
    }
}
