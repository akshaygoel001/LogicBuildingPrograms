package WhileLoop;

public class DigitProduct {
    public static void main(String[] args) {
        int num = 1112;
        int product = 1;
        while (num > 1){
            int rem = num % 10;
            product = product * rem;
            num = num / 10;
        }
        System.out.println(product);
    }
}
